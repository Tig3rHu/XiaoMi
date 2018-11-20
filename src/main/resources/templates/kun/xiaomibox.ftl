<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.6/animate.min.css">
	<link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.4/styles/tomorrow.min.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/default.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/styles.css">
    <style>
        .body {
    width: 100%;
    height: 100%;
    font: 14px/1.5 "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
    color: #333;
    background-color: #fff;
    
    
}
.div{
    display: block;
}
.box-index{
    width: 100%;
    height:764px;
    background-color: red;
    background: url(${base}/static/images/kun/ku/xiaomibox/bg-top.jpg)no-repeat center center;

   
}
.box-wall{
    width: 100%;
    height: 1147px;
    background-color: rgb(237, 237, 237);
}

.box-screen{
    height: 1372px;
    background-color: #ecf4fb;
}
.box-compare{
    height: 945px;
    
    margin-top: -20px;
}
.box-game{
    height: 850px;
    background-color: darkblue;
    background: url(${base}/static/images/kun/ku/xiaomibox/bg-game.jpg)no-repeat center center;
 

}
.box-dts{
    height: 1000px;
    background-color: darkkhaki;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-yinxiao-bg.jpg)no-repeat center center;
 


}
.box-use{
    height: 500px;
    background-color: rgb(238, 238, 238);
    margin-top: -20px;
}
.box-usb{
    height: 800px;
    background-color: #fff;
   
 
}
.box-design{
    height: 766px;
    background-color: tan;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-reward-bg.jpg)no-repeat center center;
}
.box-foot{
    height: 300px;
    margin-top: 0px;
    animation: 3s change infinite linear;
   
   


}
.box-foot-img{
    width: 1226px;
    height: 300px;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-itspatchwall-img.png)no-repeat  top right;
    margin-right: auto;
    margin-left: auto;
}
.wall-text{
    width: 1226px;
    height: 342px;
    
    margin: 0 auto;
}
.wall-img-group{
   height: 736px;
   
   background: url(${base}/static/images/kun/ku/xiaomibox/pic.png) no-repeat;
   background-size:cover;
}
.box-screen-pic{
    height: 800px;
    margin-top: 100px;
    /* background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider5.jpg)no-repeat top center;; */
}
.box-screen-pic img{
    display: block;
    margin: 0 auto;
}
.box-compare-pic{
    height: 413.64px;
    
    margin-top: 100px;
}  

.imgbox{
    
    position:absolute;
    width: 539px;
    height: 308px;
    margin-top: 50px;
    margin-left: 260px;
    
}
.img00{
    position:absolute;
    width: 539px;
    height: 308px;
    margin-top:20px;
   margin-left: 90px;
     z-index: 11;
     opacity: 1;
}
.img01{
    position:absolute;
    opacity: 0;
    width: 475px;
    height: 267px;
    margin-top:40px;
    margin-left: 100px;
    z-index: 10;
   
}
.img01ani{
    opacity: .8;
    animation: spread 1.5s;
    animation-fill-mode: forwards;
}
.img02{
    opacity: 0;
    position:absolute;
    width: 422px;
    height: 238px;
    margin-left: 100px;
    margin-top:50px;
    z-index: 9;
    
}
.img02ani{
    opacity: .6;
    animation: spread02 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .4s
}
.img03{
    opacity: 0;
    position:absolute;
    width: 384px;
    height: 223px;
    margin-left: 175px;
    margin-top:55px;
    z-index: 8;
   
}
.img03ani{
    opacity: .4;
    animation: spread03 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .6s
}
.img04{
    position:absolute;
    opacity: 0;
    margin-top:65px;
    width: 330px;
    height: 192px;
    margin-left: 250px;
    padding-left:-10px;
    z-index:7;
   
}
.img04ani{
    opacity:.2;
    animation: spread04 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .8s
}
.imgbox2{
    position:absolute;
    width: 529px;
    height: 308px;
    
    margin-top: 50px;
    margin-left: 980px;
    
}
.img0{
    position:absolute;
    width: 539px;
    height: 308px;
    margin-top:20px;
  
     z-index: 11;
     opacity: 1;
}
.img1{
    position:absolute;
   
    width: 519px;
    height: 299px;
    margin-top: 24px;
    margin-left: 5px;
    z-index: 10;
    opacity: .9;

}
.img1ani{
    animation: spread1 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .1s
}

