<template>
    <form class= "search">
        <input type="text" :value="cocktail_name" @keyup="handleChange"/>
        <input @click="handleSubmit" type="submit" value="Search" />
    </form>    
</template>

<script>
import {ref } from '@vue/api/cocktails';
export default {
    name: 'Search',
    props: ['search'],
    setup({search}, {emit}){
        const cocktail_name = ref(search);
        
        return {
            cocktail,
            handleSumbit(event){
                event.preventDefault();
                emit('search', cocktail_name.value);
            },
            handleChange(event) {
                cocktail_name.value = event.target.value
            }
        }
    }
    
}
</script>