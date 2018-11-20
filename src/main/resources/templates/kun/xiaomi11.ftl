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
	<link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.4/styles/tomorrow.min.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/default.css">
	<link rel="stylesheet" type="text/css" href="${base}/static/css/kun/styles.css">
	<link type="text/css" rel="stylesheet" href="${base}/static/css/kun/carousel.css">
	<style type="text/css">
	    
    * {
        margin-top: 20px;
        font: 14px/1.5 "Helvetica Neue", Helvetica, Arial, "Microsoft Yahei", "Hiragino Sans GB", "Heiti SC", "WenQuanYi Micro Hei", sans-serif;




    }

    .body {
        background-color: #fff;
    }

    .delay {
        animation-delay: .5s
    }

    .mi8index {
        width: 1859px;
        height: 1025.34px;


    }

    .textIndex {

        height: 253.36px;

        position: absolute;
        top: 120px;
        color: #fff;
        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;

    }

    .textIndex-title {
        width: 200px;
        height: 55.91px;
        text-align: center;
        line-height: 50px;
        font-size: 72.6172px;
        margin: 0 auto;
    }

    .textIndex-webfont {
        font-size: .23em;
        padding-top: 0;
        font-family: 'F5a5b8';
    }

    .sestion-isvisible {

        width: 1859px;
        height: 499.53px;


    }

    .sestion-clearfix {
        width: 1405.86px;
        height: 371.75px;

        margin: 0 auto;
        padding-top: 20px;

    }

    .bt {
        width: 350px;
        height: 123.25px;

        float: left;
        text-align: center;
        line-height: 123.25px;
        list-style: none;
        border: 1px solid #e0e0e0;
        border-right: 0;
        border-bottom: 0;
        padding: .56em 0 .5em;


    }

    .bt1 {
        list-style: none;
        width: 350px;
        height: 123.25px;
        line-height: 123.25px;
        float: left;
        text-align: center;
        border: 1px solid #e0e0e0;
        border-top: none;
        border-right: 0;
        border-bottom: 0;

        padding: .56em 0 .5em;
    }

    .bt11 {
        list-style: none;
        width: 350px;
        height: 123.25px;
        line-height: 123.25px;
        float: left;
        text-align: center;
        border: 1px solid #e0e0e0;
        border-top: none;
        border-right: 0;
        border-bottom: 0;
        border-left: none;
        padding: .56em 0 .5em;
    }

    .bt2 {
        list-style: none;
        width: 350px;
        height: 123.25px;
        line-height: 123.25px;
        float: left;
        text-align: center;
        border: 1px solid #e0e0e0;
        border-left: none;
        padding: .56em 0 .5em;
        border-right: 0;
        border-bottom: 0;
    }

    .sestion-border {
        width: 1859px;
        height: 1016.64px;
        background: url(${base}/static/images/kun/ku/xiaomi/border1.jpg) 50% 0 no-repeat;
        background-size: cover;
    }

    .sestion-screen {
        width: 1859px;
        height: 1015.45px;
        background: url(${base}/static/images/kun/ku/xiaomi/screen.jpg) 50% 0 no-repeat;
        background-size: cover;
        margin-top: -20px;

    }

    .sestion-gps {
        width: 1859px;
        height: 1015.45px;
        background: url(${base}/static/images/kun/ku/xiaomi/gps.jpg)50% 0 no-repeat;
        background-size: cover;
        margin-top: -20px;


    }

    .sestion-camera {
        width: 1859px;
        height: 1176.39px;
        background: url(${base}/static/images/kun/ku/xiaomi/camera2.jpg)50% 0 no-repeat;
        background-size: cover;
    }

    .sestion-gallery {
        width: 1859px;
        height: 614.63px;
        /* background-color: red; */
    }

    .sestion-text {
        width: 1859px;
        height: 235.08px;

        text-align: center;
        vertical-align: text-top;
        padding-top: 1.75em;
        margin-bottom: 1em;

    }

    .webfont {
        width: 434.25px;
        height: 92px;
        float: left;
        padding-left: 500px;

        margin-top: 70px;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 35px;
        text-align: left;

    }

    .webfont2 {
        width: 434.25px;
        height: 92px;
        float: right;
        text-align: left;
        padding-right: 350px;

        line-height: 30px;
        display: block;
        font-size: 15px;
        margin: 70px;
    }

    .sestion-pic {
        width: 1859px;
        height: 1190.69px;
        position: relative;
        text-align: center;

    }

    .screen-vedio-change {}

    .play {
        width: 65px;
        height: 65px;
        display: block;
        position: absolute;
        padding-left: 894px;
        padding-top: 222px;


    }

    .screen-vedio-paly {
        width: 679px;
        height: 329px;
        padding-left: 700px;
        padding-top: 90px;
        position: absolute;
        float: right;
        overflow: hidden;
        display: inline-block;

    }

    .sestion-camera-Ai {
        width: 1859px;
        height: 952.36px;

    }

    .sestion-camera-Ai2 {
        width: 1859px;
        height: 1071.09px;
        background: url(${base}/static/images/kun/ku/xiaomi/ai.jpg)50% 0 no-repeat;
        background-size: cover;
    }

    .sestion-beauty {
        width: 1859px;
        height: 830.73px;


    }

    .sestion-beauty-item {
        width: 922.23px;
        height: 830.73px;


        float: left;

    }

    .sestion-beauty-img {
        width: 922.23px;
        height: 830.73px;
        background: url(${base}/static/images/kun/ku/xiaomi/aibeauty.jpg)50% 0 no-repeat;
        background-size: cover;

        float: right;
    }

    .sestion-cpu {
        width: 1859px;
        height: 998.48px;
        background: url(${base}/static/images/kun/ku/xiaomi/cpu.jpg)50% 0 no-repeat;
        background-size: cover;
        margin-top: 40px;
    }

    .sestion-infrared {
        width: 1859px;
        height: 1001.39px;
        background: url(${base}/static/images/kun/ku/xiaomi/infrared.jpg)50% 0 no-repeat;
        background-size: cover;
        margin-top: -20px;
    }

    .sestion-item {
        width: 1859px;
        height: 1120px;
    }

    .sestion-item-img {
        width: 49%;
        height: 537.36px;
        background: url(${base}/static/images/kun/ku/xiaomi/xiaoai.jpg)50% 0 no-repeat;
        background-size: cover;
        float: left;
    }

    .sestion-item-img1 {
        width: 49%;
        height: 537.36px;
        background: url(${base}/static/images/kun/ku/xiaomi/nfc.jpg)50% 0 no-repeat;
        background-size: cover;
        float: right;
    }

    .sestion-item-txt {
        width: 49%;
        height: 537.36px;

        float: right;
    }

    .sestion-item-txt1 {
        width: 49%;
        height: 537.36px;

        float: left;
    }

    .sestion-opacity {
        width: 1859px;
        height: 1004.28px;
        background: url(${base}/static/images/kun/ku/xiaomi/opacity.jpg)50% 0 no-repeat;
        background-size: cover;
    }

    .section-vedio {
        width: 1859px;
        height: 559.14px;
        margin-top: -20px;
        padding: 0;
    }

    .sestion-face {
        width: 1859px;
        height: 1665px;
        margin-top: -20px;
    }

    .sestion-face-img {
        width: 900px;
        height: 488px;

        float: right;
        margin-top: -10px;

    }

    .sestion-face-txt {
        width: 900px;
        height: 488px;

        float: left;
    }

    .sestion-face-vedio {
        width: 838.4px;
        height: 488.51px;

    }

    .sestion-face-txt1 {
        width: 838.4px;
        height: 488.51px;
        float: right;
    }

    .sestion-face-txt1-Index {
        height: 488.51px;
        width: 838.4px;
        position: absolute;
        text-align: center;
    }

    .sestion-face-txt1-titie {
        width: 838.4px;
        height: 181px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 40px;
        margin-top: 150px;

        font-weight: bolder;
    }

    .sestion-face-txt1-webfont {
        width: 838.4px;
        height: 26px;
        text-align: center;
        color: black;
        line-height: 35px;
        display: block;
        font-size: 20px;
        margin-top: -112px;

    }

    .sestion-face-img1 {
        width: 838.4px;
        height: 488.51px;


    }

    .sestion-face-img2 {
        width: 838.4px;
        height: 488.51px;
        float: right;

    }

    .sestion-face-txt2 {
        width: 838.4px;
        height: 488.51px;
        float: left;
    }

    .sestion-face-txt2-index {
        height: 488.51px;
        width: 838.4px;
        position: absolute;
        text-align: center;
    }

    .sestion-face-txt2-title {
        width: 838.4px;
        height: 181px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 35px;
        /* margin-top: 100px; */
        font-weight: bolder;
        padding-top: 80px;




    }

    .sestion-face-txt2-webfont {
        width: 838.4px;
        height: 26px;
        text-align: center;
        color: black;
        line-height: 35px;
        display: block;
        font-size: 20px;

    }

    .footer {
        width: 1859px;
        height: 300px;
        background: url(${base}/static/images/kun/ku/xiaomi/footer.jpg.)50% 0 no-repeat;
        background-size: cover;
        margin-top: -100px;

    }

    .bt-webfont-titile {
        width: 350px;
        height: 23px;
        text-align: center;
        color: #000000;
        line-height: 20px;
        display: block;
        font-size: 25px;
        margin-top: 50px;

    }

    .bt-webfont-text {
        width: 350px;
        height: 15px;
        text-align: center;
        line-height: 15px;
        font-family: 'Fec9ef';
        font-size: 15px;
        margin-top: 10px;
        letter-spacing: 1px;
        color: #6d6d6d;
    }

    .borderIndex {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;
    }

    .borderIndex-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: white;
        line-height: 60px;
        display: block;
        font-size: 50px;
        margin-top: 20px;
        font-weight: bold;
    }

    .borderIndex-webfont {
        width: 1859px;
        height: 26px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: -80px;

    }

    .screenIndex {
        width: 1859px;
        height: 250px;
    }

    .screenIndex-title {
        width: 1859px;
        height: 151.48px;
        text-align: center;
        color: white;
        line-height: 20px;
        display: block;
        font-size: 53px;
        font-weight: bolder;
        padding-top: 90px;
    }

    .screenIndex-webfont {
        width: 1859px;
        height: 23px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: 20px;
    }

    .screenIndex-move {
        width: 1859px;
        height: 120px;
        text-align: center;


    }

    .screenIndex-move li {
        display: inline-block;
        width: 180px;
        height: 35px;
        text-align: center;
        line-height: 35px;
    }

    .screenIndex-move-name {
        font-size: 20px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 28px;
        line-height: 35px;

    }

    .screenIndex-move-tips {
        font-size: 10px;
        color: #979797;
        text-align: center;
        display: block;
        line-height: 25px;
        margin-top: -30px;

    }

    .gpsIndex {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;
    }

    .gpsIndex-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 50px;
        margin-top: 20px;
        font-weight: bolder;
    }

    .gpsIndex-webfont {
        width: 1859px;
        height: 100px;
        text-align: center;
        color: black;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: -80px;

    }

    .sestion-pic-box {
        width: 1225.99px;
        height: 720px;
        /* background: url(${base}/static/images/kun/ku/xiaomi/pic3.jpg)50% 0 no-repeat; */
        background-size: cover;
        margin: 0 auto;

    }

    .sestion-pic-box .carousel .carousel-caption {
        padding-bottom: 30px;
    }

    .sestion-camera-Ai-text {
        width: 1859px;
        height: 235.08px;

        text-align: center;
        vertical-align: text-top;
        padding-top: 1.75em;
        margin-bottom: 1em;

    }

    .sestion-camera-Ai-webfont {
        width: 434.25px;
        height: 92px;
        float: left;
        padding-left: 500px;

        margin-top: 0px;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 35px;
        text-align: left;

    }

    .sestion-camera-Ai-webfont2 {
        width: 434.25px;
        height: 92px;
        float: right;
        text-align: left;
        padding-right: 350px;

        line-height: 30px;
        display: block;
        font-size: 15px;

    }

    .sestion-camera-Ai2-Index {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;
    }

    .sestion-camera-Ai2-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: white;
        line-height: 60px;
        display: block;
        font-size: 50px;
        margin-top: 20px;
        font-weight: bold;
    }

    .sestion-camera-Ai2-webfont {
        width: 1859px;
        height: 56px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: -80px;

    }

    .sestion-camera-Ai-img {
        width: 1859px;
        height: 656px;
        text-align: center;

    }

    .sestion-camera-Ai-img ul li {
        display: inline-block;
        margin: 50px;

    }

    .sestion-beauty-itemIndex {
        height: 400px;
        width: 840px;
        position: absolute;
        float: left;
        z-index: 2;

        padding-top: 1.3em;
        text-align: center;
    }

    .sestion-beauty-itemIndex-title {
        width: 840x;
        height: 211.48px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 37px;
        margin-top: 180px;
        font-weight: bolder;
    }

    .sestion-beauty-itemIndex-webfont {
        width: 840px;
        height: 26px;
        text-align: center;
        color: black;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: -80px;

    }

    .sestion-beauty-item-img {
        width: 400px;
        height: 60px;
        float: left;
        padding-top: 450px;
        padding-left: 220px;
    }

    .sestion-face-mimen {
        width: 200px;
        height: 59.4px;
        float: right;
        padding-right: 650px;
        margin-top: 70px;

    }

    .seciton-cpu-index {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;

    }

    .seciton-cpu-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: white;
        line-height: 60px;
        display: block;
        font-size: 53px;
        margin-top: 50px;
        font-weight: bold;
    }

    .seciton-cpu-webfont {
        width: 1859px;
        height: 26px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 17px;
        margin-top: -68px;

    }

    .sestion-camera-Index {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;
    }

    .sestion-camera-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 60px;
        margin-top: 40px;
        font-weight: bolder;
        padding-top: 37px;
    }

    .sestion-camera-webfont {
        width: 1859px;
        height: 126px;
        text-align: center;
        color: black;
        line-height: 25px;
        display: block;
        font-size: 15px;
        margin-top: -50px;

    }

    .sestion-infrared-index {
        height: 257.81px;
        width: 1859px;
        position: absolute;
        padding-top: 1.3em;
        text-align: center;

    }

    .sestion-infrared-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 53px;
        margin-top: 50px;
        font-weight: bold;
    }

    .sestion-infrared-webfont {
        width: 1859px;
        height: 26px;
        text-align: center;
        color: black;
        line-height: 25px;
        display: block;
        font-size: 25px;
        margin-top: -130px;



    }

    .sestion-item-txt-index {
        height: 257.81px;
        width: 840px;
        position: absolute;
        padding-top: 1.3em;
        text-align: center;

    }

    .sestion-item-txt-title {
        width: 840px;
        height: 211.48px;
        text-align: center;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 50px;
        margin-top: 120px;
        font-weight: bold;
        padding-left: 50px;
    }

    .sestion-item-txt-webfont {
        width: 840p;
        height: 26px;
        text-align: center;
        color: black;
        line-height: 25px;
        display: block;
        font-size: 25px;
        margin-top: -130px;
        padding-left: 50px;



    }

    .sestion-opacity-index {
        height: 257.81px;
        width: 1859px;
        position: absolute;

        z-index: 2;
        width: 100%;
        padding-top: 1.3em;
        text-align: center;

    }

    .sestion-opacity-title {
        width: 1859px;
        height: 211.48px;
        text-align: center;
        color: white;
        line-height: 60px;
        display: block;
        font-size: 53px;
        margin-top: 50px;
        font-weight: bold;
    }

    .sestion-opacity-webfont {
        width: 1859px;
        height: 26px;
        text-align: center;
        color: white;
        line-height: 25px;
        display: block;
        font-size: 1.8em;
        letter-spacing: 8px;
        margin-top: -130px;

    }

    .sestion-opacity-time {
        width: 1859px;
        height: 26px;
        text-align: center;
        font-size: .14em;
        color: #9b9b9b;
        letter-spacing: 0;
        line-height: 25px;
        display: block;

        margin-top: 7px;
    }

    .carousel-inner>.item>img {
        width: 100%;
        height: 837px;
        background-size: cover;

        object-fit: cover;
    }

    .carousel-inner>.item2>img {
        width: 100%;
        height: 1016px;
        background-size: cover;

        object-fit: cover;
    }

    .item3 {
        text-align: center;
    }

    .carousel-inner>.item3>img {
        padding-left: 0px;
        width: 1226px;
        height: 720px;
        background-size: cover;


        object-fit: cover;
    }

    .sestion-pic-itemIndex-title {
        width: 840x;
        height: 211.48px;
        text-align: left;
        color: black;
        line-height: 60px;
        display: block;
        font-size: 37px;
        margin-top: 90px;
        font-weight: bolder;
        margin-left: 325px;

    }

    .sestion-pic-webfont {
        width: 530px;
        height: 26px;
        text-align: left;
        color: black;

        display: block;
        font-size: 25px;
        margin-top: -235px;
        margin-left: 1000px;
    }

    .txt-info {
        color: black;
        display: block;
        float: left;
        font-size: 16px;
        line-height: 1.8;
    }
    .caroursel {
        margin: 150px auto;
    }
   .col000 {
        color: #000;
    }
    .mi8index .carousel-caption {
        padding-bottom: 540px;
    }
    .seciton-pic-box {}
		
	</style>