.img2{

 position:absolute;
    width: 439px;
    height: 285px;
    margin-left: 85px;

    margin-top:30px;
    z-index: 9;
    opacity: .8;
}
.img2ani{
    animation: spread2 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .2s
}
.img3{
    position:absolute;
    width: 465px;
    height: 269px;
    margin-left: 50px;
   
    margin-top:30px;
    z-index: 8;
    opacity: .7;
}
.img3ani{
    animation: spread3 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .3s
}
.img4{
    position:absolute;
   
    margin-top:35px;
    width: 439px;
    height: 255px;
    margin-left: 60px;
    z-index:7;
    opacity:.6;
    }
.img4ani{
    animation: spread4 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .4s
}
.img5{
    position:absolute;
    width: 413px;
    height: 240px;
    margin-left: 90px;
    margin-top:40px;
    z-index:6;
    opacity:.5;
}
.img5ani{
    animation: spread5 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .5s
}

.img6{
    position:absolute;
    width: 386px;
    height: 234px;
    margin-left: 120px;
    margin-top:44px;
    z-index:5;
    opacity:.4;
}
.img6ani{
    animation: spread6 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .6s
}
.img7{
    position:absolute;
    width: 359px;
    height: 209px;
    margin-left: 130px;
    margin-top:55px;
    z-index:4;
    opacity:.3;
}
.img7ani{
    animation: spread7 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .7s
}
.img8{
    position:absolute;
    width: 332px;
    height: 194px;  
    margin-left: 190px;
    margin-top:65px;
    z-index:3;
    opacity:.2;
}
.img8ani{
    animation: spread8 1.5s;
    animation-fill-mode: forwards;
    animation-delay: .8s
}
.img9{
    position:absolute;
    width: 304px;
    height: 177px;
    margin-left: 180px;
    margin-top:70px;
    z-index:2;
    opacity:.1;
}
.img9ani{
    animation: spread9 1.5s;
    animation-fill-mode: forwards;
    animation-delay: 1s
}

