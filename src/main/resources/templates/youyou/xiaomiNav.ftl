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
     background-image:url("${base}${topAdImg.src}");
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
<!--*************顶部导航条************-->
        <div class="site-topbar">
                <div class="ocontainer">
                        <div class="topbar-nav">
                              <#list topcate as topcate>
                                <a href="javascript:;">${topcate.name!}</a>
                                <span class="sep">|</span>
                              </#list>
                               
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
                                <a class="logo" href="${base}${logoImg.imghref}" title="${logoImg.title}">
                                        <img src="${base}${logoImg.src}" alt="小米">${logoImg.title}</a>
                        </div>
                        <div class="header-nav">
                                <ul class="nav-list">
 <!--*****************垂直导航栏***************-->
                                        <li id="J_navCategory" class="nav-category">
                                                <a class="link-category" href="javascript:;">
                                                        <span class="text">全部商品分类</span>
                                                </a>
                                                <div class="site-category">
                                                        <ul class="site-category-list" id="J_categoryList">
                                                                <!--手机卡 电话卡-->
                                                              <#assign ilist=ImgPclist1/>
                                                              <#list ilist as i>
                                                                <li class="category-item">
                                                                        <a class="title" href="javascript:;">${i.title!}
                                                                                <i class="iconfont">&gt;</i>
                                                                        </a>
                                                                        <div class="children oclearfix children-col-4">
                                                                                <#assign ilist1=i.children/>
                                                                                 <#if i.children??>
                                                                                <ul class="children-list children-list-col">
                                                                               
                                                                                 
                                                                                    <#list 0..(ilist1!?size-7) as sub2>
                                                                                        <li>
                                                                                                <a class="link" href="${base}${ilist1[sub2].imghref}">
                                                                                                        <img class="thumb" src="${base}${ilist1[sub2].src!}" alt="" width="40px" height="40px">
                                                                                                        <span class="text">${ilist1[sub2].title!}</span>
                                                                                                </a>
                                                                                        </li>
                                                                                       </#list>                       
                                                                                </ul>
                                                                                 <ul class="children-list children-list-col"> 
                                                                                    <#list 7..(ilist1!?size-1) as sub2>
                                                                                        <li>
                                                                                                <a class="link" href="${base}${ilist1[sub2].imghref}">
                                                                                                        <img class="thumb" src="${base}${ilist1[sub2].src!}" alt="" width="40px" height="40px">
                                                                                                        <span class="text">${ilist1[sub2].title!}</span>
                                                                                                </a>
                                                                                        </li>
                                                                                       </#list> 
                                                                                       
                                                                                </ul>
                                                                             </#if>

                                                                        </div>
                                                                </li> 
                                                              </#list>
                                                        </ul>
                                                </div>
                                        </li>
 <!--****************横向导航栏********************-->
                                        <!--小米手机-->
                                        <#list ImgPclist as ImgPclist>
                                        <li class="nav-item">
                                            
                                               
                                                <a class="link" href="javascript:;">
                                                        <span class="text">${ImgPclist.title!}</span>
                                                        <span class="arrow"></span>
                                                </a>
                                               
                                             
                                                <div class="item-children">
                                                        <!--这里还有子列表-->
                                                        <div class="ocontainer">
                                                                <ul class="children-list">
                                                                    <#list ImgPclist.children as sub>
                                                                        <!--小米8-->
                                                                        <li >
                                                                                <div class="figure figure-thumb">
                                                                                        <a href="javascript:;">
                                                                                                <img src="${base}${sub.src}" alt="小米8" width="160px" height="110px">
                                                                                        </a>
                                                                                </div>
                                                                                <div class="title">
                                                                                        <a href="javascript:;">${sub.title}</a>
                                                                                </div>
                                                                                <p class="price">${sub.price}元起</p>
                                                                                <div class="flags">
                                                                                        <div class="flag">新品</div>
                                                                                </div>
                                                                        </li>
                                                                        
                                                                                                                                                         </#list>
                                                                </ul>
                                                        </div>
                                                </div>
                                        </li>
                                         </#list>   
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
                                            <#list silderimg as silderimg>
                                                <li >
                                                        <img src="${base}${silderimg.src}" width="1200px" height="460px" />
                                                </li>
                                               </#list> 
                                               

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