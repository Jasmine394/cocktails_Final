<template>
    <div class="main">
            <div class="header">
            <h1 class="title">Drinks On US: Cocktail ingredients</h1>
        </div>

        
        <div class="content">
            <table id= "cocktails" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Cocktail ID</th>
                        <th>Ingredient ID</th>
                        
                    </tr>
                </thead>

                <tbody>
                    
                      
                  
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Cocktailingredient",
    data: () => ({
        cocktailingredients:[],
    }),
    
    
    async mounted() {
        console.log('cocktailingrediet mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/cocktailingredient');
        console.log('cocktailingredient mounted data', data)
        this.cocktailingredient = data;
    }
}
</script>

<style scope>
.button {
    margin-left: 45%;
    margin-top: 10px;
    margin-bottom: 10px;
    background-color: darkblue;
    color: white;    
}

.button:hover {
    background-color: skyblue;
    color: white;
}

.title{
    color: darkblue;  
}
.table {
    background-color: darkcyan;

}

.title {
    text-align: center;
}


</style>