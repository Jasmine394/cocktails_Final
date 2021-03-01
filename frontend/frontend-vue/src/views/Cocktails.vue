<template>
  <div class="main">
      <div clas="header">
    <h1 class="title"> Cocktails</h1>
  </div>

  <router-link to="/cocktail" tag="button" class="button is-primary">Add Cocktail</router-link>

    <div class="content">
        <table id="cocktails" class="table">
          <thead>
              <tr>
                  <th>#</th>
                  <th>Name</th>
                  <th>Instructions</th>
                  <th>Image</th>
                </tr>
            </thead>

            <tbody>
                <tr v-for="cocktail in cocktails" :key="cocktail.id">
                <td>{{cocktail.id}}</td>
                <td>{{cocktail.Name}} </td>
                <td>{{cocktail.instructions}} {{cocktail.instructions}}</td>
                <td>{{cocktail.thumb}}</td>
              </tr>
            </tbody>
        </table>
      </div>
  </div>
</template>

<script>
export default {
  name: 'Cocktails',
  data: () => ({
    cocktails: []
  }),
  async mounted(){
    console.log('Cocktails mounted being')
    const{ data } = await this.$http.get('http://localhost:8080/api/cocktails');
    console.log('Cocktails mounted data', data)
    this.cocktail = data;
  }

}
</script>

<style scoped>
button{
  float: right;
}

</style>