<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${base}/static/css/qiqi/fonts/purifier.css">
    <style type="text/css">
        body{
   
    width: 1349px;
    height: auto;
    margin: 0 auto;
    padding: 0;
    color: #333;
}
.section-items{
    position: relative;
    overflow: hidden;
    background-repeat: no-repeat;
    background-position: center center;
    width: 1349px;
    float: left;

}
.container{
    width: 1349px;
    height: auto;
}
.container-intro{
    height: 945px;
}
.container-intro-content{
    position: absolute;
    z-index: 3;
    top: 110px;
    height: 300px;
    text-align: center;
}

.container-tail-a{
    display: inline-block;
    margin: 0 auto;
    width: 156.08px;
    height: 30px;
    text-decoration: none;
    margin: 13px 0 0 0;

}
.container-tail-a-img{
    position: relative;
    display: inline-block;
    float: left;
    margin: -2px 8px 0 0;
    width: 24px;
    height: 24px;
    background: url(${base}/static/images/qiqi/icon_jnbt.png) no-repeat center;
}
.container-tail-a span{
    display: inline-block;
    width: 122.38px;
    height: 19px;
}
.bg{
    position: absolute;
    z-index: 1;
    top: 0;
    left: 0;
    height: 945px;
    background: url(${base}/static/images/qiqi/summary-intro.jpg) no-repeat center;
    transition: all 2s ease;
    transform: scale(2);
}
.bg-mask{
    position: absolute;
    display: block;
    z-index: 2;
    top: 0;
    left: 0;
    height: 945px;
    background-color: rgba(0,0,0,0.5);
    transition: all 2s;
}
.container-size{
    height: 1480px;
    background: rgb(245, 245, 245);
}
.container-size-content{
    margin: 148px 0 0 0;
    height: 450px;
    text-align: center;
}
.size-text{
    height: 472px;
}
.size-img{
    position: absolute;
    bottom: 0px;
    z-index: 1;
    height: 128px;
    overflow: hidden;
}
.size-img-i{
    margin: -2px 410px;
    display: block;
    width:  535px;
    height: 130px;
    background:url(${base}/static/images/qiqi/summary-size-spec2.png) no-repeat center;
    background-position: 0 0;
    overflow: hidden;
}
.container-size-img{
    position: relative;
    top: 0;
    height: 960px;
    background: url(${base}/static/images/qiqi/summary-size.jpg) no-repeat center;
    margin: 0 auto;
    overflow: hidden;
}
.container-scene-1{
    height: 800px;
    background-position: 0 center;
    overflow: hidden;
}
.container-scene-1-img{
    position: absolute;
    top: -30px;
    height: 1200px;
    background: url(${base}/static/images/qiqi/summary-scene-1.jpg) no-repeat center;
    overflow: hidden;
    background-position: center 0;
    transform: translateY(0);
    display: inline-block;
    transition: all 1s linear;
   
}
.container-feature-5{
    height: 1480px;
    background:rgb(245, 245, 245);
}

.container-feature-5-text{
    margin: 144px 0 25px 0;
    text-align: center;
}
.container-feature-5-img{
    position: relative;
    height: 1000px;
    text-align: center;
}
.feature-5-img-1{
    position: absolute;
    z-index: 3;
    bottom: 0;
    left: 342px;
    width: 665px;
    height: 826px;
    background: url(${base}/static/images/qiqi/summary-feature-5.jpg) no-repeat center;
    transition: all 1s ease;
    opacity:1;
    /* display:block; */
    overflow: hidden;
}
.feature-5-img-2{
    position: absolute;
    z-index: 2;
    bottom: 0;
    left: 521.5px;
    width: 306px;
    height: 626px;
    background: url(${base}/static/images/qiqi/summary-feature-3.png) no-repeat center !important;
    
    display: block;
    transition: all 2s ease;
    transform: scale(1);
    background:rgb(245, 245, 245);
}
.feature-5-img-3{
    position: absolute;
    z-index: 1;
    align-self:center;
    left: 61.5px;
    width: 1226px;
    height: 930px;
    background: url(${base}/static/images/qiqi/summary-feature-6.jpg) no-repeat center;
    /* display: none; */
    transition: all 6s;
    opacity: 0;
}

.container-scene-2{
    height: 800px;
    overflow: hidden;
    background-position: 0 center;
    background:rgb(245, 245, 245);
}

