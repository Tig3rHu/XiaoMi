<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <!--<link href="../css/base.min.css" rel="stylesheet">-->
        <!--<link href="../css/index.min.css" rel="stylesheet">-->
        
        <link rel="stylesheet" href="${base}/static/css/youyou/partialviewslider.css">

        <style>
                .site-category-list .category-item-active .children {
                        display: block !important;
                }

                .site-header .nav-item-active {
                        position: relative;
                }

                .nav-list .nav-list-active .item-children {
                        display: block !important;

                }

                .site-topbar .topcart-cart-active .cart-mini {
                        color: #ff6700;
                        background: #fff;
                }

                .good-top-left {
                        display: none;
                }

                .img1 {
                        background: url("${base}/static/images/youyou/sales1.png") no-repeat center;
                }

                .img2 {
                        background: url("${base}/static/images/youyou/sales2.png") no-repeat center;
                }

                .img3 {
                        background: url("${base}/static/images/youyou/sales3.png") no-repeat center;
                }

                .img4 {
                        background: url("${base}/static/images/youyou/sales4.png") no-repeat center;
                }

                .img5 {
                        background: url("${base}/static/images/youyou/sales5.png") no-repeat center;
                }

                .img6 {
                        background: url("${base}/static/images/youyou/sales6.png") no-repeat center;
                }

                .material-icons {
                        display: none;
                }

                .active {
                        width: 1050px !important;
                }

                .partialViewSlider-backdrop {
                        height: 0;
                }

                .partialViewSlider-wrapper {
                        height: 460px;
                }

                .home-hero-container {
                        height: auto;
                }
                div{
    display: block;
}
a{
    text-decoration: none;
    color:rgb(117, 117, 117);
}
img{
    border:0px;
}
p,pre{
    margin: 1em 0;
}
/*.site-header .container {
    position: relative;
 }  */
.container1{
         width: 1226px;
         margin-right: auto;
         margin-left: auto;
 }
 ul,li,p,em{
     list-style-type: none;
     margin: 0;
     padding: 0;
 }
 .site-bn-bar{
     background-image:url("${base}/static/images/youyou/leftNav/cms_15319985577162_vSYKt.jpg");
     width: 100%;

     background-repeat: no-repeat;
     background-position: center 0;
 }
 .site-bn-bar .site-bn-bar-link{
    display:block;
    width: 100%;
    height: 120px;
    text-indent: -9999em;

 }
/*顶部导航条*/
 .site-topbar{
    /* width: 1423px;*/
     height: 40px;
     z-index: 30;
     position: relative;
     color: #b0b0b0;
     font-size: 12px;
     background: #333;
 }
 .site-topbar a{
     color: #b0b0b0;
 }
 .site-topbar .sep{
     margin: 0 .5em;
     color: #424242;
 }
 .topbar-nav{
     float: left;
     height: 40px;
     line-height: 40px;
     overflow: hidden;
 }
 .topbar-cart,.topbar-info{
     position: relative;
     float: right;
     height: 40px;
     line-height: 40px;
 }
.site-topbar .topbar-cart{
    width: 120px;
    margin-left:15px;
}
.site-topbar .cart-mini{
    position: relative;
    z-index: 32;
    display: block;
    height: 40px;
    line-height: 40px;
    text-align: center;
    color: #b0b0b0;
    background: #424242;
}
.site-topbar .cart-menu{
    display: none;
    position: absolute;
    right:0;
    top:40px;
    z-index:31;
    width: 316px;
    height: 100px;
    padding: 15px 0 0;
    color:#424242;
    background:#fff;
    box-shadow: 0px 0px 10px 5px #aaa;
}
.site-topbar .cart-menu .loading{
    margin:15px 20px 20px 5px;
    text-align: center;
    font-size: 15px;
}
/*导航条*/
 .site-header{
    /* width: 1423px;*/
     height: 100px;
     position: relative;
     z-index: 20;
     
    /* background: rgb(167, 21, 21);*/
 }
 /*导航栏的小米LOGO*/
 .site-header .header-logo{
     float: left;
     width: 62px;
     margin-top:22px;
 }
 .site-header .logo{
     position: relative;
     display: block;
     width: 55px;
     height: 55px;
     overflow: hidden;
     background: #ff6700;
 }
 .site-header .logo img{
    width: 55px;
     height: 55px;
 }
 /*导航栏列表*/
 .site-header .header-nav{
     float: left;
     width: 850px;
     
 }
 .site-header .nav-list{
    /* position: relative;*/
     z-index: 10;
     float: left;
     width: 820px;
     height: 88px;
     margin: 0px;
     padding: 12px 0 0 30px;
     list-style-type: none;
     font-size: 16px;
 }
 /*垂直导航栏*/
 .site-header .nav-category{
     position: relative;
     float: left;
     width: 142px;
     height: 88px;
     padding-right: 15px;
    /* background: rgb(167, 21, 21);*/
 }
 .site-header .header-nav .link-category{
     display: block;
     padding: 26px 0 36px;
     text-align: right;
     color:#333;
     visibility: hidden;
 }
 .site-header .site-category{
     display: block;
 }
 .site-header .site-category{
   /*  display: none;*/
     position: absolute;
     top:88px;
     left: -92px;
     z-index: 21;
     width: 234px;
     height: 440px;
     font-size: 14px;
 }
 .site-header .site-category .site-category-list{
     height: 420px;
     border: 0px;
     color: #fff;
     background: #333;
     /*background: rgba(0, 0, 0, 0.6);*/
     margin: 0px;
     padding: 20px 0;
 }
 li{
     display: list-item;
 }
 .site-header .site-category .site-category-list .title{
     color:#fff;
     position: relative;
     display: block;
     padding-left: 30px;
     height: 42px;
     line-height: 42px;
 }
 .site-header .site-category .site-category-list .title i{
     position: absolute;
     top:12px;
     right: 20px;
     font-size: 16px;
     line-height: 16px;
 } 
 .site-header .site-category .site-category-list .children-col-4{
     width: 992px;
 }
 .site-header .site-category .site-category-list .children{
     display: none;/*这里是要隐藏*/
     position: absolute;
     left: 234px;
     top:0;
     z-index: 24;
     height: 458px;
     border: 1px solid #e0e0e0;
     border-left: 0;
     background: #fff;
 }
 .site-header .site-category .site-category-list .children-col-4 .children-list-col{
     float: left;
     width: 248px;
 }
 .site-category-list .children-list{
     height: 458px;
     margin: 0;
     padding: 2px 0;
     list-style-type: none;
 }
 .site-category-list .children-list li{
     position: relative;
     float: left;
     width: 265px;
     height: 76px;
 }
 .site-category-list .children-list .link{
     display:block;
     padding: 18px 20px;
     line-height: 40px;
     color:#333;
     transform: color .2s;
 }
 .site-category-list .children-list .thumb{
     margin-right: 12px;
     vertical-align: middle;
 }
 .site-category-list .children-list .text{
     line-height: 40px
 }


