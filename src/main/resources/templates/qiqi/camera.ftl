<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
   <!-- <link rel="stylesheet" href="${base}/static/css/qiqi/camera.css"> --> 
    <link rel="stylesheet" href="${base}/static/css/qiqi/fonts/camera.css">
    <style type="text/css">
       body{
   
    height: auto;
    margin: 0 auto;
    padding: 0;
    font: 14px/1.5;
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
    margin:0 auto;
    width: 1349px;
    height: auto;
    overflow: hidden;
}
.top{
    height: 854px;
    overflow: hidden;
}
.top-text{
    position: absolute;
    z-index: 2;
    width: 570px;
    left: 181px;
    text-align: left;
    top: 250px;
    color: #000;
}
.top-video{
    width:  2560px;
    height: 854px;
    /* z-index: -1; */
    /* top:50%;
    left: 50%; */
    position: absolute;
    object-fit: contain;
    overflow: hidden;

    margin: 0 0 0 -600px;
}
.top-video-box{
    width:  1349px;
    height: 854px;
    position: absolute;
    object-fit: contain;
    overflow: hidden;
}
.container-text01{
    height: 262px;
    background: #fcfcfc;
}

.container-text01 ul{
    display: block;
    width: 1349px;
    height: 262px;
    margin: 0 auto;
}
.container-text01 ul li{
    display: block;
    float: left;
    text-align: center;
    width: 268px;
    height: 72px;
    margin: 95px 0 0 0 ;
}

.container-text02{
    height: 430px;
    text-align: center;
    background-color: #46a1e0;
}
.text02-box{
    height: 135px;
    margin: 147.5px 0;
}
.container-swhite-03{
    height: 479px;
    overflow: hidden;
}

