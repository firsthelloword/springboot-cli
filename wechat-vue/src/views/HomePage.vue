<template>
    <div class="top-contain-box">
        <div class="contain-box">
            <div class="my-info-box">
                <my-info></my-info>
            </div>
            <Resizable class="contact-box" v-model:width="width" v-model:height="height">
                <contact-info></contact-info>
            </Resizable>
            <Resizable class="chat-box" v-model:width="width">
                <chat-index></chat-index>
            </Resizable>
            <!-- <div class="contact-box">
                <contact-info></contact-info>
            </div>
            <div class="chat-box">
                <chat-index></chat-index>
            </div> -->
        </div>
    </div>
</template>
    
<script setup lang='ts'>
import ChatIndex from "@/components/ChatIndex.vue"
import ContactInfo from "@/components/ContactInfo.vue";
import MyInfo from "@/components/MyInfo.vue";
import Resizable from 'vue-resizable';
let width = 100
let height = "100vh" 
</script>
    
<style scoped>
.top-contain-box{
    width: 100%;
    height: 100vh;
    background-color: #57AC6D;
}
.contain-box {
    display: flex;
    justify-content: center;
    align-items: center;
    max-width: 1400px;
    margin: 0 auto;
}

.my-info-box {
    background-color: rgb(229, 229, 230);
    height: 100vh;
    min-width: 60px;
}

.chat-box {
    background-color: #F3F3F3;
    height: 100vh;
    width: 100%;
}

.contact-box {
    background-color: #F7F7F7;
    height: 100vh;
    min-width: 260px;
    max-width: 310px;
}
</style>