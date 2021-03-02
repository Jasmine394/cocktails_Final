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
    name: 'Ingredient',
    data:  () => ({
       ingredients:[]
    }),


    async mounted() {
        console.log('ingredients being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/ingredients');
        console.log('ingredients mounted data', data)
        this.ingredients = data;
    }
}
</script>

<style scoped>

.title{
    color: darkblue;  
}


.title {
    text-align: center;
}
.table {
    background-color: darkcyan;

}
</style>