.container-swhite-03 i{
    display: block;
    width: 100%;
    height: 100%;
    transition: transform 0.5s linear;
    background: url(${base}/static/images/qiqi/swhite-03.jpg) no-repeat;
}
/* .swhite-box i{
    display: block;
    width: 100%;
    height: 100%;
    transition: transform 0.5s linear;
} */
.swhite-03-a{
    height: 479px;
    width: 569px;
    margin: 0 0 0 -300px;
    overflow: hidden;
}
.swhite-03-b{
    width: 728px;
    height: 479px;
    overflow: hidden;
}
.swhite-03-c{
    width: 352px;
    height: 479px;
}
.swhite-03-a i{
    background-position: left 0;
    transition: all 2s .2s;
}
.swhite-03-a i:hover,.swhite-03-b i:hover,.swhite-03-c i:hover{
    transition: all 2s .2s;
    transform: scale(1.3);
}
.swhite-03-b i{
    background-position: center 0;
    transition: all 2s .2s;
}
.swhite-03-c i{
    background-position:-2004px 6px;
    transition: all 2s .2s;
}
.swhite-box{
    float: left;
}
.container-swhite-phone{
    height: 995px;
    background-color: #f3f3f3;
}
.swhite-phone{
    margin: 140px 0 0 100px;
    width: 520px;
    height: 855px;
    background: url(${base}/static/images/qiqi/swhite-phone.png) no-repeat ;
}
.swhite-phone-head{
    position: absolute;
    width: 490px;
    height: 388px;
    background: url(${base}/static/images/qiqi/plhd.jpg) center;
   background-size: 490px;

    top: 238px;
    left: 114px;
}
.swhite-phone-head a{
    position: absolute;
    top: 0;
    z-index: 3;
    display: block;
    width: 491px;
    height: 290px;
    text-decoration: none;
    text-align: center;
    padding-top: 98px;
    background-color: rgba(0,0,0,0.8);
}
.phone-head-view{
    position: absolute;
    z-index: -1;
    display: block;
    width: 490px;
    height: 388px;
    overflow: hidden;
    top: 0;
}
.phone-head-view iframe{
    width: 490px;
    height: 470px;
}
.swhite-phone-head a:hover{
    text-decoration:line-through white;
}
.swhite-phone-tail{
    position: absolute;
    width: 490px;
    height: 370px;
    background: url(${base}/static/images/qiqi/swhite-04-oper.jpg) no-repeat center;
    background-size:cover;
    top: 626px;
    left: 117px;
}
.swhite-phone-tail a{
    display: block;
    position: absolute;
}
.phone-tail-top{
    top: 143px;
    left: 37%;
    width: 127px;
    height: 64px;
}
.phone-tail-bottom{
    top: 270px;
    left: 37%;
    width: 127px;
    height: 64px;
}
.phone-tail-left{
    top: 175px;
    left: 30%;
    width: 64px;
    height: 127px;
}
.phone-tail-right{
    top: 174px;
    left:  57%;
    width: 64px;
    height: 127px;
}
.swhite-text{
    position: absolute;
    text-align: left;
    top: 260px;
    right: 60px;
    width: 550px;
    height: 361px;
    line-height: 25px;
  opacity: .8;
}
.word-img-a{
    margin: 50px 104px 0 14px;
    float: left;
    display: block;
    width: 100px;
    height: 90px;
    background: url(${base}/static/images/qiqi/swhite-icon.png) no-repeat;
    background-position: 4px 0;
}
.word-img-b{
    margin: 50px 0 0 0;
    float: left;
    display: block;
    width: 100px;
    height: 90px;
    background: url(${base}/static/images/qiqi/swhite-icon.png) no-repeat;
    background-position: right 0;
}
.word-img-a-texta{
    position: absolute;
    top: 342px;
    right: 404px;
    display: block;
    height: 25px;
    width: 140px;
    float: left;
}
.word-img-a-textb{
    position: absolute;
    top: 342px;
    right: 198px;
    display: block;
    height: 25px;
    width: 140px;
   float: left;
}
.container-05-bg{
    height: 1155px;
    background: url(${base}/static/images/qiqi/swhite-05-bg.jpg) no-repeat center;
    text-align: center;

}
.container-05-bg span{
    display: block;
    line-height: 30px;
    color: #000;
    opacity: .6;
}
.container-05-bg .text02-h,.content-07-bg-text .text02-h{
    display: block;
    margin: 150px 0 0 0;
}
.container-06-bg{
    height: 842.1px;
    background: url(${base}/static/images/qiqi/swhite-06-bg.jpg) no-repeat center;
    background-size: cover;
}
.container-07-bg{
    height: 2116px;
    position: relative;
  

}
.content-07-bg{
    height: 939px;
    background: url(${base}/static/images/qiqi/swhite-07-bg.jpg) no-repeat center top;
    background-size: cover;

}
.content-07-bg-text{
    width: 392px;
    height: 402px;
    margin: 168px 0 0 138px;;

    float: left;
}
.content-07-bg-text span{
    opacity: .7;
    line-height: 30px;
}

.content-07-phone{
    position: absolute;
    z-index: 2;
    right: 108px;
    top: 154px;
    width: 430px;
    height: 839px;
    background: url(${base}/static/images/qiqi/swhite-07-phone.png) no-repeat center;
    background-size: cover;
}

