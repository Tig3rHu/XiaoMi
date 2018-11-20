<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    
    <link rel="stylesheet" href="${base}/static/css/qiqi/fonts/fat.css">
    <link rel="stylesheet" href="${base}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/static/css/qiqi/font-awesome_4.7.0_css_font-awesome.min.css">
    <link rel="stylesheet" href="${base}/static/css/qiqi/jquery.bscslider.css">
    <style>
        
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
        }

        a,
        img {
            border: 0;
        }

        /* flexslider */
       
       .qiqi{
          margin: 0 auto;
          width: 1349px;
       }
       
        .flexslider {
            position: relative;
            width: 1349px;
            height: 1440px;
            overflow: hidden;
            border: 0;
        }

        .slides {
            display: block;
            position: relative;
            z-index: 1;
            width: 1349px !important;
            height: 1440px !important;
        }

        .slides li {
            height: 400px;
            display: block;
            width: 1349px;
            height: 1440px;
        }

        .flex-control-nav {
            position: absolute;
            bottom: 10px;
            z-index: 2;
            width: 100%;
            text-align: center;
        }

        .flex-control-nav li {
            display: inline-block;
            width: 14px;
            height: 14px;
            margin: 0 5px;
            *display: inline;
            zoom: 1;
        }

        .flex-control-nav a {
            display: inline-block;
            width: 13px;
            height: 14px;
            line-height: 40px;
            overflow: hidden;
            background: url(${base}/static/images/qiqi/dot.png) right 0 no-repeat;
            cursor: pointer;
        }

        .flex-control-nav .flex-active {
            background-position: 0 0;
        }

        .flex-direction-nav {
            position: absolute;
            z-index: 3;
            width: 100%;
            top: 45%;
        }

        .flex-direction-nav li a {
            display: block;
            width: 50px;
            height: 50px;
            overflow: hidden;
            cursor: pointer;
            position: absolute;
        }

        .flex-direction-nav li a.flex-prev {
            width: 76ox;
            height: 139px;
            display: block;
            left: 0;
            background: url(${base}/static/images/qiqi/left.png) center center no-repeat;
        }

        .flex-direction-nav li a.flex-next {
            width: 76ox;
            height: 139px;
            display: block;
            right: 0;
            background: url(${base}/static/images/qiqi/right.png) center center no-repeat;
        }
        #bo2 a,#bo2 .flex-control-nav{
            display: none;
        }
        body{

    height: auto;
    margin: 0 auto;
    padding: 0;
}
.section-items{
    margin:0 auto;
    position: relative;
    overflow: hidden;
    background-repeat: no-repeat;
    background-position: center center;
    width: 1349px;
    float: left;
}
.items-scale2-01{
    height: 646.46px;
    background: url(${base}/static/images/qiqi/scale2-01.jpg);
    background-size: 100% 100%;
}


.items-scale2-textfirst{
    height: 172px;
    background: rgb(84, 185, 299);
}
.items-scale2-text-box{
    margin: 58px auto;
    width: 545.22px;
    height: 62px;
    text-align: center;

}
.items-scale2-03{
    height: 607.05px;
    background:rgb(37, 39, 45);
}

