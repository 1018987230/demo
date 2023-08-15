<template>
  <el-input v-model="num1" placeholder="请输入内容"></el-input>
  <el-input v-model="num2" placeholder="请输入内容"></el-input>
  <el-button v-model="sum" type="danger" @click="send()">发送</el-button>
</template>

<script>
import { sumAdd } from "../utils/api.js";
export default {
  name: "App",

  data() {
    return {
      num1: "",
      num2: "",
      sum: "",
    };
  },
  methods: {
    send() {
      sumAdd(data).then((res) => {
        if (res.data.code == 200) {
          this.sum = res.data.data;
        }
      });
    },
  },
};
</script>
