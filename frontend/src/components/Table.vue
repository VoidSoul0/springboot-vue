<template>
  <div>
    <table>
      <tr>
        <th>id</th>
        <th>名字</th>
        <th>性别</th>
        <th>年龄</th>
      </tr>

      <tr v-for="p in Person">
        <td>{{p.id}}</td>
        <td>{{p.name}}</td>
        <td>{{p.sex}}</td>
        <td>{{p.age}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
  export default {
    name: "Table",
    data() {
      return {
        Person: [
          {id:0, name: '测试数据', sex: '男', age:0}
        ]
      }
    },
    created() {
      const _this = this;
      // 前后端路径分离访问，需要后端配置跨域支持
      axios.get("http://localhost:8080/person/listAll").then(response => _this.Person = response.data)
      // 前端编译生成文件放置于后端static访问
      // axios.get("/person/listAll").then(response => _this.Person = response.data)
    }
  }
</script>

<style scoped>
table {
  margin: auto;
  text-align: left;
}
</style>