</head>


<body>
    <div class="body">
        <div class="mi8index">
            <div id="carousel-example-generic" class="carousel slide  fr-slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">

                        <img src="${base}/static/images/kun/ku/xiaomi/index1.jpg" alt="...">
                        <div class="carousel-caption">
                            <div class="textIndex-title   ">
                                小米8
                            </div>
                            <div class="textIndex-webfont1 aniview  " av-animation="fadeInUp">
                                8周年旗舰手机
                                <br>
                                <p class="textIndex-webfont1 aniview  " av-animation="fadeInUp">
                                    全球首款双频 GPS&nbsp;&nbsp;|&nbsp;&nbsp;骁龙845&nbsp;&nbsp;|&nbsp;&nbsp;AI 变焦双摄&nbsp;&nbsp;|&nbsp;&nbsp;红外人脸识别</p>
                            </div>
                            <div class="textIndex-money aniview  " av-animation="fadeInUp">
                                <sup>¥</sup>2699起

                            </div>

                        </div>
                    </div>

                    <div class="item ">
                        <img src="${base}/static/images/kun/ku/xiaomi/index2.jpg" alt="...">
                        <div class="carousel-caption">
                            <div class="textIndex-title  col000 ">
                                小米8
                            </div>
                            <div class="textIndex-webfont1 col000 ">
                                8周年旗舰手机
                                <br>
                                <p class="textIndex-webfont1 col000  ">
                                    全球首款双频 GPS&nbsp;&nbsp;|&nbsp;&nbsp;骁龙845&nbsp;&nbsp;|&nbsp;&nbsp;AI 变焦双摄&nbsp;&nbsp;|&nbsp;&nbsp;红外人脸识别</p>
                            </div>
                            <div class="textIndex-money col000 ">
                                <sup>¥</sup>2699起

                            </div>
                            ...
                        </div>
                    </div>
                    ...
                    <div class="item ">
                        <img src="../images/xiaomi/index3.jpg" alt="...">
                        <div class="carousel-caption">
                            ...
                            <div class="textIndex-title  col000 ">
                                小米8
                            </div>
                            <div class="textIndex-webfont1 col000 ">
                                8周年旗舰手机
                                <br>
                                <p class="textIndex-webfont1 col000  ">
                                    全球首款双频 GPS&nbsp;&nbsp;|&nbsp;&nbsp;骁龙845&nbsp;&nbsp;|&nbsp;&nbsp;AI 变焦双摄&nbsp;&nbsp;|&nbsp;&nbsp;红外人脸识别</p>
                            </div>
                            <div class="textIndex-money col000 ">
                                <sup>¥</sup>2699起
                            </div>
                        </div>

                        <!-- Controls -->
                        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                            <!-- <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                          <span class="sr-only">Previous</span> -->
                        </a>
                        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                            <!-- <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                          <span class="sr-only">Next</span> -->
                        </a>
                    </div>
                </div>
                <!-- <div class="textIndex">
                 <div class="textIndex-title   " >
                    小米8
                 </div>
                 <div class="textIndex-webfont1 aniview  " av-animation="fadeInUp">
                     8周年旗舰手机<br>
                     <p class="textIndex-webfont1 aniview  " av-animation="fadeInUp">
                         全球首款双频 GPS&nbsp;&nbsp;|&nbsp;&nbsp;骁龙845&nbsp;&nbsp;|&nbsp;&nbsp;AI 变焦双摄&nbsp;&nbsp;|&nbsp;&nbsp;红外人脸识别</p>
                 </div>
                 <div class="textIndex-money aniview  " av-animation="fadeInUp">
                        <sup>¥</sup>2699起

                 </div>
                
         </div> -->
            </div>

            <div class="sestion-isvisible">
                <div class="sestion-clearfix ">
                    <div class="bt11  ">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">骁龙845处理器</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">超旗舰性能</div>
                    </div>
                    <div class="bt1">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">全球首款双频GPS</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">超精准定位</div>
                    </div>
                    <div class="bt1">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">红外人脸识别</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">全黑环境疾速解锁</div>
                    </div>
                    <div class="bt1">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">三星 AMOLED 屏</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">广色域，高对比度</div>
                    </div>
                    <div class="bt2">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">超轻四曲面</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">轻薄圆润，舒适手感</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">前置2000万</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">「微整形」美颜</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">AI 变焦双摄</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">1200万 + 1200万</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">AI 场景相机</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">影棚光效 + 识别206种场景</div>
                    </div>
                    <div class="bt2">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">AI 短视频剪辑</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">一键生成电影大片</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">3400mAh 电池</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">支持QC4+ 快充协议*</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">AI 语音助手</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">内置小爱同学App</div>
                    </div>
                    <div class="bt">
                        <div class="bt-webfont-titile aniview  " av-animation="fadeInUp">多功能NFC</div>
                        <div class="bt-webfont-text aniview  " av-animation="fadeInUp">已支持167城公共交通出行*</div>
                    </div>

                </div>


            </div>

            <div class="sestion-border">

                <div class="borderIndex">
                    <div class="borderIndex-title aniview  " av-animation="fadeInUp">
                        超轻四曲面
                        <br> 轻薄圆润，舒适握感
                    </div>
                    <div class="borderIndex-webfont aniview  " av-animation="fadeInUp">
                        四曲面玻璃机身， 超轻 7 系铝金属中框，水滴弧收腰设计。
                    </div>



                </div>
                <div id="carousel-example-generic" class="carousel slide  fr-slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active item2">
                            <img src="${base}/static/images/kun/ku/xiaomi/border1.jpg" alt="...">
                            <div class="carousel-caption">
                               
                            </div>

                        </div>
                        <div class="item item2 ">
                            <img src="${base}/static/images/kun/ku/xiaomi/border2.jpg" alt="...">
                            <div class="carousel-caption">
                              
                            </div>
                        </div>
                        <div class="item item2 ">
                            <img src="${base}/static/images/kun/ku/xiaomi/border3.jpg" alt="...">
                            <div class="carousel-caption">
                               
                            </div>
                        </div>
                       
                        <div class="item item2 ">
                            <img src="${base}/static/images/kun/ku/xiaomi/border4.jpg" alt="...">
                            <div class="carousel-caption">
                             
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


            <div class="sestion-screen">
                <div class="screenIndex">
                    <div class="screenIndex-title aniview  " av-animation="fadeInUp">
                        三星 AMOLED 屏幕
                    </div>
                    <div class="screenIndex-webfont aniview  " av-animation="fadeInUp">
                        鲜艳通透的 6.21英寸全面屏，机身相当于 5.5 英寸传统手机大小。
                    </div>
                    <div class="screenIndex-move">
                        <ul class="screenIndex-move-ul aniview  " av-animation="fadeInUp">
                            <li>
                                <span class="screenIndex-move-name ">高对比度</span>
                                <br>
                                <span class="screenIndex-move-tips ">60000:1 (min)</span>
                            </li>
                            <li>
                                <span class="screenIndex-move-name ">广色域</span>
                                <br>
                                <span class="screenIndex-move-tips ">DCI-P3</span>
                            </li>
                            <li>
                                <span class="screenIndex-move-name ">高屏占比</span>
                                <br>
                                <span class="screenIndex-move-tips ">86.68%</span>
                            </li>
                            <li>
                                <span class="screenIndex-move-name ">18.7:9</span>
                                <br>
                                <span class="screenIndex-move-tips ">2248×1080 分辨率</span>
                            </li>
                        </ul>
                    </div>

                </div>



            </div>

            <div class="sestion-gps">
                <div class="gpsIndex">
                    <div class="gpsIndex-title aniview  " av-animation="fadeInUp">
                        全球首款双频 GPS 手机
                        <br> 超精准定位
                    </div>
                    <div class="gpsIndex-webfont aniview  " av-animation="fadeInUp">
                        小米8 全球首款双频 GPS 手机，支持L1 + L5双频定位，双频信号协同工作，
                        <br> 在城市复杂环境中，有效改善导航精准度。
                    </div>



                </div>


            </div>

            <div class="sestion-camera">
                <div class="sestion-camera-index">
                    <div class="sestion-camera-title aniview  " av-animation="fadeInUp">
                        AI 变焦双摄
                        <br> DxOMark超百分相机
                    </div>

                    <div class="sestion-camera-webfont aniview  " av-animation="fadeInUp">
                        1.4μm 超大像素，夜景画质更明亮细腻。源自单反的 2PD 双核对焦技术，即使暗光环境也能疾速抓拍。


                    </div>




                </div>

            </div>

            <div class="sestion-gallery">

                <article class="htmleaf-container">

                    <div class="caroursel poster-main" data-setting='{
                                "width":1800,
                                "height":570,
                                "posterWidth":1000,
                                "posterHeight":470,
                                "scale":1,
                                "dealy":"1000",
                                "algin":"middle"
                                   
                            }'>
                        <ul class="poster-list">
                            <li class="poster-item">
                                <img src="${base}/static/images/kun/ku/xiaomi/gallery1.jpg" width="100%" height="100%">
                            </li>
                            <li class="poster-item">
                                <img src="${base}/static/images/kun/ku/xiaomi/gallery2.jpg" width="100%" height="100%">
                            </li>
                            <li class="poster-item">
                                <img src="${base}/static/images/kun/ku/xiaomi/gallery3.jpg" width="100%" height="100%">
                            </li>
                            <li class="poster-item">
                                <img src="${base}/static/images/kun/ku/xiaomi/gallery1.jpg" width="100%" height="100%">
                            </li>

                            <li class="poster-item">
                                <img src="${base}/static/images/kun/ku/xiaomi/gallery4.jpg" width="100%" height="100%">
                            </li>
                            
                        </ul>
                        <div class="poster-btn poster-prev-btn"></div>
                        <div class="poster-btn poster-next-btn"></div>
                    </div>

                </article>

            </div>



            <div class="sestion-pic">

                <div class="sestion-text">
                    <div class="sestion-pic-itemIndex-title aniview  " av-animation="fadeInUp">
                        7 种 AI 影棚光效
                        <br> 轻松拍出影棚级人像
                    </div>
                    <div class="sestion-pic-webfont aniview  " av-animation="fadeInUp"> 口袋里的人像影棚，为人像照片加入一缕彩虹
                        <br> 光的期许，亦或是窗边光的静谧，让平常的一
                        <br> 瞬间，瞬间不平常。
                    </div>

                    <!-- <div class="webfont aniview  " av-animation="fadeInUp">
                7 种 AI 影棚光效
                    <br>
                轻松拍出影棚级人像
                </div>
                <div class="webfont2 aniview  " av-animation="fadeInUp">
                口袋里的人像影棚，为人像照片加入一缕彩虹
                    <br>
                光的期许，亦或是窗边光的静谧，让平常的一
                    <br>
                瞬间，瞬间不平常。
                </div> -->
                </div>
                <div class="sestion-pic-box">
                    <div id="carousel-example-generic" class="carousel slide  fr-slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                            <li data-target="#carousel-example-generic" data-slide-to="4"></li>
                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                            <div class="item active item3">
                                <img src="${base}/static/images/kun/ku/xiaomi/pic1.jpg" alt="...">
                                <div class="carousel-caption">
                                    <div class="item">
                                        <img src="..." alt="...">
                                        <div class="carousel-caption">
                                            <h3> 窗边光</h3>
                                            <p> 柔和提亮面部，使高光与阴影形成强烈的明暗对比</p>
                                        </div>
                                    </div>


                                </div>

                            </div>
                            <div class="item item3 ">
                                <img src="${base}/static/images/kun/ku/xiaomi/pic2.jpg" alt="...">
                                <div class="carousel-caption">

                                    <div class="item">
                                        <img src="..." alt="...">
                                        <div class="carousel-caption">
                                            <h3> 树叶光</h3>
                                            <p> 阳光穿过了夏天的树叶，交错重叠，光影斑驳</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="item item3 ">
                                <img src="${base}/static/images/kun/ku/xiaomi/pic3.jpg" alt="...">
                                <div class="carousel-caption">

                                    <div class="item">
                                        <img src="..." alt="...">
                                        <div class="carousel-caption">
                                            <h3> 彩虹光</h3>
                                            <p> 雨后夕阳带来的七色光晕，迷离梦幻</p>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            ...
                            <div class="item item3 ">
                                <img src="${base}/static/images/kun/ku/xiaomi/pic4.jpg" alt="...">
                                <div class="carousel-caption">

                                    <div class="item">
                                        <img src="..." alt="...">
                                        <div class="carousel-caption">
                                            <h3> 电影光</h3>
                                            <p> 模拟经典的电影光效，光与影留下时光的印记</p>
                                        </div>
                                    </div>

                                </div>
                            </div>

                            <div class="item item3 ">
                                <img src="${base}/static/images/kun/ku/xiaomi/pic5.jpg" alt="...">
                                <div class="carousel-caption">
                                    <div class="item">
                                        <img src="..." alt="...">
                                        <div class="carousel-caption">
                                            <h3> 波点光</h3>
                                            <p> 被跳动的光影包围，像沐浴着晨光与微风，画面生机勃勃</p>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            
                        </div>
                    </div>


                </div>
            </div>

            <div class="screen-vedio">
                <div class="sestion-text">
                    <div class="sestion-pic-itemIndex-title aniview  " av-animation="fadeInUp">
                        AI 短视频剪辑
                        <br> 一键生成电影级大片
                    </div>
                    <div class="sestion-pic-webfont aniview  " av-animation="fadeInUp"> 家门口、小街巷，随手录一段视频。通过7种
                        <br> 智能特效，一键自动剪辑、配乐、调色，轻松
                        <br> 打造一支好莱坞式的精彩预告片。
                    </div>
                    <!-- <div class="webfont aniview  " av-animation="fadeInUp">
                                AI 短视频剪辑 
                            <br>
                            一键生成电影级大片
                        </div>
                        <div class="webfont2 aniview  " av-animation="fadeInUp">
                                家门口、小街巷，随手录一段视频。通过7种
                            <br>
                            智能特效，一键自动剪辑、配乐、调色，轻松
                            <br>
                            打造一支好莱坞式的精彩预告片。
                        </div> -->
                </div>

                <div class="screen-vedio-change">
                    <div class="screen-vedio-paly">
                        <video width=" 700px" height=" 350px" poster="..images/xiaomi/poster.jpg" src="../images/xiaomi/fde6049e66285373774204e6a8fa44e6.mp4"></video>

                    </div>
                    <div class="hand">
                        <img class="play" src="../images/xiaomi/play.png" alt="">
                        <img src="${base}/static/images/kun/ku/xiaomi/vedio1.jpg" alt="">

                    </div>
                    <!-- <video width="1859px" height="638.3px" autoplay src="../images/xiaomi/a1e1260560e84ea74892127210c835ce.mp4"></video> -->


                </div>


            </div>

            <div class="sestion-camera-Ai">
                <div class="sestion-camera-Ai-text">
                    <div class="sestion-pic-itemIndex-title aniview  " av-animation="fadeInUp">
                        AI 场景相机
                        <br> 智能识别206种拍照场景
                        <br> 实时优化
                    </div>
                    <div class="sestion-pic-webfont aniview  " av-animation="fadeInUp"> 聪明的 AI 相机，能识别 206 种常见拍照场景，
                        <br> 自动进行曝光、饱和度等多项优化。出国旅行时
                        <br> 还是全能小助手，帮你翻译菜单，提供实时汇率
                        <br> 计算。
                    </div>
                    <!-- <div class="sestion-camera-Ai-webfont aniview  " av-animation="fadeInUp">
                                AI 场景相机
                            <br>
                            智能识别206种拍照场景
                            <br>
                            实时优化
                        </div>
                        <div class="sestion-camera-Ai-webfont2 aniview  " av-animation="fadeInUp">
                                聪明的 AI 相机，能识别 206 种常见拍照场景，
                            <br>
                            自动进行曝光、饱和度等多项优化。出国旅行时
                            <br>
                            还是全能小助手，帮你翻译菜单，提供实时汇率
                            <br>
                            计算。
                        </div> -->
                </div>
                <div class="sestion-camera-Ai-img">
                    <ul class="sestion-camera-Ai-ul   ">
                        <li c>
                            <img width="246.89px" height="505.67px" src="https://i1.mifile.cn/f/i/2018/mi8/summary/aicamera1.png">
                            <div>
                                <p class=" aniview  " av-animation="fadeInUp">AI 识别风景</p>
                                <p class="desc aniview  " av-animation="fadeInUp">自动优化色彩，直出风光大片</p>
                        </li>
                        <li>
                            <img width="246.89px" height="505.67px" src="https://i1.mifile.cn/f/i/2018/mi8/summary/aicamera2.png">
                            <p class=" aniview  " av-animation="fadeInUp">AI 识别夜景</p>
                            <p class="des  aniview  " av-animation="fadeInUp">去噪点、增强解析力，夜晚也清晰</p>
                        </li>
                        <li>
                            <img width="246.89px" height="505.67px" src="https://i1.mifile.cn/f/i/2018/mi8/summary/aicamera3.png">
                            <p class=" aniview  " av-animation="fadeInUp">AI 识别人像</p>
                            <p class="desc aniview  " av-animation="fadeInUp">轻松拍出优质逆光、剪影人像作品</p>
                        </li>
                    </ul>
                    </div>

                </div>

                <div class="sestion-camera-Ai2">
                    <div class="sestion-camera-Ai2-Index">
                        <div class="sestion-camera-Ai2-title aniview  " av-animation="fadeInUp">
                            前置2000万
                            <br> “微整形”美颜相机，肖像级背景虚化
                        </div>
                        <div class="sestion-camera-Ai2-webfont aniview  " av-animation="fadeInUp">
                            超高解析力的 2000 万前置摄像头，1.8μm（4合1）大像素技术，暗光自拍也能更清晰明亮。
                            <br> 全新升级的 3D 美颜技术与 AI 单摄背景虚化，让自拍照如同棚拍直出一样出彩。
                        </div>



                    </div>



                </div>

                <div class="sestion-beauty">
                    <div class="sestion-beauty-item">
                        <div class="sestion-beauty-itemIndex">
                            <div class="sestion-beauty-itemIndex-title aniview  " av-animation="fadeInUp">
                                “微整形”美颜相机
                                <br> 支持精调五官，实时预览
                            </div>
                            <div class="sestion-beauty-itemIndex-webfont aniview  " av-animation="fadeInUp">
                                AI 深度学习面部特征，进行上千个特征点3D建模。支持精调五官并
                                <br> 提供实时预览，塑造属于自己的“芭比翘鼻”、“苹果肌”。并且还
                                <br> 能识别自拍角度，打造无死角、更自然的“微整形”美颜效果。

                            </div>



                        </div>

                        <div class="sestion-beauty-item-img aniview  " av-animation="fadeInUp">

                            <img src="${base}/static/images/kun/ku/xiaomi/aibeauty-icon.jpg" width="400px" height="60px" alt="">
                        </div>

                    </div>
                    <div class="sestion-beauty-img">

                    </div>

                </div>

                <div class="sestion-cpu">
                    <div class="seciton-cpu-index">
                        <div class="seciton-cpu-title aniview  " av-animation="fadeInUp">惊人的30万跑分
                            <sup>*</sup>
                            <br>骁龙845，旗舰标配</div>
                        <div class="seciton-cpu-webfont aniview  " av-animation="fadeInUp">骁龙845处理器，再次爆发强劲性能。无论是穿梭于多个App之间，或是来
                            <br> 一场激烈的枪战游戏，一定是你不可或缺的凶猛利器。
                        </div>

                    </div>

                </div>

                <div class="sestion-infrared">
                    <div class="sestion-infrared-index ">
                        <div class="sestion-infrared-title aniview  " av-animation="fadeInUp">红外人脸识别</div>
                        <div class="sestion-infrared-webfont aniview  " av-animation="fadeInUp">全黑环境疾速解锁</div>

                    </div>

                </div>
                <div class="sestion-item">
                    <div class="sestion-item-img">


                    </div>
                    <div class="sestion-item-txt">
                        <div class="sestion-item-txt-index">
                            <div class="sestion-item-txt-title aniview  " av-animation="fadeInUp">“小爱同学”AI语音助手</div>
                            <div class="sestion-item-txt-webfont aniview  " av-animation="fadeInUp">一句话搞定复杂操作</div>
                        </div>



                    </div>
                    <div class="sestion-item-img1">


                    </div>
                    <div class="sestion-item-txt1">
                        <div class="sestion-item-txt-index">
                            <div class="sestion-item-txt-title aniview  " av-animation="fadeInUp">多功能NFC</div>
                            <div class="sestion-item-txt-webfont aniview  " av-animation="fadeInUp">已支持167城公共交通出行
                                <br> 支持门卡模拟*
                            </div>
                        </div>


                    </div>
                </div>

                <div class="sestion-opacity">
                    <div class="sestion-opacity-index">
                        <div class="sestion-opacity-title aniview  " av-animation="fadeInUp">小米 8 透明探索版</div>
                        <div class="sestion-opacity-webfont aniview  " av-animation="fadeInUp">8周年旗舰代表作</div>
                        <div class="sestion-opacity-time aniview  " av-animation="fadeInUp">将于7月底开售</div>

                    </div>


                </div>
                <div class="section-vedio">
                    <video style="width: 100%; height: 100%; object-fit: fill; " autoplay loop muted src="../images/xiaomi/ed921294fb62caf889d40502f5b38147.mp4">
                    </video>

                </div>

                <div class="sestion-face">
                    <div class="sestion-face-txt">
                        <div class="sestion-beauty-itemIndex">
                            <div class="sestion-beauty-itemIndex-title  aniview  " av-animation="fadeInUp">
                                安卓首款“Face ID”
                                <br> 更安全的面部识别方式
                            </div>
                            <div class="sestion-beauty-itemIndex-webfont  aniview  " av-animation="fadeInUp">
                                方寸间蕴藏最新科技，由红外相机、泛光照明、
                                <br> 点阵投影等一系列元件构成的3D结构光系统，
                                <br> 为你带来更加安全的面部识别方式。

                            </div>


                        </div>

                    </div>
                    <div class="sestion-face-img">
                        <img src="${base}/static/images/kun/ku/xiaomi/faceid.jpg" width="900px" height="488px" alt="">


                    </div>
                    <div class="sestion-face-vedio">
                        <video style="width: 100%; height: 100%; object-fit: fill; " autoplay loop muted src="../images/xiaomi/a1e1260560e84ea74892127210c835ce.mp4"></video>


                    </div>
                    <div class="sestion-face-txt1">
                        <div class="sestion-face-txt1-index">
                            <div class="sestion-face-txt1-titie  aniview  " av-animation="fadeInUp">米萌</div>
                            <div class="sestion-face-txt1-webfont aniview  " av-animation="fadeInUp">捕捉高达 52 种面部肌肉运动，生成不同的动画表情，
                                <br> 它不仅模仿你的表情，还能模仿你的声音。
                            </div>
                            <div class="sestion-face-mimen">
                                <img src="${base}/static/images/kun/ku/xiaomi/mimeng.jpg" alt="">
                            </div>
                        </div>

                    </div>
                    <div class="sestion-face-img1">




                    </div>
                    <div class="sestion-face-txt2">
                        <div class="sestion-face-txt2-index">
                            <div class="sestion-face-txt2-title  aniview  " av-animation="fadeInUp"> 全球首款
                                <br> 压感屏幕指纹识别
                            </div>
                            <div class="sestion-face-txt2-webfont  aniview  " av-animation="fadeInUp">内置高灵敏压感传感器，提升解锁识别率，同
                                <br>时给予手指振动反馈，增强解锁体验。
                            </div>

                        </div>



                    </div>
                    <div class="sestion-face-img2">
                        <img src="${base}/static/images/kun/ku/xiaomi/fingerprint.jpg" width="800px" height="488px" alt="">



                    </div>
                </div>

                <div class="footer">
                    <div class="sestion-opacity-index">
                        <div class="sestion-opacity-title"></div>
                        <div class="sestion-opacity-webfont  aniview  " av-animation="fadeInUp">继续欣赏图集</div>
                        <div class="sestion-opacity-time"></div>

                    </div>


                </div>

            </div>

        </div>

</body>
<script src="${base}/static/js/bootstrap.min.js"></script>
<script src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.5/highlight.min.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${base}/static/js/kun/jquery.aniview.min.js"></script>
<script src="${base}/static/js/kun/jquery.carousel.js"></script>


<script type="text/javascript">


    var a = $(window).scrollTop();
 
    //文字出现效果
    $(document).ready(function () {
        var i = { animateThreshold: 100 };
        $(".aniview").AniView(i),
            $(".code").each(function (i, e) { hljs.highlightBlock(e) })
    });



    Caroursel.init($('.caroursel'))




</script>

</html>