/* 横向导航栏*/
 .site-header .nav-list .nav-item{
     float: left;
     height: 88px;
     /*position: relative;*/
 }
 .site-header .nav-item .link{
     display: block;
     padding: 26px 10px 38px;
     color: #333;
 }
      /*下拉隐藏列表*/
 .site-header .nav-item .item-children{
    /*这里是要设置成隐藏的*/
     display: none;
     width: 1502px;
     position: absolute;
     left:0px;
     right: 0px;
     height:220px;
     margin: 0 auto;
     background: #fff;
     z-index:99999;
     border-top:1px solid #e0e0e0;
     box-shadow: 1px 11px 34px -12px #aaa; 
 }
 .site-header .nav-item .item-children .container{
     position: relative;
     top:0px;
     left: -62px !important;
 }
 .site-header .nav-item .item-children ul{
     padding: 0px 0px 0px 40px;
     margin: 0em 0px;
    
 }

 .site-header .nav-item .item-children ul li{
     float: left;
     padding-right: 0px;    
    /* display: list-item;
     text-align: -webkit-match-parent;*/
 }
 .site-header .nav-item .item-children ul li div.figure-thumb{
     margin-top: 33px;
     padding-right: 24px;
     padding-left: 12px;
     border-right:1px solid #e0e0e0; 
 }
 .site-header .nav-item .item-children ul li div.title{
     text-align: center;
     font-size: 12px;
     margin-left: -14px;
 }
 .site-header .nav-item .item-children ul li p.price{
    text-align: center;
    font-size: 12px;
    color: #ff6700;
    margin-left: -14px;
}
.site-header .nav-item .item-children ul li div.flags{
    
    top:0px;
    position: absolute;
}
.site-header .nav-item .item-children ul li div.flag{
    border:1px solid #ff6700;
    font-size: 12px;
    text-align: center;
    margin: 0 40px;
    width: 84px;
    height: 18px;
    left: 5px;
    color: #ff6700;
}
 /*导航栏搜索框*/
 .site-header .header-search{
     float:right;
     width: 296px;
     margin-top:25px;
 }
 .site-header .search-form{
     position: relative;
     width: 296px;
     height: 50px;
 }
 .site-header .search-text{
     position: absolute;
     top: 0;
     right: 51px;
     z-index: 1;
     width: 223px;
     height: 50px;
     padding: 0 10px;
     border: 1px solid #e0e0e0;
     font-size: 14px;
     line-height: 48px;
     outline: 0;
     transition: all .2s;
 }
 .site-header .search-btn{
     position: absolute;
     right: 0;
     top: 0;
     z-index: 2;
     width: 52px;
     height: 50px;
     border:1px solid #e0e0e0;
     font-size: 24px;
     line-height: 24px;
     background: #fff;
     color: #616161;
     outline: 0;
     transition: all .2s;
 }
 .site-header .search-hot-words{
     position: absolute;
     top:14px;
     right:62px;
     z-index:2;
     text-align: right;
 }
 .site-header .search-hot-words a{
     display: inline-block;
     margin-left:5px;
     font-size: 12px;
     padding: 0 5px;
     background:#eee;
     color: #757575;
     transition: all .2s;

 }
 form{
     margin:0;
     display: block;
 }
 .site-header .search-form .keyword-list{
     position: absolute;
     left: 22px;
     top: 50px;
     z-index: 20;
     width: 221px;
     border:1px solid #ff6700;
     border-top:0;
     background:#fff;
 }
 .site-header .search-form .keyword-list li a{
     position: relative;
     display:block;
     padding:6px 15px;
     font-size: 11px;
     color:#424242;
 }
 .site-header .search-form .keyword-list li .result{
     position: absolute;
     right: 15px;
     top:6px;
     columns: #b0b0b0;
 }
.hide{
    display: none;
}

/*商品导航栏*/
 .home-hero-container{
     position: relative;
    /* width: 1226px;*/
    /* height: 1272px;*/
     margin-right: auto;
     margin-left: auto;

 }
/*幻灯片*/
.home-hero-slider .ui-wrapper{
   height: 440;
   background: #ff6700;
   background-image:url(${base}/static/images/youyou/轮播图/xmad_15314769640218_exasB.jpg);
   background-size: 1227px 500px;
   background-repeat: no-repeat;
   background-position: center 0;
}
.home-hero-sub{
    margin-top:14px;
}
.home-hero-sub .span4{
    width: 234px;
    float: left;
    margin-left: 0px;

    min-height: 1px;

}
.home-hero-sub .span4 .home-channel-list{
    height: 164px;
    margin:0;
    padding: 3px;
    list-style-type: none;
    font-size: 12px;
    text-align: center;
    background: #5f5750;
}
.home-hero-sub .span4 .home-channel-list li{
    position: relative;
    float: left;
    width: 70px;
    height: 82;
    padding: 0 3px;
}
.home-hero-sub .span16{
    width: 992px;
    float: left;
    min-height: 1px;
    right: 0px;
}
.home-hero-sub .span16 .home-promo-list li{
  float: left;
  width: 316px;
  height: 170px;
  transition: box-shadow .2s linear;
  margin-left: 14.6px;
}