.container-scene-2-img{
    top: -30px;
    transform: translateY(0);
    transition: all 1s linear;
    position: absolute;
    top: 0;
    height: 1200px;
    overflow: hidden;
    background-position: center 0;
    background: url(${base}/static/images/qiqi/summary-scene-2.jpg) no-repeat center;
}

.container-filter{
    position: relative;
    top: 0;
    height: 1280px;
    text-align: center;
    overflow: hidden;
    background:rgb(245, 245, 245);
    background-position: 0 center;
}
.container-filter-1{
    position: absolute;
    z-index: 1;
    top: 0;
    left: 61.5px;
    width: 1226px;
    height:960px;
    margin: 0 auto;
    background: url(${base}/static/images/qiqi/summary-filter.png) no-repeat center;
    background-position: center 0;
    overflow: hidden;
    float: left;
}
.container-filter-2{
    z-index: 2;
    position: absolute;
    top: 0;
    left: 61.5px;
    width: 1226px;
    height: 960px;
    margin: 0 auto;
    background: url(${base}/static/images/qiqi/summary-filter-2.png) no-repeat center;
    background-position: center 0;
    float: left;
}
.container-filter-text{
    position: absolute;
    bottom:116px;
    height: 300px;
    text-align: center;
    float: left;
}

.room{
    height: 980px;
    background: url(${base}/static/images/qiqi/summary-room.png) no-repeat;
    background-position: center 0;
}
.room-tip{
    top:  16px;
    display: block;
    padding-right: 62px;
    text-align: center;
    position: relative;
    margin: 38px 0 62px 0;

}
.room-box{
    position: relative;
    margin: 0 auto;
    width: 1226px;
    height: 470px;

}
.room-text-1{
    display: block;
    width: 60px;
    position: absolute;
    left: 850px;
    top: 100px;
    text-align: center;
}
.room-text-2{
    display: block;
    left: 585px;
    top: 0;
    width: 60px;
    position: absolute;
    text-align: center;

}
.room-text-3{
    display: block;
    width: 60px;
    position: absolute;
    left: 1080px;
    top: 225px;
    text-align: center;
}
.room-text-4{
    left: 85px;
    top: 110px;
    display: block;
    width: 60px;
    position: absolute;
    text-align: center;
}

.room-1{
    position: absolute;
    width: 497px;
    height: 317px;
    top: 134px;
    left: 439px;
    border-radius: 160px 100px;
    z-index: 3;
    background-repeat: no-repeat;
    background: url(${base}/static/images/qiqi/summary-room-1.png);
    transition: all .5s;
    opacity: 1;
}

.room-2{
    position: absolute;
    background-repeat: no-repeat;
    transition: all .5s;
    width: 430px;
    height: 282px;
    top: 30px;
    left: 266px;
    background: url(${base}/static/images/qiqi/summary-room-2.png);
    opacity: 0;
}

.room-3{
    position: absolute;
    background-repeat: no-repeat;
    transition: all .5s;
    width: 244px;
    height: 189px;
    top: 284px;

    left: 898px;
    background: url(${base}/static/images/qiqi/summary-room-3.png);
     opacity: 0;
}
.room-4{
    position: absolute;
    background-repeat: no-repeat;
    transition: all .5s;
    width: 329px;
    height: 233px;
    top: 136px;
    left: 72px;
    z-index: 2;
    border-radius: 110px 80px;
    background: url(${base}/static/images/qiqi/summary-room-4.png);
     opacity: 0;
}
.room-tab-active{
    opacity: 1;
}
.room-airimg{
    display: block;
    z-index: 4;
    width: 55px;
    height: 97px;
    position: absolute;
    top: 50%;
    left: 50%;
    transition: all .4s;
    background: url(${base}/static/images/qiqi/summary-room-air.png) no-repeat;
}
.room-airimg-hide{
    visibility:hidden;
    /* 控制房子里面空气净化器的消失 visible出现*/
}
.room-airimg-show{
    visibility: visible;
}
.room-airimg-1{
    margin-left: -38px;
    margin-top: -58px;
}

