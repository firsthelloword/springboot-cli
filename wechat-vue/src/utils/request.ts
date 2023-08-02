import axios from "axios"
const httpUtils = axios.create({
 baseURL: 'http://119.91.60.149:8881/',
//  baseURL: 'http://127.0.0.1:8881/',
  timeout: 5000,
});

export default httpUtils