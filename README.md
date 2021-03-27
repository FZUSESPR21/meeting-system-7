# meeting-system-7
**博客链接**：https://www.cnblogs.com/zmxyq/p/14586999.html

**作业要求**：https://edu.cnblogs.com/campus/fzu/FZUSESPR21/homework/11885

**小组成员**：

|学号|Github地址|博客园地址|
|:----|:----|:----|
|221801125|[https://github.com/xuyaaaaaaaaaaabi](https://github.com/xuyaaaaaaaaaaabi?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/yabi/](https://www.cnblogs.com/yabi/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801104|[https://github.com/YuhanTse](https://github.com/YuhanTse?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/xyh-Tse/](https://www.cnblogs.com/xyh-Tse/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801209|[https://github.com/ccreater222](https://github.com/ccreater222?fileGuid=vCcXcG6Jtkx6qYrX)|[http://cnblogs.com/ccreater](http://cnblogs.com/ccreater?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801321|[https://github.com/yangyu-huang](https://github.com/yangyu-huang?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/yangyu-huang/](https://www.cnblogs.com/yangyu-huang/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801411|[https://github.com/LilCrab0921](https://github.com/LilCrab0921?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/Cherry-XPX/](https://www.cnblogs.com/Cherry-XPX/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801230|[https://github.com/camocd](https://github.com/camocd/?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/w-wwh/](https://www.cnblogs.com/w-wwh/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801231|[https://github.com/pufferandrr](https://github.com/pufferandrr?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/nafupblog](https://www.cnblogs.com/nafupblog?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801215|[https://github.com/TarsSE](https://github.com/TarsSE?fileGuid=vCcXcG6Jtkx6qYrX)|[https://www.cnblogs.com/tarsss/](https://www.cnblogs.com/tarsss/?fileGuid=vCcXcG6Jtkx6qYrX)|
|221801222|[https://github.com/Fzuerzmj](https://github.com/Fzuerzmj?fileGuid=vCcXcG6Jtkx6qYrX)|https://www.cnblogs.com/fzuerzmj|

**环境：**

- 前端：Vue.js+ElementUI
- 后端：SpringBoot+Mybatis+Jpa

# 题目背景

**用户故事：**

- 普通参会者小张：

  小张一心科研，兴趣广泛，此时一个会议正在如火如荼筹备中，小张想要参加这个会议的某些论坛，于是他想选择一些想参加的分论坛后，就能够只关注这些选择的论坛的各种信息，以免错过什么重要通知。

- 会议主席：

  会议主席比较关注会议的参会情况。作为会议主席，如果此次参会的人数多，当然是对该会议的一种肯定！

- 分论坛主席：

  专注某个领域的大佬，当然也非常看重本论坛的关注度！每天打开网站就是看又收获了多少参会者，来决定今天吃什么馅的饺子。还会时不时亲自发布一些关于本论坛的”重大利好“。

- 秘书：

  老工具人了，需要给分论坛主席收集参会者信息，并负责传达分论坛主席的意志。

## 基础功能

1. 会议网站展示会议议程和分论坛信息，包括分论坛议题、主席和召开时间等；
2. 普通参会者注册时需选择参加的分论坛，可以选择参加一个或多个分论坛；
3. 会议主席、分论坛主席登录系统后，能了解会议、分论坛的参会人数；秘书可以获取全部参会者信息；分论坛主席、秘书负责发布分论坛相关消息通知；
4. 普通参会者注册通过后，登录系统后，将收到所选择参加分论坛的信息推送。

