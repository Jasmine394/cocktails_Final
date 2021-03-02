<template>
  <div id="app">
    <div id="nav">
      <router-link to="/cocktails">cocktails</router-link> |
      <router-link to="/ingredients">ingredient</router-link> |
       <router-link to="/cocktailingredient">cocktail Ingredient</router-link> |
      <router-link to="/measure">measures</router-link> 
    </div>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #1a2938;
}

#nav {
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    width: 50%;
    margin-right: 35%;
    margin-left: 25%;
    margin-bottom: 3em;
}

#nav a {
  font-weight: bold;
  color: #121e2b;
}

#nav a.router-link-exact-active {
  color: #5b7eb8;
}
