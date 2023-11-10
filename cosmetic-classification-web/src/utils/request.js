import axios from 'axios'

const service = axios.create({
    baseURL: import.meta.env.BASE_URL,
    timeout: 3000,
    headers: {'Content-Type': 'application/json;charset=utf-8'}
})

service.interceptors.request.use(
    (config) => {
        return config
    },
    (error) => {
        return Promise.reject(error)
    }
)

service.interceptors.response.use(
    (response) => {

    },
    (error) => {

    }
)

export default service