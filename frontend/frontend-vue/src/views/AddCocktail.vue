<template>
    <div>
        <h1 class="title">Add Cocktail</h1>

        <div class="field">
            <label class="label">Cocktail: Name</label>
            <div  class="control">
                <input class="input" type="text" v-model="cocktail.name" placeholder="Add Cocktail Name"/>
            </div>
       </div>

    

        <div class="field">
            <label class="label">Cocktail: Instructions</label>
            <div class="control">
                <input class="input" type="number" v-model="cocktail.instructions" placeholder="write instructions"/>
            </div>
        </div>

        <div class="field">
            <label class="label">Cocktail: Image</label>
            <div class="contorl">
                <input class="input" type="text" v-model="cocktail.thumb" placeholder="enter picture"/>
            </div>
        </div>

     

            <div class="field is-grouped">
                <div class="control">
                    <button @click="cancel" class="button">Cancel</button>
                </div>
                <div class="control">
                    <button @click="save" class="button is-primary">Save</button>
                </div>
            </div>
        </div>
</template>

<script>
export default {
    name: 'AddCocktail',
    data: () => ({
        cocktiail: {
             id: "",
            name: "",
            instructions: "",
            drink_thumb: ""
        }
    }),
    methods: {
        async save() {
            console.log('AddCocktail.save() cocktail=', this.cocktail)
            const response = await this.$http.post('http://localhost:8080/api/cocktails', this.cocktiail);
            console.log('AddCocktail.save() response=', response);
            this.$router.push({path: '/cocktails'})
        }, 
        cancel() {
            this.$router.push({path: '/cocktails'})
        }, 
        async getCocktail() {
            const data = await this.$http.get('http://localhost:8080/api/cocktails');
            console.log('getCocktails data', data)
            return data;
        }
    }
}
</script>

<style scoped>
.button {
    float: right;
    margin-top: 10px;
    margin-bottom: 10px;
}
.button:hover {
    background-color: blueviolet;
}

.button.is-primary {
    background-color: darkblue;
}

.button.is-primary:hover {
    background-color: purple;
}
.title {
    color: black;
}

</style>