@keyframes spread{

    100%{
       
        transform:translateX(-65px)
    }
}
@keyframes spread02{

    100%{
       
        transform:translateX(-115px)
    }
}
@keyframes spread03{
    100%{
       
        transform:translateX(-240px)
    }
}
@keyframes spread04{
    100%{
       
        transform:translateX(-350px)
    }
}
@keyframes spread1{
    100%{
       
        transform:translateX(40px)
    }
}
@keyframes spread2{
    100%{
       
        transform:translateX(65px)
    }
}
@keyframes spread3{
    100%{
       
        transform:translateX(100px)
    }
}
@keyframes spread4{
    100%{
       
        transform:translateX(140px)
    }
}
@keyframes spread5{
    100%{
       
        transform:translateX(160px)
    }
}
@keyframes spread6{
    100%{
       
        transform:translateX(175px)
    }
}
@keyframes spread7{
    100%{
       
        transform:translateX(220px)
    }
}
@keyframes spread8{
    100%{
       
        transform:translateX(205px)
    }
}
@keyframes spread9{
    100%{
       
        transform:translateX(265px)
    }
}
.index-text{
    width: 1226px;
    height: 342px;
    padding:300px 0 0 102px;
    color: #000;
    padding-top: 250px;
  margin-left: 240px;
}
.index-text-title{
    font-family: 'F4989e';
    font-size: 60px;
    color: #1d1d1d;
    font-weight: bolder;
    line-height: 1;
   
   
}
.price{
    padding-top: 100px;    
}
.price-num{
    color: red;
    font-family: 'Avenir Medium';
   
}
.webfont{
    font-family: 'F689ec';
    
}
.icon-play{
    background: url(${base}/static/images/kun/ku/xiaomibox/icon-play-next.png);
    display: inline-block;
    width: 32px;
    height: 20px;
    vertical-align: -4px;
    margin-right: 5px;
    margin-left: 30px;
    background-position: 0 -15px;

}
.icon-next {
    display: inline-block;
    width: 15px;
    height: 15px;
    background-position: 0 0;
    margin-left: 8px;
    vertical-align: -1px;
    background-image: url(${base}/static/images/kun/ku/xiaomibox/icon-play-next.png);
}
.wall-title{
    line-height: 55px;
    font-size: 50px;
    font-weight: border;
    text-align: center;
    padding-top: 80px;
}
.item-des{
    text-align: center;
    line-height: 30px;
    font-size: 16px;
}
.wall-text-left{    
    width: 420px;
    float: left;
    font-size: 26px;
    margin-left: -40px;
    padding-top: 200px;
}
.wall-text-right{    
    width: 846px;
    float: right;
    line-height: 30px;
    font-size: 20px;
    padding-top: 225px;
  

}
.container{
    width: 1226px;
    margin-right: auto;
    margin-left: auto;
}
.compar-title{
    font-size: 35px;
}
.compare-vs{
    float: left;
    width: 67px;
    font-size: 30px;
    color: #212121;
    margin-top: 390px;
    margin-left: 90px;
}
.compare-left{
    float: left;
    width: 525px;
    text-align: center;
    line-height: 0px;
    margin-top: 390px;
    position: relative;
    z-index: 11;

}
.compare-right{
    float: right;
    width: 525px;
    text-align: center;
    line-height: 0px;
    margin-top: -45px;
    position: relative;
    z-index: 11;

}
.game-content{
    padding-top: 208px;
}
.game-content-title{
        width: 1225px;
        height: 110px;
        line-height: 50px;
        font-size: 40px;
        text-align: left;
        margin-left: -55px;
        margin-top: 90px;
}
.game-content-webfont{
    height: 100px;
    width: 1225px;
    line-height: 30px;
    font-size: 16px;
    padding-top: -10px;
    margin-left: -50px;
   text-align: left;
    }
.features  {
    margin-left: 20px;
   
    line-height: 25px;
    text-align: center;
    height: 300px;
    width: 600px;
    float: left;
    display: block;
   
}
.features-1,.features-2,.features-3{
    width: 120px;
    height: 120px;
    float: left;
    margin-left: -100px;
}
.features-2{
    margin-left: 40px;
}
.features-3{
    margin-left: 40px;
}
.icon{

    display: block;
    background-image: url(${base}/static/images/kun/ku/xiaomibox/icon-all.png);
    margin: 0 auto ;
    width: 62px;
    height: 62px;
}
.icon-1{
    
    background-position: 0 0;

}
.icon-2{
    background-position: -62px 0;
}
.icon-3{
    background-position: -124px 0;
}
.dts-content{
    padding-top: 670px;
    color: #fff;
    margin-left: 365px;
    }