.items-scale2-03-text{
    text-align: center;
    margin: 90px 0 12px 0;
}
.items-scale2-03-img{
    position: relative;
    width: 1240px;
    height: 380.48px;
    margin: 0 auto;

}
.scale2-03-img{
    display: inline-block;
    position: absolute;
    z-index: 0;
    border: none;
    width: 1240px;
    height: 380.48px;
    background: url(${base}/static/images/qiqi/scale2-03.png);
    background-size: cover;
    background-position: 2px 762px;

}
.items-scale2-04{
    height: 876.84px;
    background:rgb(37, 39, 45);
    background-size: cover;
    background-position: 2px 762px;
}
.items-scale2-04-text{
    text-align: center;
    margin: 40px 0 66px 0;
}
.items-scale2-04-img{
    position: relative;
    height: 596px;
    margin: 30px auto;

}
.scale2-04-img{
    display: inline-block;
    position: absolute;
    z-index: 2;
    width: 1349px;
    height: 596px;
    background: url(${base}/static/images/qiqi/scale2-04.jpg);
    background-size: cover;
    background-position: -4px -1px;
}
.items-scale2-05{
    height: 693.73px;
    background: url(${base}/static/images/qiqi/scale2-05.jpg);
    background-size: cover;
}
.items-scale2-06{
    height: 714.55px;
    background: url(${base}/static/images/qiqi/scale2-06.jpg);
    background-size: cover;
}
.items-scale2-06-content{
    width: 1200px;
    height: 554px;
    margin: 72px auto;
}
.items-scale2-06-content-text{
    width: 1200xp;
    height: 50px;

    text-align: center;
}
.items-scale2-06-content-gulp{

    width: 1200px;
    height: 429px;
    margin: 106px 0 0 -19px;
}
.items-scale2-06-content-gulp-img{
    position: relative;
    display: inline-block;
    width: 235px;
    height: 164px;
    margin: 0px 0 6px 0;
}
.items-06-img{
    display: inline-block;
    position: absolute;
    z-index: 2;
    left: 53px;
    width: 122px;
    height: 123px;
    background: url(${base}/static/images/qiqi/scale2-icons.png);
}
.items-06-img-01{
    background-position:-3px -2px;
}
.items-06-img-02{
    background-position:-133px -2px;
}
.items-06-img-03{
    background-position:-264px -2px;
}
.items-06-img-04{
    background-position:-396px 0px;
}
.items-06-img-05{
    background-position:-3px -133px;
}
.items-06-img-06{
    background-position:-134px -133px;
}
.items-06-img-07{
    background-position:-263px -133px;
}
.items-06-img-08{
    background-position:-398px -133px;
}
.items-06-img-word{
    position: absolute;
    display: block;
    bottom: 0;
    width: 235px;
    height: 21px;
    text-align: center;

}
.items-scale2-textsecond{
    text-align: center;
    height: 136px;
    background: #e0c5aa;
}
.items-scale2-textsecond-box{
    margin: 50px auto;
    width: 1349px;
    height: 36px;
}

/* 轮播*/

.slideShow{
    position: relative;
    width: 1349px;
    height: 1440px;
    overflow: hidden;
}
/* .slideShowul{
    margin: 0;
    padding: 0;
    left: 0;
    list-style-type: none;
    display: inline-block;
    position: absolute;
    width:5396px;
    height: 1440px;
    overflow: hidden;
} */
.slideShowul{
    margin: 0;
    padding: 0;
    left: 0;
    list-style-type: none;
    display: inline-block;
    position: absolute;
    width: 1349px;
    height: 1440px;
    overflow: hidden;
}
.liimg{
    position: absolute;
    top: 0;
    left: 0;
    width: 1349px;
    height: 1440px;
    float: left;
    display: none;
    /* z-index: 0; */
}
.contain-scale2-07{
    height: 1440px;
    overflow: visible;
    background-size: cover;
}
.contain-scale2-07 .slider{
    height: 1440px;
    overflow: visible;
    background-size: cover;
}
.contain-scale2-07 .slider  .slider-wrapper{
    height: 1440px;
    overflow: visible;
    background-size: cover;
}
.contain-scale2-07 .slider .slider-navigation .slider-prev{
    width: 75px;
    height: 140px;
    background: url(${base}/static/images/qiqi/left.png) no-repeat center center;
}
.contain-scale2-07 .slider .slider-navigation .slider-prev::before{
    position: absolute;
    display: block;
    width: 100%;
    height: 100%;
    content: '';
}
.contain-scale2-07 .slider .slider-navigation .slider-next{
    width: 75px;
    height: 140px;
    background: url(${base}/static/images/qiqi/right.png) no-repeat center center;
}
.contain-scale2-07 .slider .slider-navigation .slider-next::before{
    position: absolute;
    display: block;
    width: 100%;
    height: 100%;
    content: '';
}

.contain-scale2-07 .slider  .slider-wrapper .slider-item{
    height: 1440px;
    overflow: visible;
    background-size: cover;
}


