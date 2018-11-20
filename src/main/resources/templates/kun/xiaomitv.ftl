<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${base}/static/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/animate.css/3.2.6/animate.min.css">
	<link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.4/styles/tomorrow.min.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/default.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/styles.css">
    <link rel="stylesheet" href="../xiaomi/css/xiaomitv.css">
    <style type="text/css">
    *{
    box-sizing: content-box;
}
.body{
    
    font: 14px/1.5 "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
    color: #333;
    background-color: #fff;
    min-width: 1226px;
}
.div{
    display: block;
}
.webfront{
    
    font-family: 'F9244e';
}
.container{
    padding-top: 40px;
    width: 1226px;
    margin-right: auto;
    margin-left: auto;
}
.text-c{
    text-align: center;
}
.col-fff {
    color: #fff;
}
.tv-banner{
    width: 100%;
    height: 1100px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_banner.jpg) no-repeat center center;
}
.tv-slider{
    width: 100%;
    height: 765px;
    /* background-color: yellow; */
}
.patchwall{
    width:100%;
    height: 1200px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_patchwall_bg.jpg) no-repeat center bottom;
}
.video-wrap{
    position: relative;
    width: 900px;
    height: 506px;
    margin-top: 105px;
    margin-left: 165px;
}
.vedio-btn{
    background-image: url(${base}/static/images/kun/ku/xiaomitv/index_patchwall_btn.png);
    position: absolute;
    left: 50%;
    top: 50%;
    width: 100px;
    height: 100px;
    margin: -50px 0 0 -50px;
    border: none;
    border-radius: 50%;
}
.tv-live{
    height: 1460px;
    width: 100%;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_haokan_bg_big.jpg) no-repeat ;
    background-position: center 407px;

}
.tv-hd{
    width: 100%;
    height: 1200px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_hd_bg.jpg) no-repeat center center;
}
.tv-protect{
    height: 1100px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_languang_bg.jpg) no-repeat center center;

}
.tv-ram{
    height: 1100px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_ram_bg.jpg) no-repeat center center;

}
.tv-game{
    position: relative;
    height: 1200px;
    overflow: hidden;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_game_bg1.jpg) no-repeat center center;

}
.tv-voice{
    height: 1250px;
    overflow: hidden;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_yinxiao_bg.jpg) no-repeat center center;
}
.tv-fix-slider{
    height: 1400px;
    overflow: hidden;
    /* background-color: royalblue; */
    }
.fix-slider{
    width: 100%;
    height: 800px;
    margin-top: 200px;
    /* background-color: darkmagenta; */
}

.tv-vip{
    height: 800px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_vip_bg.jpg) no-repeat center center;
}

.tv-install{
    height: 800px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_install_bg.jpg) no-repeat center center;
}
.tv-foot{
    height: 1000px;
    background: url(${base}/static/images/kun/ku/xiaomitv/index_property_bg.jpg) no-repeat center center;
}

.tv-banner h2{
    font-size: 60px;
    line-height: 80px;
    font-weight: normal;
}
.info{
    margin: 20px 0px 30px;
    font-size: 24px;
}
.price{
    font-size: 20px;
}
.remark{
    margin-top: 500px;
    color: #ccc;
    font-size: 14px;
}
.num{
    font-style: normal;
}
.price-num{
font-size: 30px;
font-style: normal;
font-family: 'Avenir';
}

.text-title{
    font-size: 60px;
    line-height: 80px;
}
.text-info{
    margin-top: 20px;
    font-size: 24px;
   
}

.col-000{
    color: #000;
}
.vip-left{
    float: left;
    width: 425px;
    margin-top: 190px;
}
.vip-right{
    float: right;
    width: 425px;
    margin-top: 190px;
}
ul{
    list-style-type: none;
}
.tv-hd ul{
    padding: 0;
   
}
.hd-info{
    margin-top: 550px;
}

