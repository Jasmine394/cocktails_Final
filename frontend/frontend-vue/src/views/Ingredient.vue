<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Ingredients</h1>
            
        </div>

         

        <div class="content">
            <table id="ingredient" class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Category</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="ingredient in ingredients" :key="ingredient.id">
                        <td>{{ingredient.name}}</td>
                        <td>{{ingredient.category}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    data: () => ({
       ingredients:{},
    }),

    methods: {
        ingredientDetail(ingredientId){
            this.$router.push('ingredient/' + ingredientId);
        }
    },

    async mounted() {
        console.log('ingredients being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/ingredient');
        console.log('ingredients mounted data', data)
        this.ingredients = data;
    }
}
</script>

<style scoped>

.title{
    color: darkblue;  
}
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.title {
    text-align: center;
}

</style>