.contain-scale2-07 ul{
    display: block;
    width: 1332px;
    height: 25px;
}
.contain-scale2-07 ul li{
    display: block;
}
carousel slide{
    width: 1349px;
    height: 1440px;
    background-size: cover;
}
.liimg1{
    display: block;
}
/* .liimgshow{
    opacity: 1;
    z-index: 10;
} */
.nav{
    position: absolute;
    width:1349px;
    height: 25px;
    text-align: center;
    float: left;
    bottom: 12px;
}
.nav a{
    display: inline-block;
    margin: 0 auto;
    width: 45px;
    height: 15px;
    background: rgb(248, 248, 248);
}

.slideShowt1{

    width: 1349px;
    height: 1440px;
    background: url(${base}/static/images/qiqi/scale2-07-05.jpg) no-repeat center;
    background-size: cover;
    text-align: center;
}

.slideShowt2{

    width: 1349px;
    height: 1440px;
    background: url(${base}/static/images/qiqi/scale2-07-06.jpg) no-repeat center;
    background-size: cover;
    text-align: center;
}

.slideShowt-write{
    width: 1200px;
    height: 70px;
    float: left;
}
.slideShowt-text{
    width: 1200px;
    height: 94px;
    text-align: center;
    margin: 0;
    float: left;
}
.items-scale2-07{
    bottom: 0;
    position: relative;
    height: 758.81px;
   background: url(${base}/static/images/qiqi/scale2-07-07.jpg) no-repeat center;
   background-size: cover;
}

.items-scale2-08{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-07-08.jpg) no-repeat center;
    background-size: cover;
}

.items-scale2-08-text{
    margin: 118px auto;
    text-align: center;

}
.items-scale2-textthird{
    height: 172px;
    background: rgb(84, 185, 229);
}
.items-scale2-08-01{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-08-01.jpg) no-repeat center;
    background-size: cover;
}
.items-scale2-08-01-text{
    width: 1200px;
    height: 94px;
    text-align: center;
    margin:118px 0 0 72px;
}
.items-scale2-08-02{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-08-02.jpg) no-repeat center;
    background-size: cover;
}
.items-scale2-08-02-text{
    width: 472.14px;
    height: 166px;
    text-align: left;
    margin: 266px 94px;
}
.items-scale2-08-02-text-h{
    font-size: 26px;
    line-height: 1;
    color: #2e4658;
}
.items-scale2-08-02-text-word{
    font-size: 14px;
    color: rgb(76, 111, 138);
    line-height: 1;

}
.items-scale2-08-03{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-08-03.jpg) no-repeat center;
    background-size: cover;
}
.items-scale2-08-03-textfont{
    font-family: "Helvetica";
}
.items-scale2-08-03-textfont-word{
    color: rgb(189, 186, 183)
}
.items-scale2-textfourth{
    height: 172px;
    background: #f08d8d;
}
.items-scale2-09-01{
    height: 758.81px;
}
.items-scale2-09-01-content{
    width: 1349px;
    height: 252.67px;
    float: left;
}
.scale2-09-01-img{
    width: 337.25px;
    height: 252.67px;
    float: left;
    text-align: center;
    padding: 34px 0 0 0;
}
.scale2-09-01-img-box{
    width: 172px;
    height: 180px;
    margin: 0 auto;
    
}
.scale2-09-01-img-1{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position: 0 0;

}
.scale2-09-01-img-2{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position: -219px 0;
    width: 194px;
    height: 194px;

}
.scale2-09-01-img-3{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-458px 0;

}
.scale2-09-01-img-4{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-646px 0;

}
.scale2-09-01-img-5{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-850px 0;
}
.scale2-09-01-img-6{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-1026px 0;
}
.scale2-09-01-img-7{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-35px -217px;
}
.scale2-09-01-img-8{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-219px -217px;
}
.scale2-09-01-img-9{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-446px -217px;
}
.scale2-09-01-img-10{
    display: inline-block;
    background: url(${base}/static/images/qiqi/scale2-09-01.png) no-repeat center;
    background-position:-646px -217px;
}
.scale2-09-01-img-1-text{
    display: block;
    color: #5c6268;
    font-size: 16px;
    margin:-16px auto;
}
.scale2-09-01-text-bone{
    padding:2px 32px 0 0;
}
.scale2-09-01-text-bmi{
    padding:2px 50px 0 0;
}
.scale2-09-01-text-water{
    padding:0 68px 0 0;
}
.scale2-09-01-text-fat{
    padding:0 0 0 4px;
}
.scale2-09-01-text-body{
    padding: 0 20px 0 0;
}