.info li{
    float: left;
    display: block;
    width: 248px;
    height: 103px;
    margin: 3px 25px 20px;
    font-size: 30px;
    line-height: 103px;
    border: 1px solid #fff;
    border-radius: 5px;
}
li.long{
    width: 550px;
}
li.twolines{
    padding-top: 15px;
    height: 88px;
    line-height: 40px;
}
.tv-ram ul .li1{
    display: block;
   width: 520px;
   float: left;
   margin-left: -50px;


}
.tv-ram ul .li2{
    display: block;
    float: left;
    margin-left: -550px;
    margin-top: 150px;
   

}
.tv-ram ul .li3{
    display: block;
    float: left;
    margin-left: -278px;
    margin-top: 150px;
   

}
.line1{
    text-align: center;
    line-height: 50px;}

.tv-ram-title{
    font-size: 50px;
}
/* .game-title{
    padding-left: 716px;
    font-size: 50px;
} */
.tv-game .text{
    width: 540px;

margin-top: 170px;
margin: 190px 0 0 700px;
}
.tv-game .info{
    margin: 40px 0 0 700px;
}
.tv-game .text-c {

text-align: center;
}
.tv-game ul{
    padding: 0;
}
.tv-game .info li{
    float: left;

display: inline;

height: 88px;

padding-top: 15px;

margin: 0 20px 20px 0;

border: 1px solid #fff;

border-radius: 5px;
}
.tv-game .info .li1, .tv-game .info .li2, .tv-game .info .li3 {

width: 148px;
}
.tv-game .info .li4, .tv-game .info .li5 {

width: 233px;

}
.tv-game .text-c {

text-align: center;
}
.tv-game .info .line1 {

font-size: 30px;

}
.tv-game h2, .tv-game p, .tv-game ul {

margin: 0;

}
.tv-game .info .line1 {

    font-size: 30px;

}
.tv-game .info .line2 {

font-size: 15px;
text-align: center;
line-height: 20px;

}
.tv-foot{
 background-color: #fff;    
}
.tv-foot .info {

margin: 830px auto 0;
font-size: 30px;
}
.tv-foot ul {

padding: 0;

}
.tv-foot .info .first {

border-left: none;
}
.tv-foot .info li {

float: left;
padding-left: 4px;
border-right: 1px solid #e1e1e1;
border-left: 1px solid #f3f3f3;
font-size: 25px;
display: block;
width: 192px;
height: 100px;
margin: 6px 24px;
font-size: 25x;
line-height: 45px
}
.tv-banner.transi-up{
    opacity:0;
 filter:alpha(opacity=0)\9;
 transform:translate3d(0, 30px, 0);
}
/* .is-visible .transi-up {
 opacity:1;
 filter:alpha(opacity=100)\9;
 transition:all 1s;
 transform:translate3d(0, 0, 0);
 transition-delay:0
} */
.tv-banner.delay-05 {
 
 transition-delay:.5s
}
.circle {
    position: absolute;
    left: 0;
    top: 0;
    width: 1334px;
    height: 459px;
    background-color: #8175c9;
    border-radius: 50%;
    opacity: 0;
    filter: alpha(opacity=0)\9;
    -webkit-animation: spread 5s infinite;
    animation: spread 5s infinite;
        animation-delay: 0s;
}
@keyframes spread{
0% {
    -webkit-transform: scale(0);
    transform: scale(0);
    opacity: .2;
    filter: alpha(opacity=20)\9;
}
100% {
    -webkit-transform: scale(1);
    transform: scale(1);
    opacity: 0;
    filter: alpha(opacity=0)\9;
}
}
.circle1{
    animation-delay: 1s;
}
.circle2{
    animation-delay: 2s;
}
.circle3{
    animation-delay: 3s;
}
.circle4{
    animation-delay: 4s;
}
.circle-wrap2 {
    margin: 460px 0 0 170px;
}
 .circle-wrap1 {
    margin: 460px 0 0 -280px;
 }
.circle-wrap {
    position: relative;
 
}
.delay-05{
    animation-delay: .5s
}
.delay-10{
    animation-delay: 1s
}
.delay-12{
    animation-delay: 1.2s
}
.delay-14{
    animation-delay: 1.4s
}
.delay-16{
    animation-delay: 1.6s
}
.delay-18{
    animation-delay: 1.8s
}
.delay-22{
    animation-delay: 2.2s
}
.delay-20{
    animation-delay: 2s
}
img{
    display: block;
    margin: 0 auto;
}</style>
    
