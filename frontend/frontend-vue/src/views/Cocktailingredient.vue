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
                    <tr v-for="player in players" :key="player.id">
                        <td>{{player.playerName}}</td>
                        <td>{{player.characterName}}</td>
                        <td>{{player.races.name}}</td>
   
                      
                        
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Cocktailingredient",
    data: () => ({
        cocktailingredient:[],
    }),
    
    
    async mounted() {
        console.log('cocktailingrediet mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/ingredient');
        console.log('ingredient mounted data', data)
        this.ingredient = data;
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
    background-color: green;
    color: white;
}

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