.scale2-09-01-text{
    width: 674.5px;
    height: 252.67px;
    float: left;
    background: #f6f6f6;
}

.items-scale2-09-01-text{
    width: 607.05px;
    height: 150px;
    margin: 0 auto;
    text-align: center;
    padding: 52px 0 0 0;
}
.items-scale2-09-02v2{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-09-02v2.jpg) no-repeat center;
    background-size: cover;
}
.items-scale2-09-02v2-text{
    margin:158px 74px;
    width: 610px;
    height: 142px;
}
.items-scale2-09-02v2-content-text-word{
    color: rgb(100, 100, 143);
}
.items-scale2-09-03{
    height: 758.81px;
    background: url(${base}/static/images/qiqi/scale2-09-03.jpg) no-repeat center;
    background-size: cover;
}
.items-scale2-09-03-right{
    width: 600px;
    height: 393px;
    margin: 124px 64px;
    float: right;
}
.items-scale2-09-03-right-text{
    width: 600px;
    height: 134px;
    text-align: left;
    float: left;
}
.items-scale2-09-03-right-img{
    width: 600px;
    height: 190px;
}
.scale2-09-03-icons{
    display: inline-block;
    margin: 50px 55px 0 0 ;
    width: 141px;
    height: 141px;
    background: url(${base}/static/images/qiqi/scale2-icons.png) no-repeat center;
}
.scale2-09-03-icons-1{
    background-position: -3px -263px;
}
.scale2-09-03-icons-2{
    background-position:-152px -263px;
}
.scale2-09-03-icons-3{
    background-position:-303px -263px;
}
.scale2-09-03-icons-3-right-text{
    display: inline-block;
    margin:  0 55px 0 0;
    width: 141px;
    height: 24px;
    text-align: center;
}
.scale2-09-03-icons-3-right-word{
    font-size: 16px;
    color: #fff;
}
.items-scale2-09-04{
    height: 738.02px;
    background: url(${base}/static/images/qiqi/scale2-09-04.jpg) no-repeat center;
    background-size: cover;
}

