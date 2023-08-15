import http from '../utils/http'


//文章保存
export function sumAdd(data){
    return http.post('/add', data)
}


// 获取总数