.container-07-text{
    position: absolute;
    bottom: 804px;
    width: 1240px;
    height: 334px;
    text-align: center;


}
.container-07-text .container-05-bg {
    background: #fff;
}
.container-07-img{
    bottom: 0;
    display: inline-block;
    width: 85px;
    height: 85px;
   margin: 34px -32px 0 83px;
    background: url(${base}/static/images/qiqi/swhite-icon-add.png) no-repeat center ;
}
.container-07{
    height: 334px;
}
.content-07-text{
height: 20px;
text-align: center;
}
.container-07-a{
    background-position: 0 0;
}
.container-07-b{
    background-position: right 0; 
}
.container-07-img-text{
    display: inline-block;
    width: 114px;
    height: 20px;
    margin: 0 6px 0 18px;
}
.content-07-video{
    position: absolute;
    bottom: 50px;
    left: 206.5px;
    width: 936px;
    height: 535px;
    margin: 0 auto;
    background: url(${base}/static/images/qiqi/swhite-7-c.jpg) no-repeat center;
    background-size: cover;
}
.content-07-video-play{
    width: 731px;
    height: 419px;
    margin: 38px 0 0 100px;
}
.content-07-video-play-box{
    z-index: 1;
    position: absolute;
    top: 37px;
    left: 96px;
    width: 737px;
    height: 422.94px;
    overflow: hidden;
}
.content-07-video-play-box video{
    display: block;
    width: 737px;
    height: 422.94px;
    
}
.content-07-video-play-dog{
    display: block;
    z-index: 2;
    position: absolute;
    top: 32px;
    left: 2px;
    width: 736px;
    height: 392px;

    overflow: hidden;
    background: url(${base}/static/images/qiqi/swhite-07-play-plhd.jpg) no-repeat center center;

}
.content-07-video-play-start{
    position: absolute;
    z-index: 3;
    top: 0;
    left: 0;
    width: 736px;
    height: 424px;
    display: block;
    background: rgba(0,0,0,0.8) url(${base}/static/images/qiqi/swhite-07-play-btn.png) no-repeat center center;
}
.content-07-video-play-start a{
    display: block;
    width: 736px;
    height: 424px;
}
.container-08-bg{
    height: 747.6px;
    background: url(${base}/static/images/qiqi/swhite-08-bg.jpg) no-repeat center;
    background-size: cover;
}
.container-09-bg{
    height: 907px;
    background: url(${base}/static/images/qiqi/swhite-09-bg.jpg) no-repeat center;
}
.container-09-bg-text{
    width: 500px;
    height: 220px;
    margin: 268px 0 0 257px;
    line-height: 30px;
    opacity: .8;
}
.container-10-bg{
    height: 1065px;
    background: url(${base}/static/images/qiqi/swhite-10-bg.jpg) no-repeat center;
}
.container-10-bg-text-head{
    height: 176px;
    position: absolute;
    top: 120px;
    text-align: center;
}
.container-10-bg-text-head .text02-word,.container-10-bg-text-head .text02-h{
    color: #000;
    line-height: 30px;
    opacity: .8;
}
.container-10-bg-texta{
    position: absolute;
    top: 510px;
    left: 600px;
    text-align: center;
    display: block;
    background-color: #34affb;
    width: 175.58px;
    margin: 0px 0 30px 0;
    height: 48px;
    position: relative;

    height: 48px;
    border-radius: 30px;
    list-style: none;
}
.container-10-bg-texta2{
    position: absolute;
    top: 510px;
    left: 600px;
    text-align: center;
    display: block;
    background-color: #34affb;
    width: 240px;
    margin: 0 0 50px 0;
    height: 48px;
    position: relative;

    height: 48px;
    border-radius: 30px;
    list-style: none;
}
.container-10-bg-texta-anglea1{
    position: absolute;
    top: 557px;
    left: 600px;
    border:solid 17px;
    border-bottom-left-radius: 185px;
    border-color:#34affb rgb(250,250,250) rgb(250,250,250) rgb(250,250,250);
}
.container-10-bg-texta-anglea2{
    position: absolute;
    top: 683px;
    left: 600px;
    border:solid 17px;
    border-bottom-left-radius: 185px;
    border-color:#34affb rgb(250,250,250) rgb(250,250,250) rgb(250,250,250);
}

.container-10-bg-textb1{
    text-align: center;
    position: absolute;
    top: 486px;
    
    left: 872px;
    width: 120px;
    height: 48px;
    display: block;
    background-color: #fff;
    position: relative;
    height: 48px;
    border-radius: 30px;
    list-style: none;

}
.container-10-bg-textb2{
    text-align: center;
    position: absolute;
    top: 510px;
    left:  792px;
    width: 176.67px;
    display: block;
    background-color: #fff;
    position: relative;
    padding: 0 20px;
    height: 48px;
    border-radius: 30px;
    list-style: none;

}
.container-10-bg-texta-angleb1{
    position: absolute;
    top: 612px;
    left: 940px;
    border:solid 17px;
    border-bottom-right-radius: 185px;
    border-color:#fff rgb(250,250,250) rgb(250,250,250) rgb(250,250,250);
}
.container-10-bg-texta-angleb2{
    position: absolute;
    top: 782px;
    left: 940px;
    border:solid 17px;
    border-bottom-right-radius: 185px;
    border-color:#fff rgb(250,250,250) rgb(250,250,250) rgb(250,250,250);
}
.container-10add{
    height: 980px;
    background: url(${base}/static/images/qiqi/swhite-10add.jpg) no-repeat center;
}