.home-promo-list img{
    width: 316px;
    height: 170px;
}
.box-12{
    width: 100%;
    
}
.box-10{
    width: 90%;
}
.box-9{
    width:75%;
}
.box-6{
    width:50%;
}
.box-3{
    width:25%;
    margin: 0 20px 0 0;
}
.box-2{
    width:10%;

}
.fl{
   float: left; 
}
.containerlxq{
    width: 1226px;
    margin: 0 auto
}
.good-top-left{
    display:none !important;
}
.container1 .box-12 .box-2{
    margin-right: 126px;
}
.boxflash{
    width: 16.8%;
    margin-right: 18.6px;
    margin-left: 7px;
    height: 344px;
    background: #f1eded;
}
.timing{
    position: absolute;
    padding-left: 0;
    padding-right: 0;
    text-align: center;
}
.timing input{
    height: 30px;
    width: 52px;
    font-size: 20px;
}
        </style>

</head>

<body>
        <div class="site-bn-bar">
                <a href="javascript:;" class="site-bn-bar-link exposure"></a>
        </div>
        <!--顶部导航条-->
        <div class="site-topbar">
                <div class="ocontainer">
                        <div class="topbar-nav">
                                <a href="javascript:;">小米商城</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">MIUI</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">IoT</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">云服务</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">金融</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">有品</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">小爱开放平台</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">政企服务</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">select Region</a>
                        </div>
                        <div class="topbar-cart" id="J_miniCartrigger">
                                <a href="javascript:;" class="cart-mini" id="J_miniCartBtn" onclick="">
                                        <i class="iconfont">口</i>
                                        <span class="cartname">购物车</span>
                                        <span class="cart-mini-num">(0)</span>
                                </a>
                                <div class="cart-menu" id="J_miniCartMenu">
                                        <div class="loading">
                                                <div class="loader">
                                                        购物车中还没有商品
                                                </div>
                                        </div>
                                </div>
                        </div>
                        <div class="topbar-info" id="J_userInfo">
                                <a href="javascript:;">登录</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">注册</a>
                                <span class="sep">|</span>
                                <a href="javascript:;">消息通知</a>
                        </div>
                </div>
        </div>
        <!--/*导航条*/-->
        <div class="site-header">
                <div class="container1">
                        <div class="header-logo">
                                <a class="logo" href="javascript:;" title="小米官网">
                                        <img src="${base}/static/images/youyou/mi-logo.png" alt="小米">小米官网</a>
                        </div>
                        <div class="header-nav">
                                <ul class="nav-list">
                                        <!--垂直导航栏-->
                                        <li id="J_navCategory" class="nav-category">
                                                <a class="link-category" href="javascript:;">
                                                        <span class="text">全部商品分类</span>
                                                </a>
                                                <div class="site-category">
                                                        <ul class="site-category-list" id="J_categoryList">
                                                                <!--手机卡 电话卡-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">手机 电话卡
                                                                                <i class="iconfont">&gt;</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/m8-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米8</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/666666.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米SE</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/6pro140-140.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米MIX2S</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/compare.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米6X</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/heisha-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">黑鲨鱼游戏手机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/m8-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米MIX2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/m8se-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米MAX2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/max2_80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米6Pro</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/mimobile.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米6</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/mix2s80-80white.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米6A</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/note5-80-80 (1).png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米Note5</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/note5-80-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米S2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/redmi5-80-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米5Plus</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/6pro140-140.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米5</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/compare.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">红米5A</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/heisha-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">移动4G</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/m8-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">对比手机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/xiaomi11">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/m8se-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米粉卡</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/phonecard">                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/note5-80-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米移动电话卡</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                 <a class="link" href="${base}/qiqi/phonecard">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/手机电话卡/s2-80-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手机上门维修</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>

                                                                        </div>
                                                                </li>
                                                                <!--电视 盒子-->
                                                                <li class="category-item">

                                                                        <a class="title" href="javascript:;">电视 盒子
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4-75.png" alt="">
                                                                                                        <span class="text">小米电视4 75英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                   <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-32.png" alt="">
                                                                                                        <span class="text">小米电视4A 32英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                   <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-40.png" alt="">
                                                                                                        <span class="text">小米电视4A 40英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>   <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-43.png" alt="">
                                                                                                        <span class="text">小米电视4A 43英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                       <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-43QC.png" alt="">
                                                                                                        <span class="text">小米电视4A 43英寸青春版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                  <a class="link" href="${base}/qiqi/xiaomitv">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-50.png" alt="">
                                                                                                        <span class="text">小米电视4A 49英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                   <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-55.png" alt="">
                                                                                                        <span class="text">小米电视4A 50英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-65.png" alt="">
                                                                                                        <span class="text">小米电视4A 55英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4C-55.png" alt="">
                                                                                                        <span class="text">小米电视4A 65英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                            <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4S-55Q.png" alt="">
                                                                                                        <span class="text">小米电视4A 55英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                             <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4S-55Q.png" alt="">
                                                                                                        <span class="text">小米电视4A 32英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4S-55Q.png" alt="">
                                                                                                        <span class="text">小米电视4A 43英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-43.png" alt="">
                                                                                                        <span class="text">小米电视4C 50英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4-75.png" alt="">
                                                                                                        <span class="text">小米电视4C 50英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-32.png" alt="">
                                                                                                        <span class="text">小米电视 体育版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-40.png" alt="">
                                                                                                        <span class="text">小米电视4C 59英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-43QC.png" alt="">
                                                                                                        <span class="text">小米电视4C 49英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-55.png" alt="">
                                                                                                        <span class="text">小米电视4C 50英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-65.png" alt="">
                                                                                                        <span class="text">小米电视4S 55英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-40.png" alt="">
                                                                                                        <span class="text">小米电视4S 55英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4A-32.png" alt="">
                                                                                                        <span class="text">小米电视4S 55英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4S-55Q.png" alt="">
                                                                                                        <span class="text">小米电视4S 50英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                            <a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4C-55.png" alt="">
                                                                                                        <span class="text">小米电视4S 43英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li><a class="link" href="${base}/qiqi/xiaomibox">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/电视盒子/TV4C-55.png" alt="">
                                                                                                        <span class="text">小米电视4S 32英寸</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--笔记本 平板-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">笔记本 平板
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/6838xiaozhuanjieqi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米平板4</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/6838xiaozhuanjieqi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米游戏本</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bijiben80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本Air 12.5</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bijiben80 (2).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本Air 13</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bijiben80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本Air 13.3</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本Air 13.3</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/xiaomilaptop">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本Pro</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/jianpanbashi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">电源适配器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/pingban2.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">HDMI转接器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板" alt="" width="40px" height="40px">
                                                                                                        <span class="text">VGA千兆网口转接器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/shubiao80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米笔记本内胆包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/tabet ">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/USBC80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">悦米机械键盘</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/tabet">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/vga.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">悦米机械键盘静音版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/xmsbd80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米便携鼠标</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/xmsbd80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米无线鼠标</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/jianpanbashi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">鼠标垫</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/USBC80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">Display转接器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/shubiao80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">千兆网口转接器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">游戏鼠标</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">笔记本双肩包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">适配器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/笔记本平板/bjbcdq80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">平板配件</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--智能 家电-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">智能 家电
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家投影仪</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/purifier">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">空气净化器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/purifier">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqiMAX-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">空气净化器Pro</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/purifier">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jingshuiqi80haha.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">净化器2S</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/purifier">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/lvxinbashi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">净化器MAX</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/purifier">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/touyingyiyibaisi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">车载空气净化器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/lvxinbashi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米净水器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2S-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米净水器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqiMAX-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米净水器1A</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jingshuiqi80haha.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">空净滤芯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/lvxinbashi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米净水器滤芯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/touyingyiyibaisi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家电水壶</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家恒温电水壶</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2S-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">PM2.5检测仪</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jingshuiqi80haha.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">谁知TDS检测笔</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/sweeper">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/lvxinbashi.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">扫地机器人</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/sweeper">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/touyingyiyibaisi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">扫地机附件</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家电饭煲</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqi2S-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家电磁炉</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/智能家电/jinghuaqiMAX-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">激光投影电视</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--健康 家居-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">健康 家居
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/scale.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手环</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/shouhuan3.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手表</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/fat">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/tizhicheng-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米体脂秤</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/fat">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yashua80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米体重</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                               <a class="link" href="${base}/qiqi/fat">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yundongshoubiao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家电动牙刷</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/zhinengchazuo-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">智能家庭组合</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/scale.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家智能插座</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/shouhuan3.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手电筒</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/tizhicheng-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家LED智能台灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yashua80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家飞利浦台灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yundongshoubiao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家感应夜灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/zhinengchazuo-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">床头灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/scale.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">吸顶灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/shouhuan3.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">智能灯泡</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/camera">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/tizhicheng-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家小白智能摄像机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yashua80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家智能摄像机云台半</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/camera">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/yundongshoubiao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小方智能摄像机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/camera">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/zhinengchazuo-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">大方智能摄像机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="${base}/qiqi/camera">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/scale.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小白智能摄像机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/健康家居/shouhuan3.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">血压计</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--出行 儿童-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">出行 儿童
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/jly80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">九号平衡车</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/phcplus80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">九号平衡车PLUS</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家电动滑板车</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">电自行车</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">行车记录仪</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">70迈智后视镜</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">70迈高清倒车影响摄像头</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">遥控小飞机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">儿童手表</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">智能积木</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米兔故事集</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="" alt="" width="40px" height="40px">
                                                                                                        <span class="text">积木机器人</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米兔定位电话</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">迷途轨道积木</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米无人机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家对讲机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家小相机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家全景相机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/scooter2-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小蚁微单相机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/出行儿童/zxc80-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米兔儿童滑板车</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--路由器 手机配件-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">路由器 手机配件
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/WiFifangdaqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/miwifi3g-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/miwifi3g-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi4_80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi4_80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/WiFifangdaqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米路由器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/miwifi3g-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">WIFI放大器PRO</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">WIFI放大器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">WIFI放大器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米VR眼镜</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/WiFifangdaqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">随身WIFI</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/WiFifangdaqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">千兆网线</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/miwifi3g-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手机保护套</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">手机贴膜</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi4_80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">自拍杆</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">数据线</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/luyouqi (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">存储卡</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/路由器手机配件/WiFifangdaqiPro-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">黑煞配件</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--移动电源 插线板-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">移动电源 插线板
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chaxianbanusb-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">新小米移动电源</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chezaichongdianqi80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米移动电源2C</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米移动电源2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米米家插线板</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chaxianbanusb-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米插线板USB版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chezaichongdianqi80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家智能插线板</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家二位转换器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chezaichongdianqi80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">彩虹电池7号</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">彩虹5号电池</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">充电器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chaxianbanusb-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米随身手电筒</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chezaichongdianqi80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">移动电源保护套</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米车载充电器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chezaichongdianqi80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家随身风扇</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家LED随身灯</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/dianyuan2-5qian-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">电源线收纳盒</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/移动电源插线板/chaxianbanusb-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米连卡随身路由器套装</span>
                                                                                                </a>
                                                                                        </li>

                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--耳机 音箱-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">耳机 音箱
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/toudaishierjijichuxiangsu.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米头戴式蓝牙耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/20170707135935.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米圈铁耳机2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/3-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米蓝牙项圈耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/bluetoothheadset.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米游戏机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/dianshiyinx80-80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米双单元半入耳式耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/erji80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米圈铁耳机Pro</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/fhzlyyx80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米圈铁耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/3-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米活塞耳机 清新版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/erji80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米降噪耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/huosai1.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米头戴式耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/quantie.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米运动蓝牙耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/shounabao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米运动蓝牙耳机mini</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/suishen-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米蓝牙耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/yundong80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米蓝牙音频接收器</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/xmjzej80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米头戴式耳机 轻松版</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/xmjzej80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">品牌耳机</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/toudaishierjijichuxiangsu.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米AI音箱</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/toudaishierjijichuxiangsu.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米小钢炮蓝牙音箱2</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/toudai80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米方盒子蓝牙音箱</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/耳机音箱/quantie.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">小米蓝牙音箱</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                                <!--生活 米兔-->
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">生活 米兔
                                                                                <i class="iconfont">口</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <ul class="children-list children-list-col children-list-col-1">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/baoxianhe.80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">旅行箱</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/beizi8.0..png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">双肩包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/chuangdian-80-80 (1).jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">儿童书包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/shafa.80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">胸包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/san.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">钱包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/san.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">收纳包</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-2">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/qianzibi-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">服饰</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/baoxianhe.80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">运动鞋</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/zhent.ou80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">围巾</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/xiangbao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">眼睛</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/weibo-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米家签字笔</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/xiangbao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">文具</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-3">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/tyj80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">玻璃保鲜盒</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/zhent.ou80.png" alt="" width="40px" height="40px">
                                                                                                        <span class="text">自动折叠伞</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/xiongbao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">螺丝刀</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/xiangbao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米兔玩偶</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/weibo-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">米兔磁力积木</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/shenhuahui80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">牙刷</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                                <ul class="children-list children-list-col children-list-col-4">
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/qianzibi-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">沙发</span>
                                                                                                </a>
                                                                                        </li>
                                                                                        <li>
                                                                                                <a class="link" href="javascript:;">
                                                                                                        <img class="thumb" src="${base}/static/images/youyou/leftNav/生活米兔/qianbao-80.jpg" alt="" width="40px" height="40px">
                                                                                                        <span class="text">枕头</span>
                                                                                                </a>
                                                                                        </li>
                                                                                </ul>
                                                                        </div>
                                                                </li>
                                                        </ul>
                                                </div>
                                        </li>
 <!--***********横向导航栏********************-->
                                        <!--小米手机-->
                                        <#list cate as cate>
                                        <li class="nav-item">
                                            
                                               
                                                <a class="link" href="javascript:;">
                                                        <span class="text">${cate.name!}</span>
                                                        <span class="arrow"></span>
                                                </a>
                                               
                                            
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="ocontainer">
                                                                <ul class="children-list">
                                                                        <!--小米8-->
                                                                        <li class="first">
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mi8.png" alt="小米8" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米8</a>
                                                                                </div>
                                                                                <p class="price">2699元起</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米 8SE-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mi8se.png" alt="小米 8SE" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米 8SE</a>
                                                                                </div>
                                                                                <p class="price" 1799起></p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米 MIX 2S-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mimin2x.png" alt="小米 MIX 2S" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米 MIX 2S</a>
                                                                                </div>
                                                                                <p class="price">3299起</p>
                                                                        </li>
                                                                        <!--小米 MIX 2-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mimin2.png" alt="小米 MIX 2" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米 MIX 2</a>
                                                                                </div>
                                                                                <p class="price">2599起</p>
                                                                        </li>
                                                                        <!--小米 MIN 6-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mi6.jpg" alt="小米 MIN 6" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米 MIN 6</a>
                                                                                </div>
                                                                                <p class="price">1399起</p>
                                                                        </li>
                                                                        <!--小米 MAX 2-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/小米手机/mimax2.png" alt="小米 MAX 2" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米 MAX 2</a>
                                                                                </div>
                                                                                <p class="price">1399起</p>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                         </#list>   
                                        <!--红米-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">红米</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <!--红米6 Pro-->
                                                                        <li class="first">
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/666320.png" alt="" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米6 Pro</a>
                                                                                </div>
                                                                                <p class="price">999元起</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--红米 6-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/6A320.png" alt="" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米 6</a>
                                                                                </div>
                                                                                <p class="price">799元起</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--红米 6A-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/6pro320-220.png" alt="红米 6A" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米 6A</a>
                                                                                </div>
                                                                                <p class="price">599元起</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--红米 note5-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/note5-320-220.png" alt="红米 note5" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米 note5</a>
                                                                                </div>
                                                                                <p class="price">1099元起</p>
                                                                        </li>
                                                                        <!--红米 S2-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/s2-320-220.png" alt="红米 S2" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米 S2</a>
                                                                                </div>
                                                                                <p class="price">999元起</p>
                                                                        </li>
                                                                        <!--红米 5Plus-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/红米/s2-320-220.png" alt="红米 5Plus" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">红米 5Plus</a>
                                                                                </div>
                                                                                <p class="price">999元起</p>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--电视-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">电视</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <!--小米电视 4 75英寸-->
                                                                        <li class="first">
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/32.png" alt="小米电视 4 75英寸" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米电视 4 75英寸</a>
                                                                                </div>
                                                                                <p class="price">8999元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米电视4A 32英寸-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/32.png" alt="小米电视4A 32英寸" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米电视4A 32英寸</a>
                                                                                </div>
                                                                                <p class="price">899元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">热卖</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米电视4A 43英寸青春版-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/4a43.png" alt="小米电视4A 43英寸青春版" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米电视4A 43英寸青春版</a>
                                                                                </div>
                                                                                <p class="price">1499元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米电视4A 50英寸-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/50.png" alt="小米电视4A 50英寸" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米电视4A 50英寸</a>
                                                                                </div>
                                                                                <p class="price">1999元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">热卖</div>
                                                                                </div>
                                                                        </li>
                                                                        <!--小米电视4A 55英寸-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/4a55.png" alt="小米电视4A 55英寸" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米电视4A 55英寸</a>
                                                                                </div>
                                                                                <p class="price">2499元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">热卖</div>
                                                                                </div>
                                                                        </li>
                                                                        <!---->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/电视/32.png" alt="查看全部电视" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">查看全部
                                                                                                <br>小米电视</a>
                                                                                </div>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--笔记本-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">笔记本</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <!--小米平板-->
                                                                        <li class="first">
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/笔记本/pingbanok.png" alt="小米平板" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米平板</a>
                                                                                </div>
                                                                                <p class="price">1099元</p>
                                                                        </li>
                                                                        <!--小米游戏本-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/笔记本/320x220youxichuantu.png" alt="小米游戏本" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米游戏本</a>
                                                                                </div>
                                                                                <p class="price">5999元</p>
                                                                        </li>
                                                                        <!--小米笔记本-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/笔记本/bijiben32012.5.jpg" alt="小米笔记本" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米笔记本</a>
                                                                                </div>
                                                                                <p class="price">5599元</p>
                                                                        </li>
                                                                        <!--小米笔记本 Air系列-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/笔记本/WechatIMG603.png" alt="小米笔记本 Air系列" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米笔记本 Air系列</a>
                                                                                </div>
                                                                                <p class="price">3599元</p>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--盒子-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">盒子</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <!--小米盒子-->
                                                                        <li class="first">
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/hezi.png" alt="小米盒子" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米盒子</a>
                                                                                </div>
                                                                                <p class="price">299元</p>
                                                                        </li>
                                                                        <!--小米盒子4c-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/hezi4c.png" alt="小米盒子4c" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米盒子4c</a>
                                                                                </div>
                                                                                <p class="price">199元</p>
                                                                        </li>
                                                                        <!--小米盒子3s-->
                                                                        <li>
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/hezi3c.png" alt="小米盒子3s" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米盒子3s</a>
                                                                                </div>
                                                                                <p class="price">299元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米盒子3c-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/320x220.png" alt="小米盒子3c" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米盒子3c</a>
                                                                                </div>
                                                                                <p class="price">199元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米盒子3增强版-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/hezi3zengq.png" alt="小米盒子3增强版-" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米盒子3增强版-</a>
                                                                                </div>
                                                                                <p class="price">399元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米家庭影院-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/盒子/hezi4.png" alt="小米家庭影院" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米家庭影院</a>
                                                                                </div>
                                                                                <p class="price">2099元</p>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--新品-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">新品</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <li class="first">
                                                                                <!--小米手环3-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/新品/shouhuan.png" alt="小米手环3" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米手环3</a>
                                                                                </div>
                                                                                <p class="price">169元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米路由器4-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/新品/luyouqi.png" alt="小米路由器4" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器4</a>
                                                                                </div>
                                                                                <p class="price">199元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米小爱音箱mini-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src=".//image/新品/xiaomixiaoaiai.png" alt="小米小爱音箱mini" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米小爱音箱mini</a>
                                                                                </div>
                                                                                <p class="price">169元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--米家投影仪-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/新品/toiuyingyi.png" alt="米家投影仪" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">米家投影仪</a>
                                                                                </div>
                                                                                <p class="price">3999元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米VR一体机-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/新品/VR.png" alt="小米VR一体机" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米VR一体机</a>
                                                                                </div>
                                                                                <p class="price">1499元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米米家智能摄像机-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/新品/shexiangji.png" alt="小米米家智能摄像机" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米米家智能摄像机</a>
                                                                                </div>
                                                                                <p class="price">199元</p>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--路由器-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">路由器</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <li class="first">
                                                                                <!--小米路由器4-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/luyouqi (1).png" alt="小米路由器4" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器4</a>
                                                                                </div>
                                                                                <p class="price">199元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">双频双核</div>
                                                                                </div>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米路由器4Q-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/4QQQ.png" alt="小米路由器4Q" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器4Q</a>
                                                                                </div>
                                                                                <p class="price">99元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米路由器3A-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/3G.png" alt="小米路由器3A" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器3A</a>
                                                                                </div>
                                                                                <p class="price">139元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米路由器3g-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/3G.png" alt="小米路由器3G" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器3g</a>
                                                                                </div>
                                                                                <p class="price">249元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">双千兆</div>
                                                                                </div>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米路由器HD-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/HD-Pro.png" alt="小米路由器HD" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米路由器HD</a>
                                                                                </div>
                                                                                <p class="price">499元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">大容量</div>
                                                                                </div>
                                                                        </li>
                                                                        <li>
                                                                                <!--查看全部小米路由器-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/路由器/chakangengduoluyouqi.png" alt="查看全部小米路由器" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">查看全部小米路由器</a>
                                                                                </div>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--智能硬件-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">智能硬件</span>
                                                        <span class="arrow"></span>
                                                </a>
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="container1">
                                                                <ul class="children-list oclearfix">
                                                                        <li class="first">
                                                                                <!--小米小爱影响mini-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/123321.jpg" alt="小米小爱影响mini" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米小爱影响mini</a>
                                                                                </div>
                                                                                <p class="price">169元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!---->

                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/air2.jpg" alt="小米无人机" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米无人机</a>
                                                                                </div>
                                                                                <p class="price">2999元</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">航拍利器</div>
                                                                                </div>
                                                                        </li>
                                                                        <li>
                                                                                <!--小米净水器-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/xiaomijingshuiqi.jpg" alt="小米净水器" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">小米净水器</a>
                                                                                </div>
                                                                                <p class="price">1999元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--米家扫地机器人-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/dfb.jpg" alt="米家扫地机器人" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">米家扫地机器人</a>
                                                                                </div>
                                                                                <p class="price">1699元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--米家要IH电饭煲-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/saodijiqiren320-220.jpg" alt="米家要IH电饭煲" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">米家要IH电饭煲</a>
                                                                                </div>
                                                                                <p class="price">999元</p>
                                                                        </li>
                                                                        <li>
                                                                                <!--查看全部-->
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}/static/images/youyou/智能硬件/123321.jpg" alt="查看全部" height="110px" width="160px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">查看全部
                                                                                                <br> 智能硬件
                                                                                        </a>
                                                                                </div>
                                                                        </li>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                        <!--服务-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">服务</span>
                                                        <span class="arrow"></span>
                                                </a>
                                        </li>
                                        <!--社区-->
                                        <li class="nav-item">
                                                <a class="link" href="javascript:;">
                                                        <span class="text">社区</span>
                                                        <span class="arrow"></span>
                                                </a>
                                        </li>
                                </ul>
                        </div>
                        <div class="header-search">
                                <form id="J_searchForm" class="search-form oclearfix" action="" method="POST">
                                        <label for="search" class="hide" style="display:none!important">站内搜索</label>
                                        <!--搜索框-->
                                        <input class="search-text" type="search" name="keyword" placeholder="">
                                        <!--搜索按钮-->
                                        <input class="search-btn iconfont" type="submit" value="口">
                                        <div class="search-hot-words" style="display: block;">
                                                <a href="javascript:;">小米8</a>
                                                <a href="javascript:;">小米MIX 2S</a>
                                        </div>
                                        <!--这里还有隐藏的DIV-->
                                        <div class="keyword-list hide" id="J_keywordList">
                                                <ul class="result-list">
                                                        <li>
                                                                <a href="javascript:;">
                                                                        小米6
                                                                        <span class="result">约有6件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        小米MIX&nbsp;25
                                                                        <span class="result">约有2件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        黑鲨游戏手机
                                                                        <span class="result">约有5件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        红米5A
                                                                        <span class="result">约有9件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        小米电视4C
                                                                        <span class="result">约有10件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        电视32英寸
                                                                        <span class="result">约有1件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        笔记本pro
                                                                        <span class="result">约有41件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        空气净化器
                                                                        <span class="result">约有1件</span>
                                                                </a>
                                                        </li>
                                                        <li>
                                                                <a href="javascript:;">
                                                                        净水器
                                                                        <span class="result">约有8件</span>
                                                                </a>
                                                        </li>
                                                </ul>
                                        </div>

                                </form>

                        </div>
                </div>
                <div class="J_navMenu" class="header-nav-menu" style="height: 229px;padding-top: 0px;margin-top: 0px;
         padding-bottom: 0px;margin-bottom: 0px;display: none;">
                        <!--这里还有隐藏的商品DIV-->
                </div>
        </div>
        <!--商品导航栏-->
        <div class="home-hero-container container1">
                <div class="home-hero">
                        <!--轮播图-->
                        <div class="home-hero-slider">
                                <div class="container">
                                        <ul id="partial-view">
                                                <li style="width: 1050px;">
                                                        <img src="${base}/static/images/youyou/xmad_15402884464991_fKdYt.jpg" width="1200px" height="460px" />
                                                </li>
                                                <li>
                                                        <img src="${base}/static/images/youyou/xmad_15421097233072_gZrpC.jpg" width="1000px" height="460px" />
                                                </li>

                                        </ul>



                                </div>
                        </div>
                        <!--轮播图底下-->
                        <div class="home-hero-sub row">
                                <div class="span4">
                                        <ul class="home-channel-list oclearfix">
                                                <li class="exposure top left">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>选购手机
                                                        </a>
                                                </li>
                                                <li class="exposure top">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>企业团购
                                                        </a>
                                                </li>
                                                <li class="exposure top">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>F码通道
                                                        </a>
                                                </li>
                                                <li class="exposure left">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>米粉卡
                                                        </a>
                                                </li>
                                                <li class="exposure">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>以旧换新
                                                        </a>
                                                </li>
                                                <li class="exposure">
                                                        <a href="javascript:;">
                                                                <i class="iconfont">口</i>话费充值
                                                        </a>
                                                </li>
                                        </ul>
                                </div>
                                <div class="span16" id="J_homePromo" data-stat-title="焦点图下方小图">
                                        <ul class="home-promo-list oclearfix">
                                                <li class="first">
                                                        <a href="javascript:;" class="item exposure">
                                                                <img src="${base}/static/images/youyou/leftNav/home-promo-list/xmad_15302595556283_DAjhs.jpg" alt="红米6 Pro干推">
                                                        </a>
                                                </li>
                                                <li>
                                                        <a href="javascript:;" class="item exposure">
                                                                <img src="${base}/static/images/youyou/leftNav/home-promo-list/xmad_15302597437612_vWwBm.jpg" alt="红米">
                                                        </a>
                                                </li>
                                                <li>
                                                        <a href="javascript:;" class="item exposure">
                                                                <img src="${base}/static/images/youyou/leftNav/home-promo-list/xmad_15294897230285_fVNvp.png" alt="小米净水器">
                                                        </a>
                                                </li>
                                        </ul>
                                </div>
                        </div>
                </div>


        </div>
        </div>

        <div class="carousel-inner" role="listbox">

        </div>



        </div>
        </div>
        <div class="container1">
                <div class="box-12" style="margin-top: 184px;">
                        <div class="boxflash fl">
                                <div class="">
                                        <br>
                                        <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <span style="font-size: 20px;color: red">18:00 场</span>
                                        <br>
                                        <br>
                                        <br>
                                        <div style="width: 100%">
                                                <img src="${base}/static/images/youyou/flashpurchase.png" style="margin: 0 auto;display:block;" alt="">
                                        </div>
                                        <br>
                                        <br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                        <span style="font-size: 16ppx; color: gray">距离结束还有</span>
                                        <br>
                                        <br>
                                </div>

                                <div class="timing">
                                        <input id="timehours" type="text" value="0" readonly="readonly">&nbsp;:
                                        <input id="timeminutes" type="text" value="40" readonly="readonly">&nbsp;:
                                        <input id="timeseconds" type="text" value="0" readonly="readonly">
                                </div>
                        </div>
                        <div class="box-2 fl ">
                                <img src="${base}/static/images/youyou/sales1.png" width="236px" height="344px" alt="">
                        </div>
                        <div class="box-2 fl">
                                <img src="${base}/static/images/youyou/sales2.png" width="236px" height="344px" alt="">
                        </div>
                        <div class="box-2 fl">
                                <img src="${base}/static/images/youyou/sales3.png" width="236px" height="344px" alt="">
                        </div>
                        <div class="box-2 fl">
                                <img src="${base}/static/images/youyou/sales4.png" width="236px" height="344px" alt="">
                        </div>
                </div>
        </div>
        <div class="container1">
                <a href="#javaScript">
                        <img src="${base}/static/images/youyou/xmad_15408661432025_tiVWv.jpg" height="120px" alt="">
                </a>
        </div>
        <div class="container1">
                <div class="box-3 fl" style="height: 614px;width: 23%;">
                        <a href="#javaScript" style="height: 614px; display: block;background: url('${base}/static/images/youyou/xmad_15407792204208_jtrJc.jpg');background-size:cover"></a>
                </div>
                <div class="box-9 fl" style="height: 614px;">
                        <div class="box-12">
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone1.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone2.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript"></a>
                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone3.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone4.png');background-size: cover"></div>
                                </a>
                        </div>

                        <div class="box-12">
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone5.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone6.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone7.png');background-size: cover"></div>
                                </a>
                                <a href="#javaSCript">
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone8.png');background-size: cover"></div>
                                </a>
                        </div>

                </div>
        </div>


        <div class="container1">
                        <a href="#javaScript">
                                <img src="${base}/static/images/youyou/window.jpg" height="120px" alt="">
                        </a>
                </div>
                <div class="container1">
                        <div class="box-3 fl" style="height: 614px;width: 23%;">
                                <a href="#javaScript" style="height: 614px; display: block;background: url('${base}/static/images/youyou/sales1.png') no-repeat center;background-size:cover"></a>
                        </div>
                        <div class="box-9 fl" style="height: 614px;">
                                <div class="box-12">
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/window1.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/window2.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript"></a>
                                        <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/window3.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/window4.png');background-size: cover"></div>
                                        </a>
                                </div>
        
                                <div class="box-12">
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone5.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone6.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone7.png');background-size: cover"></div>
                                        </a>
                                        <a href="#javaSCript">
                                                <div class="box-3 fl" style="margin:0;height: 300px;background: url('${base}/static/images/youyou/phone8.png');background-size: cover"></div>
                                        </a>
                                </div>
        
                        </div>
                </div>
        </div>

        <script src="${base}/static/js/jquery-2.1.1.min.js"></script>
        <script src="${base}/static/js/youyou/partialviewslider.min.js"></script>
        <script>
                window.onload = function () {
                        //小米顶部导航栏链接hover变色
                        var osite_topbar = document.getElementsByClassName("site-topbar")[0];
                        console.log(osite_topbar.nodeName);
                        var osite_topbarAlla = osite_topbar.getElementsByTagName("a");
                        for (var i = 0; i < osite_topbarAlla.length; i++) {
                                osite_topbarAlla[i].onmouseover = function () {
                                        this.style.color = "#fff";
                                }
                                osite_topbarAlla[i].onmouseout = function () {
                                        this.style.color = "#b0b0b0";
                                }
                        }

                        //小米侧边导航栏
                        var oJ_navCategory = document.getElementById("J_navCategory");
                        var oJ_categoryList = document.getElementById("J_categoryList");
                        //获取列表中的li元素 例如获取手机 电话卡的li
                        var oCategory_item = oJ_categoryList.getElementsByClassName("category-item");
                        for (var i = 0; i < oCategory_item.length; i++) {
                                oCategory_item[i].onmouseover = function () {
                                        console.log(this);
                                        this.className += " " + "category-item-active";
                                        this.style.background = "#ff6700";
                                }
                                oCategory_item[i].onmouseout = function () {
                                        this.className = "category-item";
                                        this.style.background = "#333";
                                }
                        }

                }
                $(document).ready(function () {
                        //$(".nav-item").mouseover(function(){
                        //       $(this).addClass("nav-list-active")//给当前元素添加"current"样式
                        //       .next(".item-children").show()//下一个元素显示
                        //      /*.parent()*/.siblings(".nav-item").removeClass("nav-list-active")//父元素的同辈元素的子元素移除<a>移除"current"样式
                        //      .next().hide();//它们的下一个元素隐藏
                        //      return false;
                        //    });
                        //购物车
                        $("ul.nav-list li.nav-item a.link").hover(
                                function () {
                                        $(this).parent().children("div").stop(true).animate({ height: "show" }, 400);
                                        // $(this).parent().children("div").slideDown("slow");
                                },
                                function () {
                                        $(this).parent().children("div").slideUp("slow").delay(1000);
                                }
                        )
                        //购物车
                        $("div.topbar-cart a.cart-mini").hover(
                                function () {

                                        $(this).css("background", "#fff");
                                        $("div.topbar-cart a.cart-mini i.iconfont,span.cartname,span.cart-mini-num").css("color", "#ff6700");
                                        $(this).parent().children("div.cart-menu").slideDown("slow");
                                },
                                function () {
                                        $(this).css("background", "#424242");
                                        $("div.topbar-cart a.cart-mini i.iconfont,span.cartname,span.cart-mini-num").css("color", "#b0b0b0");
                                        $(this).parent().children("div.cart-menu").slideUp("slow");
                                        ;
                                }
                        )
                        //搜索框
                        $("div.header-search form.search-form input").focus(function () {
                                console.log($(this).nodeName);
                                $(this).css("border-color", "#ff6700");
                                $(".site-header .search-btn").css("border-color", "#ff6700");
                                $(this).parent().children("div.search-hot-words").css("display", "none");
                                $(this).parent().children("div.keyword-list").css("display", "block");

                        });
                        $("div.header-search form.search-form input").blur(function () {
                                $(this).css("border-color", "#b0b0b0");
                                $(".site-header .search-btn").css("border-color", "#b0b0b0");
                                $(this).parent().children("div.search-hot-words").css("display", "block");
                                $(this).parent().children("div.keyword-list").css("display", "none");
                        });

                });


                $(document).ready(function () {
                        var partialView = $('#partial-view').partialViewSlider();

                        $('#prev').on('click', function () {
                                partialView.prev();
                        });
                        $('#next').on('click', function () {
                                partialView.next();
                        });
                        $('#play').on('click', function () {
                                partialView.play();
                        });
                        $('#pause').on('click', function () {
                                partialView.pause();
                        });
                });

                //倒计时
                $(function () {
                        var hours = $("#timehours").val();
                        var minutes = $("#timeminutes").val();
                        var seconds = $("#timeseconds").val();
                        var time = parseInt(hours * 60 * 60) + parseInt(minutes * 60) + parseInt(seconds);
                        if (time > 0) {
                                setInterval("time()", 1000);
                        } else {
                                $("#timehours").val(0);
                                $("#timeminutes").val(0);
                                $("#timeseconds").val(0);
                        }


                });

                function time() {
                        var hours = $("#timehours").val();
                        var minutes = $("#timeminutes").val();
                        var seconds = $("#timeseconds").val();
                        var time = parseInt(hours * 60 * 60) + parseInt(minutes * 60) + parseInt(seconds);
                        var index = 60;
                        // alert(time);
                        // for(var a=0; a<time;a++) {
                        if (time == 0) {
                                $("#timehours").val(0);
                                $("#timeminutes").val(0);
                                $("#timeseconds").val(0);

                        } else if (time <= 60) {
                                time -= 1;
                                // alert(seconds)
                                if (seconds != 0) {
                                        var s = time;
                                        $("#timeseconds").val(s);
                                } else {
                                        minutes -= 1
                                        $("#timeminutes").val(minutes);
                                        var s = index;
                                        $("#timeseconds").val(s);
                                }
                        } else if (time > 60) {
                                if (seconds != 0) {
                                        seconds -= 1;
                                        $("#timeseconds").val(seconds);
                                } else if (minutes != 0) {
                                        minutes -= 1;
                                        $("#timeminutes").val(minutes);
                                        seconds = index;
                                        $("#timeseconds").val(seconds)
                                } else if (hours != 0) {
                                        hours -= 1;
                                        $("#timehours").val(hours);
                                        minutes = index
                                        $("#timeminutes").val(minutes);
                                }
                        }
                }
        </script>

</body>

</html>