.room-airimg-2{
    margin-left: -33px;
    margin-top: -73px;
}
.room-airimg-3{
    margin-left: -33px;
    margin-top: -61px;
}
.room-airimg-4{
    margin-left: -33px;
    margin-top: -64px;
}
.room-text-tail{
    height: 154px;
    float: left;
    text-align: center;
    margin: 148px 0 0 0
}
.container-scene-3{
    overflow: hidden;
    background-position: 0 center;
    height: 800px;
}
.container-scene-3-img{
    position: absolute;
    top: -30px;
    transform: translateY(0);
    transition: all 1s linear;
    overflow: hidden;
    background-position: center 0;
    background: url(${base}/static/images/qiqi/summary-scene-3.jpg) no-repeat center;
    height: 1200px;
}
.container-app{
    height: 1040px;
    background: url(${base}/static/images/qiqi/summary-app.jpg) no-repeat center;
}
.container-app-content{
    width: 1111px;
    height: 650px;
    margin: 186px 119px 0 119px;
}
.app-text{
    width: 436px;
    height: 650px;
    margin:0 115px 0 60px;
    padding: 12px 0 0 0;
    float: left;

}
.app-vodeo{
    width: 364px;
    height: 649px;
    float: left;
}
.container-lisence{
    height: 1240px;
    background: url(${base}/static/images/qiqi/summary-lisence.jpg)no-repeat;
    background-position:center bottom ;
    
}
.lisence-text{
    float: left;
    margin: 135px 0 0 300px;

}
.lisence-img{
    position: absolute;
    top:556px;
    left: 300px;
    width: 140px;
    height: 160px;
    background: url(${base}/static/images/qiqi/summary-lisence-spec.png);
    background-position: 0 160px;
}
.container-next{
    height: 340px;
    background:url(${base}/static/images/qiqi/summary-next.jpg) repeat-x center;
}
.next-text{
    height: 118px;
    margin: 100px 0 0 0;
    padding:0 0 0 286px;
}
.next-text-a{
    text-decoration: none;
}
.container-buy{
    height: 440px;
    background: url(${base}/static/images/qiqi/summary-buy.jpg) no-repeat center;
}
.buy-content-text{
    height: 232px;
    margin-left: 240px;
    margin-top: 100px;
}.buy-text{
    height: 117px;
    float: left;
}
.buy-a{
    display: inline-block;
    background-color: #329cff;
    border-color: #329cff;
    color: #fff;
  margin: 40px 0 0 0;
    text-decoration: none;
    text-align: center;
    height: 58px;
    line-height: 58px;
    width: 248px;
    font-size: 20px;
    margin-bottom: 15px;
    transition: all .4s;
}
.container-text{
    height: 309px;
    text-align: left;
    background-color: #eee;
}
.container-text span{
    display: block;
    margin: 0 auto;
    width: 990px;
    height: 36px;

}
.container-text ol{
    display:block;
    width: 990px;
    height: 169px;
    margin: 0 auto;
    line-height: 20px;
}
.container-text ol{
    display: block;
}
.container-text a{
    text-decoration: none;
    color: #329cff;
}
.footer{
    position: relative;
    bottom: 0;
    float: left;
    width: 1349px;
    height: 196px;
    background: rgb(250, 250, 250);
}
.footer-content{
    width: 613px;
    height: 100px;
    margin: 0 auto;
    padding: 45px 0;
}
.footer-content-pic{
    width: 100px;
    height: 100px;
    float: left;
}
.footer-content-font{
    width: 400px;
    height: 72px;
    float: left;
    margin:15px 0 0 35px;
}   
    </style>
</head>