.dts-title{
    margin-top: 20px;
    line-height: 55px;
    font-size: 40px;
    font-weight: bolder;
}
.dts-webfont{
   margin-left: -320px;
   margin-top: 10px;

}
.usb-title{
    padding-top: 50px;
    text-align: center;
    font-size: 40px;    
    font-weight: bolder;
    line-height: 55px;

}
.desigin-title{
    line-height: 55px;
    font-size: 36px;
    text-align: center;
  padding-top: 80px;
}
.desigin-webfont{
    
    line-height: 30px;
    font-size: 16px;
}
.footer-link-title{
    text-align: left;
    position: relative;
    z-index: 3;
    color: #fff;
    font-size: 46px;
    font-weight: bolder;
    animation: 3s change1 infinite linear;


}
.footer-link-btn{
    display: block;
    font-size: 20px;
    position: relative;
    z-index: 3;
    color: #fff;
    margin-top: 20px;
    animation: 3s change1 infinite linear;

}
.foot-content{
    width: 800px;
    padding-top: 100px;
}
.use-container{
    padding-top: 120px;
    width: 1226px;
    margin-right: auto;
    margin-left: auto;
    
}
.group{
    margin: 0 60px 0 45px;
    float: left;
}
.item-title{
    
    margin-top: 28px;
}
.group-font{
    font-size: 24px;
    color: #000;
}
.group-des{
    line-height: 30px;
    font-size: 16px;
}
.icon-lanya{
    background-image: url(${base}/static/images/kun/ku/xiaomibox/icon-all-2.png);
    width: 44px;
    height: 61px;
    background-position: -143px 0
}
.icon-wifi{
    background-image: url(${base}/static/images/kun/ku/xiaomibox/icon-all-2.png);
    width: 70px;
    height: 56px;
    background-position: -73px 0;
    
}
.icon-usb{
    background-image: url(${base}/static/images/kun/ku/xiaomibox/icon-all-2.png);
    margin-bottom: 47px;
    width: 73px;
    height: 35px;
    background-position: 0 0;

}
.Controls1{
        width: 200px;
        height: 200px;
        float: left;
        text-align: center;
        background-position: 0 0 !important;
        background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-icon.png)no-repeat center;
        margin-left: -490px;
        margin-top: -10px;
        background-color:rgb(233, 233, 233);

    }

.Controls2{
    background-position: -192px 0 !important;
    width: 200px;
    height: 200px;
     float: left;
    text-align: center;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-icon.png)no-repeat center;
    margin-left: -300px;
    margin-top: -10px;
    background-color:rgb(233, 233, 233);
}
.Controls3{
    background-position:-408px 0 !important;
    width: 200px;
    height: 200px;
     float: left;
    text-align: center;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-icon.png)no-repeat center;
    margin-left: -110px;
    margin-top:-10px;
    background-color:rgb(233, 233, 233);
}

.Controls4{
    background-position: -605px 0 !important;
    width: 200px;
    height: 200px;
     float: left;
    text-align: center;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-icon.png)no-repeat center;
    margin-left: 80px;
    margin-top: -10px;
    background-color:rgb(233, 233, 233);
    
}