.container-10add-texthead{
    position: absolute;
    top: 120px;
    height: 135px;
    text-align: center;
    line-height: 30px;
    opacity:  .75;
}
.container-10add-texta{
    color: rgba(255,255,255,0.5);
    background: rgb(97, 81, 69);
    font-size: 18px;
    border: 2px solid rgb(97, 81, 69);
    line-height: 48px;


}
.container-10add-texta-anglea1{
    color: rgba(255,255,255,0.5);
    background: url(${base}/static/images/qiqi/TIM20180721162442.png) no-repeat center;
    border-top-color: rgb(97, 81, 69) ;
    font-size: 18px;
    line-height: 48px;
    
}
.container-10add-img{
    position: absolute;
    text-align: center;
    top: 419px;
    left: 429px;
    width: 305px;
    height: 140px;
    background: url(${base}/static/images/qiqi/swhite-dialog.png) no-repeat center;
}
.container-10add-img-text2{
    opacity: .4;
}
.container-dog2{
    height: 1180px;
    background-color: #fff;
}
.container-dog2-text{
    top: 336px;
    text-align: center;
}
.container-dog2-text ul{
    list-style-type: none;
    text-align: left;
}
.container-dog2-text ul li{
    display: inline-block;
    color: #1dabfc;
    margin: 0 auto;
}
.container-dog2-text-h{
    display: block;
    margin: 0 0 0 136px;
    
}
.container-dog2-text-h1{
    margin: 0 0 0 314px;
}
.container-dog2-text-word{
    display: block;
    margin: 0 0 0 90px;
}
.container-dog2-text-word1{
    margin: 0 0 0 306px;
}
.container-dog2-img{
    margin: 70px;
    height: 558px;
    background: url(${base}/static/images/qiqi/swhite-dog2.jpg) no-repeat center;

}
.container-dog2-img-L{
    display:block;
    float: left;
    width: 65.14px;
    height: 42px;
    margin:  464px 0 0 -10px;
}
.container-dog2-img-R{
    float: right;
    display:block;
    width: 80.97px;
    height: 42px;
    margin:  464px -10px 0 0px;
}
.container-dog2-img-xian{
    height: 2px;
    background: rgba(204,204,204,0.4);
    
    width: 1200px;
    position: absolute;
    left: 74.5px;
    bottom: 100px;
}
.container-dog2-img-dian{
    position: absolute;
    background: rgba(204,204,204,0.4);
    width: 2px;
    height: 555px;
    top: -523px;
    left: 600px;
}
.container-dog2-img-dian i{
    position: absolute;
    content: "";
    left: -12px;
    background-color: #fff;
    border-radius: 50%;
    display: block;
    bottom: 20px;
    border-radius: 50%;
    width: 26px;
    height: 26px;
    background-color: rgba(197,197,197,0.7);
}
.container-dog2-img-dian i::before{
    /* 在i之前插入插入空的背景颜色为白色还是个圆这样就可以做一个空心 */
    content: "";
    width: 18px;
    height: 18px;
    margin: 4px;
    background-color: #fff;
    border-radius: 50%;
    display: block;
}