<body>
    <div class="container">
        <div class="container-intro section-items">
            <div class="container-intro-content section-items">
                <span class="container-h-a">小米空气净化器 2</span>
                <br>
                <br>
                <span class="container-word">颗粒物 CADR 高达 310m
                    <sup>3</sup>/h
                    <br> 房间空气迅速焕然一新
                </span>
                <br>
                <br>
                <br>
                <span class="container-tail">699元</span>
                <br>
                <a href="JavaScript:" class="container-tail-a">
                    <i class="container-tail-a-img"></i>
                    <span>北京居民节能补贴&gt;</span>
                </a>
            </div>
            <div class="bg section-items"></div>
            <div class="bg-mask section-items"></div>
        </div>
        <div class="container-size section-items">
            <div class="container-size-content section-items">
                <div class="size-text">
                    <span class="size-h">又简单 又美好
                        <br> 房间空气迅速焕然一新
                        <sup>①</sup>
                    </span>
                    <br>
                    <br>
                    <br>
                    <span class="size-word">高效的净化能力，安静舒适的工作表现，小巧自然的融入家居风格中。我们重新设计了小米空气净化器 2 ，研发出新的
                        <br> 空气增压系统，颗粒物 CADR 高达 310m
                        <sup>3</sup>/h
                        <sup>②</sup>。如此高性能的净化能力，体积却比第一代减小40%。它可以根据你每
                        <br> 一个房间的面积，调整至最高效的净化效率，洁净的空气充满整个房间，家不仅仅是房子，更是一种你最舒适、健康的
                        <br> 生活方式。
                    </span>
                </div>
                <div class="size-img section-items">
                    <i class="size-img-i"></i>
                </div>
            </div>
            <div class="container-size-img section-items"></div>
        </div>
        <div class="container-scene-1 section-items">
            <div class="container-scene-1-img section-items">

            </div>
        </div>

        <div class="container-feature-5 section-items">
            <div class="container-feature-5-text">
                <span class="size-h">全新空气增压系统
                    <br> 让洁净的空气 吹遍房间的每个角落
                    <br>

                </span>
                <br>
                <br>
                <br>
                <span class="size-word">高性能的净化效果，源于房间内的空气以大循环方式持续流动。
                    <br> 工程师在研发中从飞机引擎中得到了灵感，在小体积内创造出强大吸力与风力的空气增压系统。
                    <br> 当你按下“开始”键，通过高效净化滤芯的洁净空气，就开始在整个房间流动。从上方冲至天花板，再沿着墙壁、地面四散至整个房间，形成屋内大循环。
                    <br> 当你回家前，还可以用手机远程调至超强模式，极速清洁空气
                    <sup>③</sup>。
                </span>
                <br>
                <br>
                <a class="feature-5-a" href="JavaScript:">了解净化原理 ></a>
            </div>
            <div class="container-feature-5-img section-items">
                <div class="feature-5-img-1"></div>
                <div class="feature-5-img-2"></div>
                <div class="feature-5-img-3"></div>
            </div>
        </div>

        <div class="container-scene-2 section-items">
            <div class="container-scene-2-img section-items"></div>
        </div>
        <div class="container-filter section-items">
            <div class="container-filter-1"></div>
            <div class="container-filter-2"></div>
            <div class="container-filter-text section-items">
                <span class="size-h">高效净化滤芯，360
                    <sup>°</sup>进风 3层净化
                    <br>

                </span>
                <br>
                <br>
                <br>
                <span class="size-word">洁净的空气不仅需要大循环动力系统，净化的核心来自于高效净化滤芯。摒弃只能从一个方向进气的低效传统过滤器，一体式 360°桶形滤芯，
                    <br> 三层净化。初效滤网拦截例如毛发、灰尘等大颗粒悬浮物。第二层高性能过滤器，可去除小至微米级的微小颗粒，还可阻挡致病细菌
                    <sup>④</sup>。
                    <br> 高品质活性炭，可高效吸附甲醛等有害物质，有效去除空气中的异味。滤芯用尽时，将自动提醒，手机一键下单，即可购买到正品滤芯。
                    <br>

                </span>
                <br>

                <a class="feature-5-a" href="JavaScript:">了解滤芯 ></a>
            </div>
        </div>
        <div class="room section-items">
            <p class="room-text room-tip">鼠标滑过不同房间，看看净化效果
                <sup>⑤</sup>
            </p>
            <div class="room-box">

                <span class="room-text room-text-1">客厅</span>
                <span class="room-text room-text-2">卧室</span>
                <span class="room-text room-text-3">婴儿房</span>
                <span class="room-text room-text-4">书房</span>
                <div class="room-1">
                    <i class="room-airimg room-airimg-1 room-airimg-show"></i>
                </div>
                <div class="room-2">
                    <i class="room-airimg room-airimg-2"></i>
                </div>
                <div class="room-3">
                    <i class="room-airimg room-airimg-3"></i>
                </div>
                <div class="room-4">
                    <i class="room-airimg room-airimg-4"></i>
                </div>

            </div>
            <div class="room-text-tail section-items">
                <span class="room-text-tail-h">客厅净化</span>
                <br>
                <br>
                <span class="room-text-tail-word">坐在刚刚装修好的书房，一会儿就会觉得喉咙发痒？小米空气净化器 2 可以有效去除甲醛，清洁空气中的各
                    <br>种化学污染物或烟味。源源不断的洁净空气，帮助你更专注在你的工作或阅读中。</span>
            </div>
        </div>
        <div class="container-scene-3 section-items">
            <div class="container-scene-3-img section-items"></div>
        </div>

        <div class="container-app section-items">
            <div class="container-app-content">
                <div class="app-text">
                    <span class="size-h">手机智能控制
                        <br> 家里空气质量一目了然
                        <br>

                    </span>

                    <br>
                    <br>
                    <span class="size-word">用 WiFi 连接到手机，就可使用小米智能家庭 App，实时查看室外与家中的空气质量变化，并根据居室面积调整合适的
                        <br> 工作模式。更令人兴奋的是，它还可以聪明地学习你的使用
                        <br> 习惯，例如在你入睡前，自动调整成睡眠模式，外出时，自动关闭净化器。新增温度、湿度感应，为舒适的家，提供洁净的空气与更多可视化健康提示。
                        <br>


                    </span>
                    <br>
                    <a class="feature-5-a" href="JavaScript:">了解智能控制 ></a>
                </div>
                <div class="app-vodeo">
                    <video id="appVideo" data-src="${base}/static/images/qiqi/summary-app.mp4" src="../../images/xiaomi/summary-app.mp4"muted loop="loop" poster="../../images/xiaomi/summary-app-poster.jpg" autoplay="autoplay">
                        <!-- <source data-src="../../images/xiaomi/summary-app.mp4" type="video/mp4">
                        <source data-src="../../images/xiaomi/summary-app.webm" type="video/webm"> -->
                        <!-- <img src="../../images/xiaomi/summary-app-poster.jpg" alt="小米空气净化器2"> -->
                    </video>
                </div>
            </div>
        </div>
        <div class="container-lisence section-items">
            <div class="lisence-text section-items">
                <span class="size-h">岁月静好
                    <br> 更静音 更省电
                    <br>

                </span>

                <br>
                <br>
                <span class="size-word">“晚安，好梦” 不仅是睡前的祝福，更是我们设计净化器时对美好生活的期望。运用空气
                    <br>动力学，将气流经过的每一个细节都精心设计，保证在风力顺畅的基础上减少风阻产生
                    <br>的噪音。睡眠模式可静音工作，如清风拂动的宁静，几乎难以感受到它在工作。定制日
                    <br>本 Nidec 电机，功耗降低58%，普通工作模式下仅 4.8W
                    <sup>⑥</sup>，比节能灯泡耗电量还低。你
                    <br>可以安心的在洁净的空气中，伴着细微均匀的风声，酣然入梦。


                </span>
            </div>
            <div class="lisence-img"></div>
        </div>
        <div class="container-next section-items">
            <div class="next-text">
                <a class="next-text-a">
                    <span class="size-h">继续了解 净化原理>
                        <br>

                    </span>

                    <br>
                    <br>
                    <span class="size-word">全新的空气增压系统，大循环高效净化室内空气。


                    </span>
                </a>
            </div>
        </div>
        <div class="container-buy section-items">
            <div class="buy-content-text section-items">
                <div class="buy-text section-items">
                    <span class="size-h">小米空气净化器 2
                        <br>

                    </span>

                    <br>
                    <span class="size-word">颗粒物 CADR 高达 310m3/h
                        <br> 房间空气迅速焕然一新


                    </span>
                </div>
                <a href="JavaScript:" class="buy-a">立即购买</a>
            </div>
        </div>
        <div class="container-text section-items">
            <br>
            <span class="container-text-word">CADR(clean air delivery rate), 洁净空气量，是指空气净化器在额定状态和规定的试验条件下，针对目标污染物（颗粒物和气态污染物）净化能力的参数；表示空气净化器提供洁净空气的
                <br>速率。其单位是立方米每小时（m
                <sup>3</sup>/h）。</span>
            <br>
            <ol class="container-text-word">
                <li>适用面积通过 CADR 值计算得出, 适用面积的大小同样受空间高度和容积率等因素的影响。小米空气净化器2 的适用面积依据《空气净化器》(GB/T 18801-2015)测算：适用面积 =
                    <br>CADR
                    <sup>*</sup>(0.07～0.12)，数据出自于广州工业微生物检测中心CADR值检测报告。</li>
                <li>安装小米智能家庭 App，可根据需求，选择性开启超强模式，产品噪音会有一定程度的增加。</li>
                <li>高性能过滤滤材，可去除超细微粒污染物，包括空气中的过敏源（花粉、尘螨、宠物皮屑、霉菌等）以及细菌和部分病毒。</li>
                <li>根据广州工业微生物检测中心CADR值检测报告，推算所得。检测报告编号： KJ20150978。</li>
                <li>在小米空气净化器 2 超强模式下，对比小米空气净化器 1 超强模式下 功率数据对比，自动1档模式工作仅为4.8W。</li>
                <li>产品外观细节会因生产批次不同而有所区别，如有细节变动，恕不另行通知。
                    <br> 以上数据实际情况会因测试软件版本、具体测试环境、具体版本不同，而略有差异。
                </li>
            </ol>
            <br>
            <span class="size-word">特别鸣谢上坐家居设计体验馆（798店、皇家粮仓店）对拍摄的大力支持。
                <a href="JavaScript:">参与有奖活动 ></a>
            </span>
        </div>
        <div class="footer">
            <div class="footer-content">
                <div class="footer-content-pic">
                    <img src="${base}/static/images/qiqi/b30def5a8f0e967d128dec2b49751aa6.png" width="100%" height="100%">
                </div>
                <div class="footer-content-font">
                    <span class="footer-content-font-h">扫码关注【
                        <span class="footer-content-font-h-m">小米商城</span>】公众号</span>
                    <br>
                    <span class="footer-content-font-tail">回复“真心想要”，免费赢小米手环3！</span>
                </div>
            </div>
        </div>
    </div>




    <script src="${base}/static/js/jquery-2.1.1.min.js"></script>
    <script>
        $(function () {

            $(".bg-mask").hide("2000");
            $(".bg").css("transform", "scale(1)");
            $(".container-word").css("opacity", "1");
            $(".container-intro-content span:first").removeClass("container-h-a").addClass("container-h-b");


            $(".room-1").mouseover(function(){
                $(".room-1").css("opacity","1");
            }).mouseout(function(){
                $(".room-1").css("opacity","0");
            });
            $(".room-2").mouseover(function(){
                $(".room-1").css("opacity","0");
                $(".room-2").css("opacity","1");
            }).mouseout(function(){
                $(".room-2").css("opacity","0");
            });
            $(".room-3").mouseover(function(){
                $(".room-1").css("opacity","0");
                $(".room-3").css("opacity","1");
            }).mouseout(function(){
                $(".room-3").css("opacity","0");
            });
            $(".room-4").mouseover(function(){
                $(".room-1").css("opacity","0");
                $(".room-4").css("opacity","1");
            }).mouseout(function(){
                $(".room-4").css("opacity","0");
            });
            // var a=$(window).scrollTop();
            // alert(a);
            // document.body.scrollHeight
            $(window).scroll(function () {
                // 窗口向下图片向上移动
                var height = $(window).scrollTop();
                if (height >= 2200 && height<=3100) {
                    var topchange = (height-2500)/10;
                    topchange = parseInt(topchange);
                    var a =(-topchange)+"px";
                    // alert(a);
                
                    // var b = translateY(a);
                    // alert(b);
                    // alert(topchange);
                    // alert(a);

                    $(".container-scene-1-img").css("transform","translateY("+a+")");
                }
               
                if (height >= 4503 && height<=5403) {
                    var topchange = (height-4503)/10;
                    topchange = parseInt(topchange);
                    var a =(-topchange)+"px";
                    // alert(a);
                
                    // var b = translateY(a);
                    // alert(b);
                    // alert(topchange);
                    // alert(a);

                    $(".container-scene-2-img").css("transform","translateY("+a+")");
                }
                if (height >= 7503 && height<=8503) {
                    var topchange = (height-7503)/10;
                    topchange = parseInt(topchange);
                    var a =(-topchange)+"px";
                    // alert(a);
                
                    // var b = translateY(a);
                    // alert(b);
                    // alert(topchange);
                    // alert(a);

                    $(".container-scene-3-img").css("transform","translateY("+a+")");
                }
                if(height>3500) {
                    // $(".feature-5-img-1").hide("2000");

            $(".feature-5-img-1").hide("2000");
            $(".feature-5-img-2").show("4000");
            $(".feature-5-img-2").css("transform", "scale(0.47)");
            $(".feature-5-img-2").css("bottom", "-76px");
            // $(".feature-5-img-2").hide("6000");
            $(".feature-5-img-3").css("opacity", "1")
                }
                if(height>5452){
                    $(".container-filter-2").fadeOut(1000);
                }
            })

        });


    </script>
</body>

</html>