.Controls5{
    background-position: -795px 0 !important;
    width: 200px;
    height: 200px;
     float: left;
    text-align: center;
    background: url(${base}/static/images/kun/ku/xiaomibox/index-tengxun-icon.png)no-repeat center;
    margin-left: 270px;
    margin-top: -10px;
    background-color:rgb(233, 233, 233);
}
.Controls5:hover,.Controls4:hover,.Controls3:hover,.Controls2:hover,.Controls1:hover{
    background-color:rgb(255, 255, 255);
}
@keyframes change{0%   {background-color: #000}
100% {background-color: #ffff}}
@keyframes change1{0%   {color: #fff}

100% {color: #000}}
    </style>
</head>
<body>
    <div class="xiaomibox">
         <div class="box-index" >
                <div class="index-text">
                        <h1 class="index-text-title aniview  " av-animation="fadeInUp">小米盒子3<span style="color: red">c</span></h1>
                        <h4 class="index-text-small-title aniview  " av-animation="fadeInUp" style="font-weight: bolder;font-size: 24px"> 4K 人工智能机顶盒</h4>
                        <p class="index-text-webfont aniview  " av-animation="fadeInUp" style="font-weight: bolder;font-size: 16px">4K 超高清机顶盒  |  64 位处理器  |  PatchWall 人工智能系统</p>
                        <div class="price aniview  " av-animation="fadeInUp">
                                <span class="price-num">
                                    <i class="" style="font-size: 60px ;font-style: normal;  text-align: center" >199</i>元
                                </span>
                                <del class="">
                                    <i class="num" style="font-style: normal">249</i>元
                                </del>
                            </div>

                    </div>

        </div>

        
        <div class="box-wall">
            <div class="wall-text">
                    
                            <h3 class="webfont wall-title aniview  " av-animation="fadeInUp">人工智能系统 PatchWall<br>打开电视就有你想看的大片</h3>
                            <p class="item-des aniview  " av-animation="fadeInUp">PatchWall 就是一个好看又贴心的看片助手。它不仅有美观的杂志式排版，无限翻滚的瀑布流，精心编排
                                <br>的个性专题，还能通过人工智能的科学运算，不断学习你和家人的观影习惯 ，实现因人而异的精准推荐。</p>
                            <p class="link item-des aniview  " av-animation="fadeInUp" style="color: #0e72c7">
                                <a href="javascript:; aniview  " av-animation="fadeInUp" >了解 PatchWall<span class="icon-next"></span></a>
                                <a href="javascript:; aniview  " av-animation="fadeInUp" >
                                    <span class="icon-play">
                                    </span>观看 PatchWall 介绍视频<span class="icon-next">
                                    </span>
                                </a>
                            </p>
                      

            </div>
            <div class="wall-img-group"></div>
                <!-- <div class="wall-img1">

                </div>
                <div class="wall-img2">

                </div>
                <div class="wall-img3">

                </div> -->
            </div>

        </div>

        <div class="box-screen">
                <div class="wall-text">
                       
                        <div class="wall-text-left aniview  " av-animation="fadeInUp">
                            <h2 class=" webfont">新内容天天有<br>好内容看不完</h2>
                        </div>
                        <div class="wall-text-right aniview  " av-animation="fadeInUp">
                            <p class="text">小米电视影视大联盟迎来内容新巨头：通过接入银河GITV集成平台，腾讯视频、PPTV体育版权内容全接入，内容总量暴增 1.8 倍。电影、综艺、电视剧、体育、少儿影视资源同步巨增。</p>
                        </div>
                            

                    </div>

                <div class="box-screen-pic">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators" >
                                  <li data-target="#carousel-example-generic" data-slide-to="0" class="active"><div class="Controls1 slide-one"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="1"><div class="Controls2 slide-two"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="2"><div class="Controls3 slide-three"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="3"><div class="Controls4 slide-four"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="4"><div class="Controls5 slide-five"></div></li>
                                </ol>
                              
                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox">
                                  <div class="item active">
                                    <img src="${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider1.jpg" alt="...">
                                    <div class="carousel-caption">
                                      ...
                                    </div>
                                  </div>
                                  <div class="item">
                                        <img src="${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider2.jpg" alt="...">
                                    <div class="carousel-caption">
                                      ...
                                    </div>
                                  </div>
                                  ...
                                  <div class="item">
                                        <img src="${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider3.jpg" alt="...">
                                    <div class="carousel-caption">
                                      ...
                                    </div>
                                  </div>
                                  <div class="item">
                                        <img src="${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider4.jpg" alt="...">
                                    <div class="carousel-caption">
                                      ...
                                    </div>
                                  </div>
                                  <div class="item">
                                        <img src="${base}/static/images/kun/ku/xiaomibox/index-tengxun-slider5.jpg" alt="...">
                                    <div class="carousel-caption">
                                      ...
                                    </div>
                                  </div>
                                </div>
                              
                                <!-- Controls -->
                                <!-- <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                  <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                  <span class="sr-only">Next</span>
                                </a> -->
                              </div>

                </div>

        </div>

        <div class="box-compare">
                <div class="wall-text">
                       
                                <h3 class="webfont wall-title compar-title aniview  " av-animation="fadeInUp">解码速度快如闪电<br>60 帧 4K 超高清视频，只需 1 秒</h3>
                                <p class="item-des aniview  " av-animation="fadeInUp">解码能力强大的小米盒子3c，就像一台高速运转的超级视频处理机。<br>一秒钟能处理 60 帧 4K 超高清内容，所以你在观看 4K 超高清影片时，画面更流畅，细节淋漓展现。</p>
                            

                    </div>
                <div class="box-compare-pic">
                        <div class="imgbox">
                                <div class="img00"> 
                                    <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="" >
                                </div>
                                <div class="img01"> 
                                    <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt=""> 
                                </div>
                                <div class="img02"> 
                                    <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                </div>
                                <div class="img03">
                                     <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                </div>
                                <div class="img04"> 
                                    <img style="width: 100%;height: 100%; object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                </div>
                            </div>
                            <div class="imgbox2">
                                    <div class="img0"> 
                                        <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="" >
                                    </div>
                                    <div class="img1"> 
                                        <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt=""> 
                                    </div>
                                    <div class="img2"> 
                                        <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                    </div>
                                    <div class="img3">
                                         <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                    </div>
                                    <div class="img4"> 
                                        <img style="width: 100%;height: 100%; object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                    </div>
                                    <div class="img5"> 
                                            <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="" >
                                        </div>
                                        <div class="img6"> 
                                            <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt=""> 
                                        </div>
                                        <div class="img7"> 
                                            <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                        </div>
                                        <div class="img8">
                                             <img style="width: 100%;height: 100%;object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                        </div>
                                        <div class="img9"> 
                                            <img style="width: 100%;height: 100%; object-fit: fill" src="${base}/static/images/kun/ku/xiaomibox/usl-pic-1.png" alt="">
                                        </div>
                             </div>
                             <div class="container">
                                    <div class="compare-left">
                                        <h4 class="item-title aniview  " av-animation="fadeInUp">小米盒子mini</h4>
                                        <p class="item-des  aniview  " av-animation="fadeInUp">每秒解码 30 帧视频</p>
                                    </div>
                                    <div class="compare-vs aniview  " av-animation="fadeInUp">VS</div>
                                    <div class="compare-right">
                                        <h4 class="item-title aniview  " av-animation="fadeInUp">小米盒子3c</h4>
                                        <p class="item-des aniview  " av-animation="fadeInUp"   >每秒解码 60 帧视频</p>
                                    </div>
                                </div>
                        
                </div>

        </div>

        <div class="box-game">
                <div class="wall-text">
                        <div class="container">
                                <div class="game-content">
                                    <h3 class="webfont item-title game-content-title aniview  " av-animation="fadeInUp">是电视盒子<br>也是游戏主机</h3>
                                    <p class="item-des game-content-webfont aniview  " av-animation="fadeInUp">4 核 64位高性能 CPU、3+2 核高性能图形处理、<br>1GB＋4GB内存闪存，加载影片、打开应用、<br>玩游戏都有飞快体验。</p>
                                    <div class="features aniview  " av-animation="fadeInUp">
                                      
                                            <div class="features-1" style="float: left;" >
                                                <span class="icon icon-1"></span>

                                                <span style="display: block;font-size: 18px; padding-top: 10px" >Cortex-A53<br>4 核 64位 CPU</span>
                                            </div>
                                            <div  class="features-2"style="float: left">
                                                <span class="icon icon-2"></span>
                                                <span style="display: block; font-size: 18px; padding-top: 10px">Mali-450<br>3+2核 GPU</span>
                                            </div>
                                            <div class="features-3" style="float: left">
                                                <span class="icon icon-3"></span>
                                                <span style="display: block;font-size: 18px; padding-top: 10px"> 1GB+4GB<br>内存闪存</span>
                                            </div>
                                        
                                    </div>
                                </div>
                            </div>

                    </div>

        </div>
        <div class="box-dts">
                <div class="wall-text">
                        <div class="content dts-content">
                                <h3 class="webfont item-title dts-title aniview  " av-animation="fadeInUp">视听的震撼，犹如影院一般</h3>
                                <p class="item-des dts-webfont aniview  " av-animation="fadeInUp">支持杜比数字+ 及 DTS 多声道高音质音频编码格式，在播放蓝光等高清视频时，声音更加平滑、<br>更具动态效果，带来身临其境的逼真立体环绕声音效。</p>
                                <div class="icon-dts  aniview  " av-animation="fadeInUp"></div>
                            </div>

                    </div>

        </div>

        <div class="box-use">
               
                        <div class="container">
                                <div class="use-container clearfix">
                                    <div class="group lanya">
                                        <div class="icon-lanya  aniview  " av-animation="fadeInUp"></div>
                                        <h4 class="item-title webfont group-font  aniview  " av-animation="fadeInUp">低功耗蓝牙4.1<br>可连接手柄、耳机、音箱</h4>
                                        <p class="item-des group-des  aniview  " av-animation="fadeInUp">蓝牙低功耗 4.1 把盒子变的更高效，让你<br>连接手柄、耳机、音箱等蓝牙等设备时更<br>便捷、稳定。</p>
                                    </div>
                                    <div class="group wifi">
                                        <div class="icon-wifi  aniview  " av-animation="fadeInUp"></div>
                                        <h4 class="webfont item-title group-font  aniview  " av-animation="fadeInUp">802.11ac 双频 WiFi<br>传输更快，下载更快</h4>
                                        <p class="item-des group-des  aniview  " av-animation="fadeInUp">更强的 WiFi 无线信号，传输速度更快，<br>满足高清视频以及大数据文件无线传输<br>和下载需求。</p>
                                    </div>
                                    <div class="group usb">
                                        <div class="icon-usb  aniview  " av-animation="fadeInUp"></div>
                                        <h4 class="webfont item-title group-font  aniview  " av-animation="fadeInUp">USB2.0<br>能本地播放，安装应用</h4>
                                        <p class="item-des group-des  aniview  " av-animation="fadeInUp">通过连接移动硬盘或 U 盘即可直接播放<br>本地大片，也可安装你喜欢的游戏、娱<br>乐影音等应用。</p>
                                    </div>
                                </div>
                            </div>


        </div>

        <div class="box-usb  aniview  " av-animation="fadeInUp">
                <h3 class="webfont item-title usb-title  aniview  " av-animation="fadeInUp">多种接口，多种用途</h3>
            <img src="${base}/static/images/kun/ku/xiaomibox/index-duogongneng-hezi.jpg" style="margin-left: 450px;margin-top: 100px"  alt="">

      
            
            </div>

        <div class="box-design">
                <div class="wall-text">
                        <div class="content">
                                <h3 class="webfont item-title desigin-title  aniview  " av-animation="fadeInUp">好设计，屡获国际大奖</h3>
                                <p class="item-des desigin-webfont  aniview  " av-animation="fadeInUp">小米盒子以简约的设计理念，受到了国际设计大奖青睐， <br>已获得 2017 年度德国 IF 设计大奖、德国工业设计大奖 reddot design 两项大奖。</p>
                            </div>

                    </div>


        </div>

        <dir class="box-foot">
            <div class="box-foot-img">
                <div class=" foot-content">
                    <span class="content">
                            <span class="footer-link-title webfont ">懂内容也懂你，<br>它就是 PatchWall！</span>
                            <span class="footer-link-btn">了解 PatchWall  &gt;</span>
                        </span>
                    </div>
            </div>

        </dir>
    </div>
</body>
<script src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.5/highlight.min.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${base}/static/js/kun/jquery.aniview.min.js"></script>
<script type="text/javascript">
var a=$(window).scrollTop();
            //动画添加
 $(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img01").addClass("img01ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img02").addClass("img02ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img03").addClass("img03ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img04").addClass("img04ani");
                }
})
//right
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img1").addClass("img1ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img2").addClass("img2ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img3").addClass("img3ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img4").addClass("img4ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img04").addClass("img04ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img5").addClass("img5ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img6").addClass("img6ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img7").addClass("img7ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img8").addClass("img8ani");
                }
})
$(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 3100) {
                    $(".img9").addClass("img9ani");
                }
})
 //文字出现效果
    $(document).ready(function(){
        var i={animateThreshold:100};
        $(".aniview").AniView(i),
        $(".code").each(function(i,e){hljs.highlightBlock(e)})});

        //控制循环
        $(".slide-one").hover(function(){
                $("#carousel-example-generic").carousel(0);
            });
            $(".slide-two").hover(function(){
                $("#carousel-example-generic").carousel(1);
            });
            $(".slide-three").hover(function(){
                $("#carousel-example-generic").carousel(2);
            });
            $(".slide-four").hover(function(){
                $("#carousel-example-generic").carousel(3);
            });
            $(".slide-five").hover(function(){
                $("#carousel-example-generic").carousel(4);
            });
</script>
</html>