.items-scale2-09-04-head{
    width: 1200px;
    height: 174px;
    margin: 112px auto;
}
.items-scale2-09-04-text{
    width: 100%;
    height: 74px;
    text-align: center;
}
.items-scale2-09-04-buy{
    margin: 20px;
    width: 100%;
    height: 40px
    
}
.items-scale2-09-04-buy{
    display: block;
    width: 160px;
    height: 40px;
    margin: 66px auto;
    background: rgb(255, 103, 0);
    text-align: center;
    
}
.items-scale2-09-04-buy-a{
    display: block;
    width: 160px;
    height: 40px;
    text-decoration: none;
}
.items-scale2-09-04-buy-a-text{

    color: #fff;    
    font-size: 14px;
    line-height: 38px;
}
.items-tail-write{
    width: 100%;
    height: 50px;
    float: left;
}
.items-tail{
    margin: 0 auto;
    height: 152px;
    line-height: 28px;
    font-size: 16px;
    color: #b7b4ae;
    background: #f0f0f0;
    text-align: center;
    margin: 0 auto;
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
  <div class="qiqi">
    <div class="content">
        <div class="items-scale2-01 section-items"></div>

        <div class="items-scale2-textfirst section-items">
            <div class="items-scale2-text-box">
                <span class="items-scale2-text-font">“一个共同的疑问”
                    <br> 同样的身高体重，为什么 Ta 看起来比我精瘦很多？</span>
            </div>
        </div>
        <div class="items-scale2-03 section-items">
            <div class="items-scale2-03-text">
                <span class="items-scale2-03-text-h">身体脂肪率是判断胖瘦的标准</span>
                <br>
                <br>
                <span class="items-scale2-03-text-word">众所周知，同样重量的脂肪其体积可以是肌肉的 3 倍，饮食不规律则会造成身体脂肪过多，因此就会出现相同的身高体重的两个人，脂肪
                    <br> 过多的那个人看起来就会比脂肪少的胖一些
                </span>
            </div>
            <div class="items-scale2-03-img">
                <img class="scale2-03-img" date-src="${base}/static/images/qiqi/scale2-03.png">
            </div>


        </div>
        <div class="items-scale2-04 section-items">
            <div class="items-scale2-04-text">
                <span class="items-scale2-03-text-h">如何才能知道我的体脂是否达到标准？</span>
                <br>
                <br>
                <span class="items-scale2-03-text-word">国际上，使用 BMI 体格指数衡量人体胖瘦度是简便易行的做法，但 BMI 计算的数据无法精确识别用户体型，通过体脂率来判断则更加精确，
                    <br> 更利于进行有针对性的健康活动。
                </span>
            </div>
            <div class="items-scale2-04-img">
                <img class="scale2-04-img" date-src="${base}/static/images/qiqi/scale2-04.png">
            </div>
        </div>
        <div class="items-scale2-05 section-items"></div>
        <div class="items-scale2-06 section-items">
            <div class="items-scale2-06-content">
                <div class="items-scale2-06-content-text">
                    <span class="items-scale2-06-content-text-h">小米体脂秤</span>
                    <br>
                    <br>
                    <span class="items-scale2-06-content-text-word">一台可以帮你精准检测 10 项身体数据的体脂秤</span>
                </div>
                <div class="items-scale2-06-content-gulp">
                    <ul class="items-scale2-06-content-gulp">
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-01 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">极简外观</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-02 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">超薄设计</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-03 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">10 项身体数据</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-04 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">隐藏式 LED 屏</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-05 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">304L 不锈钢金属电极</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-06 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">支持 16 人测量</span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-07 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">小米运动 APP 数据自动上传
                            </span>
                        </li>
                        <li class="items-scale2-06-content-gulp-img">
                            <i class="items-06-img-08 items-06-img"></i>
                            <br>
                            <span class="items-06-img-word">硅胶套配件选择</span>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
        <div class="items-scale2-textsecond section-items">

            <div class="items-scale2-text-box items-scale2-textsecond-box">
                <span class="items-scale2-text-font">见过了各式各样的体脂秤，小米体脂秤的外观能否再次打动人心？</span>
            </div>

        </div>
        <!--轮播-->
        <div class="contain-scale2-07 section-items">
            <div class="slider slider1">
                <div class="flexslider">
                    <ul class="slides">
                        <li style="background:url(${base}/static/images/qiqi/scale2-07-01.jpg) center center no-repeat;" style="width: 100%;height: 100%"></li>
                        <li style="background:url(${base}/static/images/qiqi/scale2-07-02.jpg) center center  no-repeat;" style="width: 100%;height: 100%"></li>
                        <li style="background:url(${base}/static/images/qiqi/scale2-07-03v2.jpg) center center  no-repeat;" style="width: 100%;height: 100%"></li>
                        <li style="background:url(${base}/static/images/qiqi/scale2-07-04.jpg) center center no-repeat;" style="width: 100%;height: 100%"></li>

                    </ul>
                </div>

            </div>
        </div>


        <div id="bo2" class="contain-scale2-07 section-items">
                <div class="slider slider1">
                    <div class="flexslider">
                        <ul class="slides">
                            <li style="background:url(${base}/static/images/qiqi/scale2-07-05.jpg) center center no-repeat;" style="width: 100%;height: 100%">
                                <div class="slideShowt">
                                        <div class="slideShowt-write"></div>
                                        <div class="slideShowt-text">
                                            <span class="items-scale2-06-content-text-h">至简臻白，轻松融入不同环境</span>
                                            <br>
                                            <br>
                                            <span class="items-scale2-06-content-text-word">为了可以搭配任何空间使用，小米体脂秤通体素净纯白，简约精致。力图给用户带来质朴的称重测脂体验，不论是充满力量的健
                                                <br> 身房还是温馨舒适的居家环境，小米体脂秤都能相得益彰，轻松融入生活环境，用高颜值的外观让测体脂这小件事也能逼格满满。
                                            </span>
                                        </div>
            
                                    </div></li>
                            <li style="background:url(${base}/static/images/qiqi/scale2-07-06.jpg) center center  no-repeat;" style="width: 100%;height: 100%">
                                <div class="slideShowt">
                                        <div class="slideShowt-write"></div>
                                        <div class="slideShowt-text">
                                            <span class="items-scale2-06-content-text-h" style="color: #fff;">至简臻白，轻松融入不同环境</span>
                                            <br>
                                            <br>
                                            <span class="items-scale2-06-content-text-word" style="color: #fff;">为了可以搭配任何空间使用，小米体脂秤通体素净纯白，简约精致。力图给用户带来质朴的称重测脂体验，不论是充满力量的健
                                                <br> 身房还是温馨舒适的居家环境，小米体脂秤都能相得益彰，轻松融入生活环境，用高颜值的外观让测体脂这小件事也能逼格满满。
                                            </span>
                                        </div>
            
                                    </div></li>
                         
                        </ul>
                    </div>
    
                </div>
            </div>
        <!-- <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <div class="slideShowt1">
                        <div class="slideShowt">
                            <div class="slideShowt-write"></div>
                            <div class="slideShowt-text">
                                <span class="items-scale2-06-content-text-h">至简臻白，轻松融入不同环境</span>
                                <br>
                                <br>
                                <span class="items-scale2-06-content-text-word">为了可以搭配任何空间使用，小米体脂秤通体素净纯白，简约精致。力图给用户带来质朴的称重测脂体验，不论是充满力量的健
                                    <br> 身房还是温馨舒适的居家环境，小米体脂秤都能相得益彰，轻松融入生活环境，用高颜值的外观让测体脂这小件事也能逼格满满。
                                </span>
                            </div>

                        </div>
                    </div>
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>
                <div class="item">
                    <div class="slideShowt2">
                        <div class="slideShowt">
                            <div class="slideShowt-write"></div>
                            <div class="slideShowt-text">
                                <span class="items-scale2-06-content-text-h" style="color: #fff;">至简臻白，轻松融入不同环境</span>
                                <br>
                                <br>
                                <span class="items-scale2-06-content-text-word" style="color: #fff;">为了可以搭配任何空间使用，小米体脂秤通体素净纯白，简约精致。力图给用户带来质朴的称重测脂体验，不论是充满力量的健
                                    <br> 身房还是温馨舒适的居家环境，小米体脂秤都能相得益彰，轻松融入生活环境，用高颜值的外观让测体脂这小件事也能逼格满满。
                                </span>
                            </div>

                        </div>
                    </div>
                    <div class="carousel-caption">
                        ...
                    </div>
                </div>

            </div>
        </div> -->

        <div class="items-scale2-07 section-items"> </div>

        <div class="items-scale2-08 section-items">
            <div class="items-scale2-08-text">
                <span class="items-scale2-03-text-h">如此纤薄，却依然安全平稳</span>
                <br>
                <br>
                <span class="items-scale2-03-text-word">相比小米体重秤，小米体脂秤薄了 30% 以上，从侧面看，比一枚五角钱硬币直径还要薄，秤体最薄处仅 14.75mm，如此纤薄
                    <br> 的小米体脂秤，可以随意收纳在家中任何角落。同时小米体脂秤接触地面的距离更低，重心也更稳，内置了一块一体成型的钢板，加
                    <br> 强整体强度，确保秤面的平整度，上秤称量时也更为平稳安全。
                </span>
            </div>
        </div>
    </div>

    <div class="items-scale2-09 section-items">
        <div class="items-scale2-textthird section-items">
            <div class="items-scale2-text-box items-scale2-textsecond-box">
                <span class="items-scale2-text-font">隐藏式 LED 显示屏、圆角、大脚垫，
                    <br> 怎样的设计才能带来更舒适安全的使用体验？
                </span>
            </div>
        </div>
        <div class="items-scale2-08-01 section-items">
            <div class="items-scale2-08-01-text">
                <span class="items-scale2-06-content-text-h">隐藏式 LED 显示屏，测量间数值显现</span>
                <br>
                <br>
                <span class="items-scale2-06-content-text-word">为确保一体设计和简洁外观，小米体脂秤摒弃了传统在秤面上开槽挖空内嵌显示屏的传统做法，在透光率极低的 ABS 工程塑料
                    <br> 秤面下做入 LED 显示屏，静置时，小米体脂秤是一个统一干净的整体，当上秤时，数据便会从面板下透出来，获得清晰数值显示。


                </span>
            </div>
        </div>
        <div class="items-scale2-08-02 section-items">
            <div class="items-scale2-08-02-text">
                <span class="items-scale2-08-02-text-h">源自安全的圆角秤边和大脚垫设计</span>
                <br>
                <br>
                <span class="items-scale2-08-02-text-word">设计，要以安全为主。小米体脂秤用大圆角和大脚垫的设计增加了整机的安
                    <br>全系数，边角的大圆角设计，不仅美观，同时也提升了家庭日用品的安全系
                    <br>数，边缘顺滑，没有割手和碰伤的风险。大脚垫增大了秤脚触地面积，增强
                    <br>秤的稳定性，同时降低了秤体在使用中滑动的可能性，提高了整体的安全
                    <br>性。


                </span>
            </div>
        </div>
        <div class="items-scale2-08-03 section-items">
            <div class="items-scale2-08-text">
                <span class="items-scale2-03-text-h items-scale2-08-03-textfont">ABS 材料整体机身，全面的耐用舒适</span>
                <br>
                <br>
                <span class="items-scale2-03-text-word">小米体脂秤整机使用 ABS 材料，硬而不脆，兼顾耐用，抗冲击性好，同时防腐蚀，适合于制造各类家居用品。小米体脂秤体
                    <br> 的表面做了防滑纹理处理，增大脚底皮肤与接触面，提升称量时的摩擦力，避免滑倒的危险。
                </span>
            </div>
        </div>
        <div class="items-scale2-textfourth section-items">
            <div class="items-scale2-text-box items-scale2-textsecond-box">
                <span class="items-scale2-text-font">隐藏式 LED 显示屏、圆角、大脚垫，
                    <br> 怎样的设计才能带来更舒适安全的使用体验？
                </span>
            </div>
        </div>
        <div class="items-scale2-09-01 section-items">
            <div class="items-scale2-09-01-content">
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-1 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text">体型</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-2 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text">分析体重</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-3 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text">肌肉量</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-4 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text">基础代谢</span>
                </div>
            </div>
            <div class="items-scale2-09-01-content">
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-5 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text scale2-09-01-text-bone">骨量</span>
                </div>
                <div class="scale2-09-01-text">
                    <div class="items-scale2-09-01-text">
                        <span class="items-scale2-06-content-text-h">一次检测，了解 10 项身体数据
                            <br> 全面知晓身体情况
                        </span>
                        <br>
                        <br>
                        <span class="items-scale2-06-content-text-word">
                            小米体脂秤采用业界成熟的 BIA 生物电阻抗技术，测试一次，可同时分析体重、BMI、肌肉量、基
                            <br>础代谢、 内脏脂肪等级、骨量、水分、体脂率、体型、身体得分，共 10 项人体数据，经常检测检
                            <br>测，让你时刻了解自己的身体状态，为身体健康提供数据参考。


                        </span>
                    </div>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-6 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text scale2-09-01-text-bmi">BMI</span>
                </div>
            </div>
            <div class="items-scale2-09-01-content">
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-7 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text scale2-09-01-text-water">水分</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-8 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text">内脏脂肪等级</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-9 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text scale2-09-01-text-body">身体得分</span>
                </div>
                <div class="scale2-09-01-img">
                    <i class="scale2-09-01-img-10 scale2-09-01-img-box"></i>
                    <span class="scale2-09-01-img-1-text scale2-09-01-text-fat">体脂率</span>
                </div>
            </div>
        </div>
        <div class="items-scale2-09-02v2 section-items">
            <div class="items-scale2-09-02v2-text">
                <span class="items-scale2-06-content-text-h">不锈钢金属电极，更精准的交流测脂技术</span>
                <br>
                <br>
                <span class="items-scale2-06-content-text-word items-scale2-09-02v2-content-text-word">小米体脂秤使用了 304L 不锈钢金属电极，相比其他类型的生物镀膜电极片或铝制电极片，测量更
                    <br>为精准，抗氧化能力更好。4 枚醒目的圆形金属电极片，为精准测量带来了保证，当脚部皮肤充分
                    <br>接触电极片后可以准确测量体脂等参数，所采用的交流测脂技术，比业界通用的直流测脂技术更为
                    <br>可靠，先进。


                </span>
            </div>
        </div>
        <div class="items-scale2-09-03 section-items">
            <div class="items-scale2-09-03-right">
                <div class="items-scale2-09-03-right-text">
                    <span class="items-scale2-03-text-h items-scale2-08-03-textfont">与小米运动 APP 搭配，自动数据上传</span>
                    <br>
                    <br>
                    <span class="items-scale2-03-text-word">小米体脂秤操作起来十分便捷，与小米运动 APP 绑定后，今后每一次的称重和体脂相关数据都会
                        <br>自动上传，随时查看测试记录。并且当多人使用小米体脂秤时，它还可以聪明的识别出不同的称
                        <br>量人，分别记录，最多支持 16 人数据测量，并无限存储体重数据。
                    </span>

                </div>
                <div class="items-scale2-09-03-right-img">
                    <i class="scale2-09-03-icons-1 scale2-09-03-icons"></i>

                    <i class="scale2-09-03-icons-2 scale2-09-03-icons"></i>

                    <i class="scale2-09-03-icons-3 scale2-09-03-icons"></i>
                    <span class="scale2-09-03-icons-3-right-text scale2-09-03-icons-3-right-word">数据上传</span>
                    <span class="scale2-09-03-icons-3-right-text scale2-09-03-icons-3-right-word">支持 16 人测量</span>
                    <span class="scale2-09-03-icons-3-right-text scale2-09-03-icons-3-right-word">自动识别</span>
                </div>
            </div>
        </div>
        <div class="items-scale2-09-04 section-items">
            <div class="items-scale2-09-04-head">
                <div class="items-scale2-09-04-text">
                    <span class="items-scale2-06-content-text-h">搭配亲肤柔软硅胶外套</span>
                    <br>
                    <br>
                    <span class="items-scale2-06-content-text-word items-scale2-09-02v2-content-text-word">
                        为了让测体脂更加舒适，小米体脂秤同时提供粉色、灰色两款硅胶保护套，柔软亲肤，同时保护体脂秤整洁如新，硅胶
                        <br> 套外观面喷涂触感舒适的 Coating 涂层，让每一次称量都能获得舒适的脚部触感。

                    </span>
                </div>
                <div class="items-scale2-09-04-buy">
                    <a class="items-scale2-09-04-buy-a" href="JavaScript:">
                        <span class="items-scale2-09-04-buy-a-text">立即购买</span>
                    </a>
                </div>
            </div>
        </div>
        <div class="items-tail section-items">
            <div class="items-tail-write"></div>
            <p>
                * 装有心脏起搏器和其它移植医疗设备者不建议使用本产品。专业运动员及处于怀孕或其他少数特别情况的人群身体
                <br> 成分测试数据可能会有偏差。
            </p>
        </div>
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
    </div>
    <script src="${base}/static/js/jquery-2.1.1.min.js"></script>
    <script src="${base}/static/js/bootstrap.js"></script>
    <script src="${base}/static/js/qiqi/qi/jquery.bscslider.js"></script>
    <script src="${base}/static/js/qiqi/qi/jquery.easing.min.js"></script>    
    <script src="${base}/static/js/qiqi/qiq/jquery.flexslider-min.js"></script>
    <script>

        $(document).ready(function () {
            $('.flexslider').flexslider({
                directionNav: true,
                pauseOnAction: false
            });
        });
        $('.slider1').bscSlider({
            duration: 3000,
            effect: 1,
            navigation: true,
            effect_speed: 750,
            easing: 'easeOutQuad',
            height: 400
        });</script>
</body>

</html>