</head>
<body>
<div class="xiaomitv">
    <div class="tv-banner">
            <div class="container">
                    <div class="text col-fff text-c banner-text ">
                        <h2 class="transi-up webfont aniview  " av-animation="fadeInUp">千元新旗舰 <br>小米电视4A 32英寸</h2>
                        <p class="info transi-up delay-05 aniview  " av-animation="fadeInUp">64位四核处理器  |  1GB+4GB大内存  |  人工智能系统</p>
    
                        <div class="price transi-up delay-10 J_priceWrapper aniview  " av-animation="fadeInUp" data-gid="2172700021">
                            <span class="J_currentPrice ft-Avenir">
                                <i class="price-num num">899</i>元
                            </span>
                            <del class="J_originalPrice">
                                <i class="num">999</i>元
                            </del>
                            <!--<span>（含运费）</span>-->
                        </div>
                        <p class="remark" >*该电视含开关机等形式的广告，开关机时的广告视频不能删除、更改，且第三方内容的广告视频无法控制</p>
                    </div>
                </div>

    </div>

    <div class="tv-slider">
        
        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                  <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                  <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                  <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
              
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                  <div class="item active">
                    <img src="${base}/static/images/kun/ku/xiaomi/index_slider1_img1.jpg" alt="...">
                    <div class="carousel-caption">
                      ...
                    </div>
                  </div>
                  <div class="item">
                        <img src="${base}/static/images/kun/ku/xiaomi/index_slider1_img2.jpg" alt="...">
                    <div class="carousel-caption">
                      ...
                    </div>
                  </div>
                  ...
                  <div class="item">
                        <img src="${base}/static/images/kun/ku/xiaomi/index_slider1_img3.jpg" alt="...">
                    <div class="carousel-caption">
                      ...
                    </div>
                  </div>
                </div>
              
                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </a>
              </div>
        
        

    </div>

    <div class="patchwall">
            <div class="container">
                    <div class="text col-fff text-c patchwall-text">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">懂内容也懂你 <br>这就是人工智能系统</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">人工智能系统，根据你的喜好精准推荐内容</p>
                    </div>
                    <div class="video-wrap">
                        <video class="video" preload="auto" loop="" poster="${base}/static/images/kun/ku/xiaomitv/index_patchwall_img.jpg" src="${base}/static/images/kun/ku/xiaomitv/patchwall1.mp4" autoplay="autoplay">
                            <img src="${base}/static/images/kun/ku/xiaomitv/index_patchwall_img.jpg" alt="">
                        </video>t
                        <a class="vedio-btn">  </a>
                    </div>
                </div>
    </div>
    
    <div class="tv-live">
            <div class="container">
                    <div class="text col-000 text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">好看的不计其数 <br>高分的数不胜数</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">每个家庭成员，都可以找到想看的</p>
                    </div>
                </div>

    </div>

    <div class="tv-hd">
            <div class="container">
                    <div class="text col-fff text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">更清晰的高清屏 <br>新一代的画质引擎</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">画面更细腻逼真，色彩更明亮动人</p>
                    </div>
                    <ul class="info col-fff text-c hd-info">
                        <li class="long transi-up delay-05 aniview  " av-animation="fadeInUp">精细化的色彩模型</li>
                        <li class="twolines transi-up delay-12 aniview  " av-animation="fadeInUp">明暗 <br>层次优化</li>
                        <li class="twolines transi-up delay-14 aniview  " av-animation="fadeInUp">场景 <br>自适应降噪</li>
                        <li class="transi-up delay-16 aniview  " av-animation="fadeInUp">边框检测</li>
                        <li class="transi-up delay-18 aniview  " av-animation="fadeInUp">动态黑白延伸型</li>
                        <li class="transi-up delay-20 aniview  " av-animation="fadeInUp">动态降噪</li>
                        <li class="transi-up delay-22 aniview  " av-animation="fadeInUp">颜色保真</li>
                    </ul>
                </div>

    </div>

    <div class="tv-protect">
            <div class="container">
                    <div class="text col-000 text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">护眼模式 <br> 爱护孩子的眼睛</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">屏幕可调至护眼模式，有效缓解眼疲劳</p>
                    </div>
                </div>

    </div>

    <div class="tv-ram">
           
                <div class="container">
                        <div class="text col-fff text-l">
                            <h2 class="text-title webfont transi-up tv-ram-title aniview  " av-animation="fadeInUp">1GB <span>RAM</span> + 4GB <span>ROM</span> 大内存 <br>64位四核处理器</h2>
                            <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">是大容量的电视机，也是有速度的游戏机</p>
                        </div>
                        <ul class="info col-fff text-c ram-info">
                            <li class="li1 transi-up delay-10 aniview  " av-animation="fadeInUp">
                                <div class="line1">Cortex A53 4核 <br>主频高达1.5GHz</div>
                                
                            </li>
                            <li class="li2 transi-up delay-12 aniview  " av-animation="fadeInUp">
                                <div class="line1">Mali-450 <br> 750MHz</div>
                               
                            </li>
                            <li class="li3 transi-up delay-14 aniview  " av-animation="fadeInUp">
                                <div class="line1">大内存 <br>1GB+4GB </div>
                                
                            </li>
                        </ul>
                    </div>

    </div>

    <div class="tv-game">
            <div class="container">
                    <div class="text col-fff text-l">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">能做电脑显示器 <br>还能手机投屏玩游戏</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">接口多，玩法多，电视就是娱乐中心</p>
                    </div>
                    <ul class="info col-fff text-c">
                        <li class="li1 transi-up delay-10 aniview  " av-animation="fadeInUp">
                            <p class="line1">HDMI</p>
                            <p class="line2">连接电脑</p>
                        </li>
                        <li class="li2 transi-up delay-12 aniview  " av-animation="fadeInUp">
                            <p class="line1">USB</p>
                            <p class="line2">插U盘播视频</p>
                        </li>
                        <li class="li3 mr0 transi-up delay-14 aniview  " av-animation="fadeInUp">
                            <p class="line1">AV接口</p>
                            <p class="line2">连接游戏主机</p>
                        </li>
                        <li class="li4 transi-up delay-16 aniview  " av-animation="fadeInUp">
                            <p class="line1">以太网接口</p>
                            <p class="line2">连接有线网络</p>
                        </li>
                        <li class="li5 mr0 transi-up delay-18 aniview  " av-animation="fadeInUp">
                            <p class="line1">WIFI无线投屏</p>
                            <p class="line2">手机、pad、笔记本都能投</p>
                        </li>
                    </ul>
                </div>

    </div>

    <div class="tv-voice">
            <div class="container">
                    <div class="text col-fff text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">立体声扬声器 <br>大片音效更震撼</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">看电影、看美剧，看什么都身临其境</p>
                    </div>
                    <div class="circle-wrap circle-wrap1">
                        <div class="circle circle1"></div>
                        <div class="circle circle2"></div>
                        <div class="circle circle3"></div>
                        <div class="circle circle4"></div>
                    </div>
                    <div class="circle-wrap circle-wrap2">
                        <div class="circle circle1"></div>
                        <div class="circle circle2"></div>
                        <div class="circle circle3"></div>
                        <div class="circle circle4"></div>
                    </div>
                    <div class="img"></div>
                </div>

    </div>

    <div class="tv-fix-slider">
            <div class="container">
                    <div class="text col-000 text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">小空间的好选择 <br>卧室、客厅都适合</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">体积小、不占地，更好的融入每个空间</p>
                    </div>
                </div>

            <div class="fix-slider">
                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                              <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                              <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                              <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            </ol>
                          
                            <!-- Wrapper for slides -->
                            <div class="carousel-inner "   role="listbox">
                              <div class="item active ">
                                <img src="${base}/static/images/kun/ku/xiaomitv/index_slider3_img1.jpg"   alt="...">
                                <div class="carousel-caption">
                                  ...
                                </div>
                              </div>
                              <div class="item">
                                    <img src="${base}/static/images/kun/ku/xiaomitv/index_slider3_img2.jpg" alt="...">
                                <div class="carousel-caption">
                                  ...
                                </div>
                              </div>
                              ...
                              <div class="item">
                                    <img src="${base}/static/images/kun/ku/xiaomitv/index_slider3_img3.jpg" alt="...">
                                <div class="carousel-caption">
                                  ...
                                </div>
                              </div>
                              <div class="item">
                                    <img src="${base}/static/images/kun/ku/xiaomitv/index_slider3_img4.jpg" alt="...">
                                <div class="carousel-caption">
                                  ...
                                </div>
                              </div>
                            </div>
                          
                            <!-- Controls -->
                            <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                              <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                              <span class="sr-only">Previous</span>
                            </a>
                            <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                              <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                              <span class="sr-only">Next</span>
                            </a>
                          </div>
            </div>

    </div>
    
    <div class="tv-vip">
            <div class="container">
                    <div class="text vip-left col-fff text-l">
                        <div class="img img1 transi-up aniview  " av-animation="fadeInUp"><img data-src="" src="${base}/static/images/kun/ku/xiaomitv/index_vip_img1.png"></div>
                        <p class="line transi-up delay-05"></p>
                        <h2 class="text-title webfont transi-up delay-10 aniview  " av-animation="fadeInUp">小米影视会员</h2>
                        <p class="text-info transi-up delay-12 aniview  " av-animation="fadeInUp">成为会员可享受“小米影视会员年卡（价值498元）+爱奇艺VIP会员年卡（价值198元）”双卡的全部权益，价值696元，随电视加价购可享受小米补贴价，超值特惠首年仅需299元。</p>
                    </div>
                    <div class="text vip-right col-fff text-l">
                        <div class="img img2 transi-up aniview  " av-animation="fadeInUp"><img data-src="" src="${base}/static/images/kun/ku/xiaomitv/index_vip_img2.png"></div>
                        <p class="line transi-up delay-05"></p>
                        <h2 class="text-title webfont transi-up delay-10 aniview  " av-animation="fadeInUp">小米儿童会员</h2>
                        <p class="text-info transi-up delay-12 aniview  " av-animation="fadeInUp">为0-8岁儿童精心挑选34万分钟全球30个国家和地区优质动画，寓教于乐，抓住儿童成长敏感期，分龄推荐适合动画，激发儿童智力潜能，培养良好的语言能力，动手能力，记忆力，逻辑思维和社会能力。</p>
                    </div>
                </div>
           

    </div>

    <div class="tv-install">
            <div class="container">
                    <div class="text col-000 text-c">
                        <h2 class="text-title webfont transi-up aniview  " av-animation="fadeInUp">安装服务</h2>
                        <p class="text-info transi-up delay-05 aniview  " av-animation="fadeInUp">贴心的安装服务，挂装、座装任你选择</p>
                        <a class="link transi-up delay-10 aniview  " av-animation="fadeInUp" href="javascript:;" >了解安装服务和价格 &gt;</a>
                    </div>
                </div>


    </div>

    <div class="tv-foot">
            <div class="container">
                    <ul class="info col-000">
                        <li class="first text-c transi-up aniview  " av-animation="fadeInUp">人工智能系统<br>海量影视资源</li>
                        <li class=" first text-c transi-up delay-05 aniview  " av-animation="fadeInUp">高清液晶屏<br>新一代画质引擎</li>
                        <li class=" first text-c transi-up delay-10 aniview  " av-animation="fadeInUp">64位四核处理器<br>1GB+4GB大内存</li>
                        <li class=" first text-c transi-up delay-12 aniview  " av-animation="fadeInUp">立体声<br>扬声器</li>
                        <li class=" first last text-c transi-up delay-14 aniview  " av-animation="fadeInUp">仅重4kg<br>移动方便</li>
                    </ul>
                </div>


    </div>
</div>    


</body>
<script src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.5/highlight.min.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${base}/static/js/kun/jquery.aniview.min.js"></script>
<script type="text/javascript">

    $(document).ready(function(){
        $('.carousel').carousel({
	interval: 2000})

        var i={animateThreshold:100};
        $(".aniview").AniView(i),
        $(".code").each(function(i,e){hljs.highlightBlock(e)})});
</script>
</html>