.container-11add{
    height: 708px;
    background: #231f1d;
    overflow: hidden;
}
.container-11add-img{
    width: 640px;
    height: 708px;
    background: url(${base}/static/images/qiqi/swhite-11add.jpg) no-repeat center;
    background-size: cover;
    background-position: -604px 0;
    float: left;
}
.container-11add-text{
    height: 200px;
    width: 400px;
    float: left;
    line-height: 35px;
    margin: 226px 0px 0 120px;
}
.container-11add-text .text02-h{
    color: #7b726f;;
}
.container-11add-text .text02-word{
    color: #5b5350;
}
.container-12img{
    height: 950px;
    background-color: #313233;
    overflow:visible;
}
.container-12img-text{
    position: absolute;
    text-align: center;
    height: 75px;
    top: 120px;
    line-height: 40px;
}
.container-12img-text .text02-h,.container-12img-text .text02-word{
    color: #c1c1c1;
}
.container-12img-img{
    height: 378px;
    position: absolute;
    top: 200px;
    overflow:visible;
}
.img-img{
    background: url(${base}/static/images/qiqi/swhite-12-icon.png) no-repeat;
    display: block;
    width: 301px;
    height: 301px;
    float: left;
    margin:150px 0 0 110px;
}
.img-img1{
background-position: 0 0;
}
.img-img2{
    background-position: -301px 0;
}
.img-img3{
    background-position:-602px 0;
}
.img-img3-text{
    height: 20px;
    overflow:visible;
    float: left;
}
.img-img3-text span{
    float: left;
    display: block;
    height: 20px;
    font-size: 18px;
    color: #c1c1c1;
    width: 350px;
    margin-left: 70px;
    margin-top: 50px;
    text-align: center;
}
.container-12img-tail{
    position: absolute;
    bottom: 100px;
    height: 24px;
    text-align: center;
    color: #c1c1c1;
    opacity: .8;
    font-size: 16px;
    
}
.container-13bg{
    height: 740.25px;
    background: url(${base}/static/images/qiqi/swhite-13-bg.jpg) no-repeat center;
    background-size: cover;
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
    width: 364px;
    height: 72px;
    float: left;
    margin:15px 0 0 35px;
}
       
    </style>
</head>

