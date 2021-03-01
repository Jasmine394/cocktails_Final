<template>
    <div class="main">

        <div class="header">
            <h1 class="title">Drinks ON US</h1>

            
            
         
        </div>

        <p>Click on Description for additional details.</p>


        <div class="content">
            <table id="measure" class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th><a class="description">Description</a></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="measure in measure" :key="measure.id">
                        <td>{{measure.measure}}</td>
                        
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Measure",
    data: () => ({
        measure:[]
    }),
    async mounted() {
        console.log('measure mounted being')
        const{data} = await this.$http.get('http://localhost:8080/api/measure');
        console.log('measures mounted data', data)
        this.measure = data;
    }
}
</script>
<style scoped>

.title{
    color: purple;  
}
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.title {
    text-align: center;
}

p {
    font-style: italic;
    color: darkblue;
    text-align: center;
    margin-top: .5em;
    margin-bottom: .5em;
}

.description:hover {
    color: purple;
}

.description {
      color: skyblue;
}
</style>

