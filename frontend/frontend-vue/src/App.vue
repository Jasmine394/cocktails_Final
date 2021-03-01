<template>
  <div id="app">
    <div id="nav">
      <router-link to="/cocktail">Races</router-link> |
      <router-link to="/ingredient">Classes</router-link> |
       <router-link to="/cocktailingredient">Armor</router-link> |
      <router-link to="/measure">Weapons</router-link> 
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
  color: #2c3e50;
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
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #5b7eb8;
}