<body>
    <div class="container">
        <div class="top .section-items">
            <div class="top-text">
                <span class="top-text-h1">米家小白智能摄像机</span>
                <br>
                <br>
                <span class="top-text-h2">为陪伴而来，坚守家的每个瞬间</span>
                <br>
                <br>
                <span class="top-text-word">360° 全景拍摄&nbsp;|&nbsp;1080P 高清摄像&nbsp;|&nbsp;红外夜视&nbsp;|&nbsp;多角度看管&nbsp;|&nbsp;智能设备语音互动</span>
                <span class="top-text-tail-digital">399</span>
                <span class="top-text-tail-yuan">元</span>
            </div>
            <div class="top-video-box">
                <video class="top-video" data-src="${base}/static/images/qiqi/micamera-top.mp4" src="${base}/static/images/qiqi/micamera-top.mp4" muted
                    autoplay="autoplay">

                </video>
            </div>
        </div>
        <div class="container-text01 section-items">
            <ul>
                <li>360
                    <sup>°</sup>
                    <br> 全景拍摄
                </li>
                <li>1080P
                    <br> 高清摄像
                </li>
                <li>红外
                    <br> 夜视
                </li>
                <li>多角度
                    <br> 看管
                </li>
                <li>智能设备
                    <br> 语音互动
                    <br>
                </li>
            </ul>
        </div>
        <div class="container-text02 section-items">
            <div class="text02-box section-items">
                <span class="text02-h">呆萌设计外形，一见倾心</span>
                <br>
                <br>
                <span class="text02-word">第一次见到小白智能摄像机，你就会发现它拥有人性化呆萌设计，整体呈流线圆润造型，配以白色机身，灵动亲和。采用
                    <br> SABIC 基材，手感舒适，配备 Ø 0.8mmCNC 大比例喇叭孔，无圆角精细排列，同时镀膜玻璃镜片的使用让镜头拥有高通
                    <br> 透性，非常耐刮擦。如此精致的设计与讨喜的外表，让你一下就爱上它！
                </span>
            </div>
        </div>
        <div class="container-swhite-03 section-items">
            <div class="swhite-03-a swhite-box">
                <i></i>
            </div>
            <div class="swhite-03-b swhite-box">
                <i></i>
            </div>
            <div class="swhite-03-c swhite-box">
                <i></i>
            </div>
        </div>
        <div class="container-swhite-phone section-items">
            <div class="swhite-phone">
                <div class="swhite-phone-head">
                    <a href="JavaScript:">
                        <span class="swhite-phone-head-a">点击屏幕操控
                            <br>开启360
                            <sup>°</sup>全景</span>
                    </a>
                    <div class="phone-head-view">
                        <iframe src="https://s1.mi.com/micamera/qj/index.html?2016072601" width="100%" height="466px"></iframe>
                    </div>
                </div>
                <div class="swhite-phone-tail">
                    <a href="JavaScript:" class="phone-tail-top"></a>
                    <a href="JavaScript:" class="phone-tail-bottom"></a>
                    <a href="JavaScript:" class="phone-tail-left"></a>
                    <a href="JavaScript:" class="phone-tail-right"></a>
                </div>
            </div>
            <div class="swhite-text">
                <span class="text02-h">360° 全景，温暖家的每个角落</span>
                <br>
                <br>
                <span class="text02-word">最温馨的是家，最让人牵挂的也是家，小白智能摄像机让你时刻看清家的每个细节，采用
                    <br>双轴双马达、无悬臂设计，使它拥有如人体脖子一般的灵活性，85° 垂直绝对视角，地板
                    <br>天花板尽收眼底；360° 全景视频，家中任何角落都可一览无余，有了小白，让家的每个
                    <br>角落都时刻温暖。</span>
                <br>
                <br>
                <i class="word-img-a"></i>
                <i class="word-img-b"></i>
                <span class="word-img-a-texta">水平 360° 全景视频
                </span>
                <span class="word-img-a-textb">垂直绝对视角 85°</span>


            </div>
        </div>
        <div class="container-05-bg section-items">
            <span class="text02-h">语音视频通话，随时的贴心陪伴</span>
            <br>
            <br>
            <span class="text02-word">能够时刻陪在家人身边才是给他们最好的爱，小白智能摄像机支持双向语音、单向视频的通话功能，使用时双方均可
                <br> 开启小白智能摄像机的非对讲式通话，一键直拨发起通话，专业音频 DSP 降噪，无论何时何地，都能与家人温暖畅
                <br> 聊，最贴心的陪伴给家人最好的爱。
            </span>
        </div>
        <div class="container-06-bg section-items">
        </div>
        <div class="container-07-bg section-items">
            <div class="content-07-bg section-items">
                <div class="content-07-bg-text">
                    <span class="text02-h">多角度智能看管，
                        <br> 为全家站岗放哨
                    </span>
                    <br>
                    <br>
                    <span class="text02-word">小白智能摄像机不仅可以贴心陪伴，更是你的私人看护管家，开
                        <br> 启智能看家助手，即可设定在不同的时间范围看护家里不同的角
                        <br> 度，全方位为家站岗放哨。通过移动侦测对区域内移动物体变化
                        <br> 状况录制 10 秒视频并报警推送至手机。及时关注家人及宠物的
                        <br> 实时动态，不必担心危险的发生。
                    </span>
                </div>
            </div>
            <div class="content-07-phone">

            </div>
            <div class="container-07-text">
                <div class="container-05-bg container-07 section-items">
                    <span class="text02-h">历史录像留存，留住家的温馨瞬间</span>
                    <br>

                    <span class="text02-word">是家的看护使者也是永存温馨瞬间的小能手，插入 micro SD 卡可以将摄像机视角内拍摄到的视频录制存储到卡内，并
                        <br> 可将历史视频转存到家中路由器／NAS 等存储设备上永久保存，不论是父母还是顽皮的狗狗，家里每一个活动的状态均
                        <br> 可被记录下来，方便随时查看，将温馨的画面留作永恒的记忆。
                    </span>
                </div>
                <i class="container-07-a container-07-img"></i>
                <i class="container-07-b container-07-img"></i>
                <br>
                <br>
                <div class="content-07-text section-items">
                    <span class="container-07-img-text">路由器视频转存</span>
                    <span class="container-07-img-text">NAS存储设备</span>
                </div>
            </div>
            <div class="content-07-video">
                <div class="content-07-video-play">
                    <div class="content-07-video-play-box">
                        <video id="video-dog" src="${base}/static/images/qiqi/micamera-dog.mp4" muted autoplay="" loop="true">
                        </video>
                        <div class="content-07-video-play-dog"></div>
                        <div class="content-07-video-play-start">
                            <a href="JavaScript:;"></a>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="container-08-bg section-items">
        </div>
        <div class="container-09-bg section-items">
            <div class="container-09-bg-text section-items">
                <span class="text02-h">红外夜视，
                    <br> 爸爸妈妈时刻都在
                </span>
                <br>

                <span class="text02-word">对宝宝的爱通过小白智能摄像机也可以体现的淋漓尽致，小白智能摄
                    <br> 像机拥有 10 颗 940nm 无光污染红外补光灯，专业红外面罩，将它放
                    <br> 在宝宝床头，用手机随时观看黑暗中宝宝的睡眠状况，再也不必因为
                    <br> 担心宝宝而反复起床查看，24 小时全方位呵护宝贝成长。
                    <br>
                </span>
            </div>
        </div>
        <div class="container-10-bg section-items">
            <div class="container-10-bg-text-head section-items">
                <span class="text02-h">听声辨位，语音互动聊天，做全家的好伙伴</span>
                <br>

                <span class="text02-word">小白智能摄像机不仅是一部摄像机，更是全能的家庭小助手，当呼喊 “小白看过来”，即可轻松开启与小白语音聊天，通过
                    <br> 高灵敏双 MIC 实现前方 180° 方向听声辨位转向，转动马达设定为 90°/s 的转速，转动如人脖子一样灵活敏捷，你可以咨询
                    <br> 它天气、温度、时间、日期、算数、唐诗宋词、日常百科等问题，还可以让它跟你讲故事、说笑话等，让它随时陪伴家人。
                </span>
                <br>
                <br>
                <span style="color:#34affb;">*具体功能建议您查看 App 中的帮助
                </span>
            </div>
            <span class="container-10-bg-texta container-10-bg-text">hi，小白看过来</span>
            <div class="container-10-bg-texta-anglea1"></div>
            <span class="container-10-bg-textb1 container-10-bg-textb">我在了！</span>
            <div class="container-10-bg-texta-angleb1"></div>
            <span class="container-10-bg-texta2 container-10-bg-text">北京今天是什么天气？</span>
            <div class="container-10-bg-texta-anglea2"></div>
            <span class="container-10-bg-textb2 container-10-bg-textb">今天阴转多云...</span>
            <div class="container-10-bg-texta-angleb2"></div>
        </div>


        <div class="container-10add section-items">
            <div class="container-10add-texthead section-items">
                <span class="text02-h">智能设备，语音联动，做个 AI 的小白</span>
                <br>

                <span class="text02-word">除了陪你聊天，给你讲故事，小白智能摄像机更加入了语音智能设备控制的功能，下班回到家呼喊“小白 ，小白，帮我打开客厅
                    <br> 灯”，客厅的灯便会自动开启，临睡前对着它说“小白，小白，帮我关闭空气净化器”，屋里的空气净化器便会自动关闭，如今
                    <br> 的小白智能摄像机可以联动米家的智能设备，即时控制开关，解放了双手。如此人工智能的小白让全家人都爱不释手。
                </span>

            </div>
            <div class="container-10add-img">
                <span>小白小白，帮我关闭空气净化器</span>
                <p></p>
                <span class="container-10add-img-text2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;好的，关闭成功！</span>
            </div>

        </div>


        <div class="container-dog2 section-items">
            <div class="container-10-bg-text-head section-items">
                <span class="text02-h">1080P 全高清，专业芯片</span>
                <br>
                <br>
                <span class="text02-word">小白智能摄像机拥有 1080P 超清显示分辨率，采用业界领袖级图像处理芯片 Ambarella S2LM，搭配美国 OV 高
                    <br> 清 Sensor，画面显示颜色丰富饱满，视觉感受更舒适。
                </span>
                <br>
                <br>
            </div>
            <div class="container-dog2-text section-items">
                <ul>
                    <li>
                        <span class="container-dog2-text-h container-dog2-text-h1">1080P</span>
                        <br>
                        <span class="container-dog2-text-word container-dog2-text-word1">全高清，专业芯片</span>
                    </li>
                    <li>
                        <span class="container-dog2-text-h">F1.8</span>
                        <br>
                        <span class="container-dog2-text-word">大光圈，6 片全玻璃镜组</span>
                    </li>
                    <li>
                        <span class="container-dog2-text-h">LDC</span>
                        <br>
                        <span class="container-dog2-text-word">专业镜头，LDC 防畸变</span>
                    </li>
                </ul>
                <div class="container-dog2-img">
                    <p class="container-dog2-img-L">720P</p>
                    <p class="container-dog2-img-R">1080P</p>
                    <!-- <div class="container-dog2-img-bg"></div> -->
                    <div class="container-dog2-img-xian">
                        <div class="container-dog2-img-dian">
                            <i>

                            </i>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="container-11add section-items">
            <div class="container-11add-img"></div>
            <div class="container-11add-text">

                <span class="text02-h">聪明的小白，
                    <br> 未来还有更多期待
                </span>
                <br>

                <span class="text02-word">除了目前小白智能摄像机的现有功能外，未来它将会更加的人工
                    <br> 智能，通过陆续迭代更新，小白智能摄像机将会支持电视端多摄
                    <br> 像头同时监看、PC端查看、微信端接受看家侦测消息等不同功
                    <br> 能，你手上的小白，将会越来越聪明、智能。
                </span>


            </div>
        </div>

        <div class="container-12img section-items">
            <div class="container-12img-text section-items">
                <span class="text02-h">只需三步，老人与孩子也能轻松使用</span>
                <br>

                <span class="text02-word">无需任何复杂的布线与冗长的设置，只需接通电源线，下载小米智能家庭 App，按照提醒即可实现连接使用。
                </span>
            </div>
            <div class="container-12img-img section-items">

                <i class="img-img1 img-img"></i>
                <i class="img-img2 img-img"></i>
                <i class="img-img3 img-img"></i>
                <div class="img-img3-text section-items">
                    <span>将小白智能摄像机接通电源</span>
                    <span>下载小米智能家庭 App</span>
                    <span>开启 App 寻找设备并连接，即可正常使用</span>
                </div>
            </div>
            <div class="container-12img-tail section-items">
                <span>* 以上数据均为创米实验室测定值，但因客观环境改变，数据会有不同或误差。</span>
            </div>
        </div>

        <div class="container-13bg section-items"></div>

        <div class="footer">
            <div class="footer-content">
                <div class="footer-content-pic">
                    <img src="${base}/static/images/qiqi/b30def5a8f0e967d128dec2b49751aa6.png" width="100%" height="100%">
                </div>
                <div class="footer-content-font">
                    <span class="footer-content-font-h">扫码关注【
                        <span class="footer-content-font-h-m">小米商城</span>】公众号</span>
                    <span class="footer-content-font-tail">回复“真心想要”，免费赢小米手环3！</span>
                </div>
            </div>
        </div>
    </div>

</body>
<script src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script>
    $(function(){
        $(".swhite-phone-head-a").click(function(){
            $(".phone-head-view").css("z-index","4")
        })

        $(".content-07-video-play-start").click(function(){
            $(".content-07-video-play-dog").css("display","none");
            $(".content-07-video-play-start").css("display","none");
            $("#video-dog").css("autoplay","autoplay");
        })
        

        $(".container-dog2-img-dian").mousedown(function(){
            $(".container-dog2-img").mousemove(function(e){
                var locationx = e.clientX;
                var leftx = parseInt(locationx-80) + "px";
                // alert(locationx);
                $(".container-dog2-img-dian").css("left",leftx);
            })
            // $(".container-dog2-img").unbind('mousedown');
        }).mouseup(function(){
            // $(this).mousemove(function(e){
                $(".container-dog2-img").unbind('mousemove');
                // $(".container-dog2-img").bind('mousemove');
              
            // })
       

                
                
        })
     
        
    });
    
</script>

</html>