import { createApp } from 'vue'
import { createPinia } from 'pinia'
const pinia = createPinia()
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import './style.css'
import App from './App.vue'
const app = createApp(App)
app.use(ElementPlus)
app.use(router)
app.use(pinia)
app.mount('#app')
