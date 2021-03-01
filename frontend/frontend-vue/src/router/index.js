import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/cocktail',
    name: 'Cocktails',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import( '../views/Cocktails.vue')
  },
  {
    path: '/ingredient',
    name: 'ingredients',
    component: () => import ('../views/ingredients.vue')
  },
  {
    path: '/ingredient/:id',
    name: 'ingredients',
    component: () => import ('../views/IngredientDetail.vue')
  },
  
  {
    path: '/cocktailingredient',
    name: 'Cocktailingredient',
    component: () => import('../views/Cocktailingredient.vue')
  }

]

const router = new VueRouter({
  routes
})

export default router
