<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="applicable-device" content="pc,mobile">
    <meta http-equiv="Cache-Control" content="no-transform ">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
   
    <link rel="stylesheet" href="${base}/static/css/qiqi/fonts/sweeper.css">
    <style type="text/css">
         body{
   
    height: auto;
    margin: 0 auto;
    padding: 0;
    font: 14px/1.5 "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
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
.container-roomrobot01{
    height: 778px;
    background: url(${base}/static/images/qiqi/roomrobot01.jpg) no-repeat center;
    line-height: 50px;
    overflow: hidden;
}
.roomrobot01-text{
    width: 1240px;
    height: 302px;
    /* animation:linear .3s; */
   /* display: none; */
   /* animation: linear 3s; */
   /* overflow: hidden; */
   margin: 200px 0 0 60px;
}


.roomrobot01-text-moneyblack{
    display: inline-block;
    height: 72px;
    width: 142.38px;
    margin-top: 30px;
}
.roomrobot01-text-start{
    display: block;
    width:300px;
    height: 35px;
    font-size: 18px;
    color: #fc4b1e;
    margin: -368px 0 0 64px;
}
.start{
    display: block;
    float: left;
    width: 25px;
    height: 25px;
    background: url(${base}/static/images/qiqi/roomrobot-play-on.png) no-repeat left ;
    background-size: cover;
    margin-top: 10px;
    margin-right: 10px;
}
.roomrobot01-text-start-text{
    display: block;
    float: left;
    width: 180px;
    height: 20px;

}

.roomrobot01-dirt{
    position: absolute;
    top: -26px;
    right: 60px;
    background: url(${base}/static/images/qiqi/csystem01-dirt.png) no-repeat center;
    background-size: cover;
    width: 652px;
    height: 457px;
  

}
.roomrobot01-effect{
    position: absolute;
    right: 0;
    top: 0;
    width: 1349px;
    height: 778px;
}
.roomrobot01-effect-shadow{
    z-index: 2;
    position: absolute;
    right: -208px;
    top: -530px;
    width: 1195px;
    height: 1291px;
    background: url(${base}/static/images/qiqi/csystem01-shadow.png) no-repeat center center;
    background-size: cover;
}
.roomrobot01-effect-items{
    position: relative;
    width: 839px;
    height: 839px;
    z-index: 2;
    /* animation: degree 8s ease-out forwards; */
    /* margin:2px 0 0 508px; */
    top: 2px;
    left: 508px;
    animation: a 4.5s linear;
}
.effect-items-body{
    z-index: 3;
    position: absolute;
    width: 839px;
    height: 839px;
    background: url(${base}/static/images/qiqi/csystem01-body.png) no-repeat center center;
    background-size: cover;
    /* background-position: 0 -380px; */
    top: -380px;
    right: 0;
}
@keyframes a {
    /* 0% {
        top: 1300px;
        left: -1400px;
    }
    50% {
        bottom:calc(40% -2200px);
        left: calc(50% - 2200px);
        /* top:-460;
        left:0; }*/
    
    /* 100%{
        top:-380px;
        left: calc(100% - 100px);
    } */ 
    0% {
        transform: rotate(-20deg);
        top: 1200px;
        left: -400px;
    }
    40%{
        transform: rotate(-10deg);
    }
    45%{
        transform: rotate(0deg);

    }
    80%{
        transform: rotate(10deg);
        top: -800px;
        left:200px;
    }
    90%{
        transform: rotate(20deg);
    }
    100%{
        transform: rotate(0deg);
    }
}

.effect-items-fan{
    position: absolute;
    z-index: 2;
    width: 396px;
    height: 396px;
    background: url(${base}/static/images/qiqi/csystem01-fan.png) no-repeat center;
    background-size: cover;
    background-position: 0 0;
    animation: tran-rotate .6s linear infinite;
    bottom: 258px;
    left: 42px;
    /* display: none; */
    display: 2s;
}
.effect-items-fan1{
    position: absolute;
    z-index: 2;
    width: 396px;
    height: 396px;
    background: url(${base}/static/images/qiqi/csystem01-fan.png) no-repeat center;
    background-size: cover;
    background-position: 0 0;
    bottom: 258px;
    left: 42px;
    animation: tran-rotate1 .6s linear infinite;
}    
.effect-items-fan2{
animation: tran-rotate2 .6s linear infinite;
}    
@keyframes tran-rotate{
    0%{
        transform: rotate(0);
        /* bottom: 400px;
        right: 0; */
    }
    100%{
        transform: rotate(-360deg);
    }
}
@keyframes tran-rotate1{
    0%{
        transform: rotate(0deg);
        bottom: 490px;
    left: 580px;
    }
    100%{
        transform: rotate(-360deg);
        bottom: 490px;
    left: 580px;
    }
}
@keyframes tran-rotate2{
    0%{
        transform: rotate(60deg);
        /* bottom: 400px;
        right: 0; */
    }
    100%{
        transform: rotate(-400deg);
    }
}

.container-roomrobot02{
    overflow:visible;
 
    position: relative;
    height: 1150px;
    background: #fff;
}
.roomrobot02-0img{

    position: absolute;

transition: 2s .5s;
    /* 第一个数字动画运行时间 第二个数字延迟多久运行 */

}

/* 图片往下移动代码 */
/* translate第一个数字左右移动 第二个上下移动 */
.roomrobot02-01img{
background: url(${base}/static/images/qiqi/roomrobot02-01.png) no-repeat 0 0;
width: 792px;
height: 1090px;
background-position: 130px 0;
right: 0;
transform: translate(0, -50px);
}

.roomrobot02-02img{
    top: 450px;

    background: url(${base}/static/images/qiqi/roomrobot02-02.png) no-repeat 0 0;
    background-position: -130px 0;
    width: 738px;
    height: 624px;
    transform: translate(0, -80px);
}
.roomrobot02-01imgchange{
    transform: translate(0, -10px);
}
/* 图片移动代码结束 */
.roomrobot02-text{
    position: absolute;
    width: 460px;
    height: 140px;
    opacity: .7;
    right: 175px;
    bottom: 149px;
}
.roomrobot02-text-h{
    font-size: 60px;

    line-height: 60px;
    color: #000;
}
.roomrobot02-text-word{
    font-size: 45px;
    color: #000;
    line-height: 45px;
}
.container-roomrobot03{
    height: 403px;
}
.roomrobot03-imgbox{
    width: 449.61px;
    height: 403px;
    float: left;
    overflow: hidden;
}
.roomrobot03-01{
    background: url(${base}/static/images/qiqi/roomrobot03-1.jpg) no-repeat center;
    background-size: cover;
    transform: scale(1.35);
    background-position: -92px -22px;
    transition: 1.5s ease;
}
.roomrobot03-01:hover,.roomrobot03-02:hover,.roomrobot03-03:hover{
    transition: 1.5s ease;
    transform: scale(1.4);
    overflow: hidden;
}
.roomrobot03-02{
    background: url(${base}/static/images/qiqi/roomrobot03-2.jpg) no-repeat center;
    background-size: cover;
    transform: scale(1.35);
    background-position: -92px -22px;
    transition: 1.5s ease;
}
.roomrobot03-03{
    background: url(${base}/static/images/qiqi/roomrobot03-3.jpg) no-repeat center;
    background-size: cover;
    transform: scale(1.35);
    background-position: -92px -22px;
    transition: 1.5s ease;
}

.roomrobot03-01-text{
    overflow: hidden;        /*隐藏溢出*/

    position: absolute;
    top: 25px;
    left: 154px;
    width: 200px;
    height: 303px;
    text-align: center;
  color: #333;
  margin-right: 0;
 
}
.roomrobot03-02-text{
    overflow: hidden;        /*隐藏溢出*/

    position: absolute;
    top: 25px;
    left: 600px;
    width: 200px;
    height: 303px;
    text-align: center;
  color: #333;
  margin-right: 0;
 
}
.roomrobot03-03-text{
    overflow: hidden;        /*隐藏溢出*/

    position: absolute;
    top: 25px;
    left: 1068px;
    width: 200px;
    height: 303px;
    text-align: center;
  color: #333;
  margin-right: 0;
 
}

.roomrobot03-01-text-img{
    display: block;
    width: 133px;
    height: 133px;
    background: url(${base}/static/images/qiqi/roomrobot03-icon.png) no-repeat;

}
.roomrobot03-01-text-img-02{
    background-position: -133px 0;
}
.roomrobot03-01-text-img-03{
    background-position: -266px 0;
}
.roomrobot03-02-text-h{
    display: block;
    height: 30px;
    margin:30px 0 0 -64px;
}
.roomrobot03-02-text-word{
    display: block;
    height: 100px;
    margin:-6px 56px 0 0;
}
.container-textfirst{
    height: 245px;
    background: #eb582a url(${base}/static/images/qiqi/roomrobot-sj.png) no-repeat center bottom;
    text-align: center;
}

.container-roomrobot04{
   overflow:visible;
    height: 993px;
    background: #000 url(${base}/static/images/qiqi/roomrobot04.png) no-repeat center center;
}
.container-roomrobot04-text{
    height: 500px;
    width: 1240px;
    margin: 120px auto;
    text-align: center;
}
.roomrobot04-text-imgbox{
    width: 800px;
    height: 178px;
    margin: 78px 0 0 160px;
    text-align: left;
}
.roomrobot04-text-img{
    display: block;
    float: left;
    width: 92px;
    height: 92px;
    background: url(${base}/static/images/qiqi/roomrobot04-icon.png) no-repeat;
    margin-left: 108px;
}
.roomrobot04-text-img1{
    background-position: 0 0;
}
.roomrobot04-text-img2{
    background-position: -92px 0;
}
.roomrobot04-text-img3{
    background-position:-184px 0
}
.roomrobot04-text-img4{
    background-position:-276px 0;
}
.roomrobot04-text-imgbox-key{
    display: block;
    float: left;
    margin: 32px 0 0 132px;
}
.roomrobot04-text-imgbox-tail{
    width: 1300px;
    height: 20px;
    text-align: center;
    margin:  0 0 0 174px;
}
.roomrobot04-text-imgbox-worddisplay{
    display: block;
    float: left;
    width: 147.57px;
    height: 17px;
    margin: 0 0 0 56px;
    text-align: center;

}
.container-roomrobot04-img{
    position: absolute;
    z-index: 2;
    width: 1241px;
    height: 749px;
    background: url(${base}/static/images/qiqi/roomrobot04-02.png) no-repeat center;
    bottom: -328px;
    left: 54px;
    transition: 2.5s .5s;
    transform: translate(0, -70px);
}
.container-roomrobot04-imgchange{
    transform: translate(0, 0);
}
.container-textsecond{
    text-align: center;
    margin: 290px 0 0 0;
    overflow: visible;
    height: 580px;
    background: #fff;
}
.textsecond-text-word{
    color: #7f8588 !important;
  
}
.textsecond-text-img{

    width: 688px;
    height: 151px;
    margin: 78px auto
}
.textsecond-text-imgbox{
    width: auto;
    height: 151px;
    float: left;
    margin-left: 44px;
    text-align: center;
}
.textsecond-img{
    text-align: center;
    display: block;
    width: 92px;
    height: 92px;
    margin: 0 auto;
    background:url(${base}/static/images/qiqi/roomrobot05-icon.png) no-repeat;
}
.textsecond-img1{
    background-position: 0 0;
}
.textsecond-img2{
    background-position: -92px 0;
}
.textsecond-img3{
    background-position: -184px 0;
}
.textsecond-img4{
    background-position: -276px 0;
}
.textsecond-imgtextdis{
    position: relative;
    display: block;
    margin:4px 0 0 0;
}
.textsecond-text-tail{
    height: 21px;
    text-align: center;
    margin-top: 4px;
}
.textsecond-text-tail span{
    color: #7f8588;
    font-size: 14px;
}
.container-roomrobot06{
    height: 891px;
    overflow: hidden;
}
.container-roomrobot06-bg{
    height: 891px;
    background: url(${base}/static/images/qiqi/roomrobot06.jpg) no-repeat center center;
    background-size: cover;
    transition:10s .5s;
    transform: scale(1);
}
.container-roomrobot06-text{
    position: absolute;
    z-index: 3;
    bottom: 0;
    height: 758px;
    width: 1240px;
    text-align: center;
}
.container-roomrobot06-img{
    position: absolute;
    bottom: 60px;
    left: 48px;
    z-index: 3;
    display: block;
    width: 1085px;
    height: 378px;

}
.container-roomrobot06-img-box{
    display: block;
    float: left;
    width: 310px;
    height: 378px;
    margin-left: 50px;
    text-align: center;
    
}
.roomrobot06-img{
    width: 310px;
    height: 295px;
    display: block;
    margin: 0 auto;
    background: url(${base}/static/images/qiqi/roomrobot06-icon.png) no-repeat 0 0;
}
.roomrobot06-img1{
    background-position: 0 0 ;
}
.roomrobot06-img2{
    background-position: -406px -14px;
}
.roomrobot06-img3{
    background-position: -776px -6px;
}
.container-roomrobot06-img-box span{
    display:block;
    width: 276.47px;
    height: 55px;
    margin: 0px 0 0 38px;
}
.roomrobot06-img-text{
    margin: 0 0 0 22px !important;
}
.container-roomrobot07{
    height: 1050px;
    background: #fafafa url(${base}/static/images/qiqi/roomrobot07-1.jpg) no-repeat center center;
}
.roomrobot07-text{
    height: 169px;
    text-align:center;
    margin-top:130px;
}
.roomrobot07-tips span{
    display: block;
    width: auto;;
    position: absolute;
    height: 20px;
    line-height: 20px;
    top: 50%;
    margin-top: -10px;
}
.roomrobot07-tips-1 span{
    left: -322px;
}
.roomrobot07-tips-2 span{
    left: -132px;
}
.roomrobot07-tips-3 span{
    left: -324px;
}
.roomrobot07-tips-4 span{
    left: -130px;
}
.roomrobot07-tips-5 span{
    left: -262px;
}
.roomrobot07-tips-6 span{
    right: -230px; 
}
.roomrobot07-tips-7 span{
    right: -172px;
}
.roomrobot07-tips-8 span{
    right: -356px;
}
.roomrobot07-tips-9 span{
    right: -178px;
}
.roomrobot07-tips-10 span{
    right: -116px;
}
.roomrobot07-tips-11 span{
    right: -370px;
}
.roomrobot07-tips{
    width: 11px;
    height: 11px;
    position: absolute;
    background: #bfbfc1;
    border-radius: 50%;
 
}
.roomrobot07-tips::before{
    position: absolute;
    width: 7px;
    height: 7px;
    content: " ";
    border-radius: 50%;
    background: #fff;
    left: 2px;
    top: 2px;
    
}
.roomrobot07-tips::after{
    content: "";
    height: 1px;
    background: #bfbfc1;
    display: block;
    position: absolute;
    top: 50%;
    margin-top: -1px;

}
.roomrobot07-tips-1{
    top: 438px;
    left: 432px;
}
.roomrobot07-tips-1::after{
    width: 190px;
    right:  10px;
}
.roomrobot07-tips-2{
    top: 632px;
    left: 224px;
}
.roomrobot07-tips-2::after{
    width: 59px;
    right:  10px;
}
.roomrobot07-tips-3{
    top: 676px;
    left: 432px;
}
.roomrobot07-tips-3::after{
    width: 224px;
    right:  10px;
}
.roomrobot07-tips-4{
    top: 743px;
    left: 276px;
}
.roomrobot07-tips-4::after{
    width: 57px;
    right:  10px;
}
.roomrobot07-tips-5{
    top: 828px;
    left: 430px;
}
.roomrobot07-tips-5::after{
    width: 161px;
    right:  10px;
}
.roomrobot07-tips-6{
    top: 420px;
    right: 424px;
}
.roomrobot07-tips-6::after{
    width: 126px;
    left:10px;
}
.roomrobot07-tips-7{
    top: 438px;
    right: 374px;
}
.roomrobot07-tips-7::after{
    width: 99px;
    left:10px;
}
.roomrobot07-tips-8{
    top: 502px;
    right: 432px;
}
.roomrobot07-tips-8::after{
    width: 243px;
    left:10px;
}
.roomrobot07-tips-9{
    top: 600px;
    right: 282px;
}
.roomrobot07-tips-9::after{
    width: 105px;
    left:10px;
}

.roomrobot07-tips-10{
    top: 644px;
    right: 260px;
}
.roomrobot07-tips-10::after{
    width: 72px;
    left:10px;
}

.roomrobot07-tips-11{
    top: 771px;
    right: 496px;
}
.roomrobot07-tips-11::after{
    width: 269px;
    left:10px;
}
.container-roomrobot08{
    height: 1061px;
    background: url(${base}/static/images/qiqi/roomrobot08.jpg) no-repeat center center;
    background-size: cover;
    text-align: center;
}
.roomrobot08-text{
    margin-top: 130px;
}
.container-roomrobot09{
    height: 943px;
    background: #333 url(${base}/static/images/qiqi/roomrobot09.jpg) no-repeat center center;
}
.roomrobot09-text{
    height: 199px;
    text-align: center;
    margin-top: 130px;
}
.roomrobot09-text .roomrobot01-text-start{
    margin: 21px 0 0 564px;
}
.roomrobot09-text .start{
    margin-top: 1px;
    margin-right: 10px;
}
.roomrobot09-body{
    position: absolute;
    width: 207px;
    height: 123px;
    background: url(${base}/static/images/qiqi/roomrobot09-1.png) no-repeat center center;
    background-size: cover;
    bottom: 138px;
    left: 41.2%;
    transform: translate(0,-40px);
    transition: 2s .5s
}
.container-roomrobot10{
    height: 718.2px;
    background: url(${base}/static/images/qiqi/roomrobot10.jpg) no-repeat center center;
    background-size: cover;
}
.roomrobot10-content{
    height: 803px;
    margin-top: 130px;
    margin-left: 50px;
    color: #555c60;
    text-align: left;
    opacity: 1;
}
.roomrobot10-content .container-roomrobot04-text-h{
    color: #555c60;
}
.roomrobot10-content .container-roomrobot04-text-word{
    color: #7f8588;
}
.roomrobot10-content-imgcontent{
    display: block;
    width: 1035px;
    height: 233px;
    padding: 60px 0 40px 0;
    text-align: center;
}
.roomrobot10-content-imgcontent li{
    display:block;
    float: left;
    margin: 0 60px 0 0;
    width: 93px;
    height: 133px;
}
.roomrobot10-content-img{
    float: left;
    width: 93px;
    height: 92px;
    background: url(${base}/static/images/qiqi/roomrobot10-icon.png) no-repeat;
    margin-bottom: 16px;
}
.roomrobot10-content-img1{
    background-position: 0 0;

}
.roomrobot10-content-img2{
    background-position: -93px 0;

}
.roomrobot10-content-imgcontent span{
    color: #fc4b1e;
}
.roomrobot10-content-imgtail{
    position: absolute;
    bottom: -20px;
    height: 37px;
    float: left;
    left: -62px;
}
.roomrobot10-content-imgtail .roomrobot01-text-start{
    width: 350px;
}
.roomrobot10-content-imgtail .roomrobot01-text-start-text{
    width: 300px;
    height: 30px;
    margin: 10px 0 0 -14px;
}
.container-textthird{
    height: 245px;
    background: #eb582a url(${base}/static/images/qiqi/roomrobot-sjb.png) no-repeat center bottom;
    text-align: center;
}
.container-roomrobot11{
    height: 2139px;
    background: #fff url(${base}/static/images/qiqi/roomrobot11.jpg) no-repeat center 490px;
}
.roomrobot11-textcontent{
    height: 341px;
    margin-top:130px;
    color: #555c60;
    text-align: center;
}
.roomrobot11-textcontent .container-roomrobot04-text-h{
    color: #555c60;
}
.roomrobot11-textcontent .container-roomrobot04-text-word{
    color: #9ca0a2;
}
.roomrobot11-img{
    float: left;
    width: 93px;
    height: 92px;
    background: url(${base}/static/images/qiqi/roomrobot11-icon.png) no-repeat;
    margin-bottom: 16px; 
}
.roomrobot11-textcontent .roomrobot10-content-imgcontent{
    margin: -18px 0 0 35.4%;
    text-align: center;
}
.roomrobot11-img1{
    background-position: 0 0;
}
.roomrobot11-img2{
    background-position: -186px 0;
}
.roomrobot11-img3{
    background-position: right 0;
}

.roomrobot11-img-ba01{
    position: absolute;
    z-index: 3;
    background: url(${base}/static/images/qiqi/roomrobot11-1.png) no-repeat;
    background-size: cover;
    left: 1.4%;
    top: 58%;
    width: 1427px;
    height: 523px;
    animation: wind 4s infinite;
}
@keyframes wind{
    0%{
        opacity: 1;
        transform: scale(1) translate(0,0);
    }
    20%{
        opacity: .8;
        transform: scale(0.99) translate(0,-20px);
    }
    50%{
        opacity: 1;
        transform: scale(1) translate(0,0);
    }
    70%{
        opacity: .8;
        transform: scale(0.99) translate(0,-20px);
    }
    100%{
        opacity: 1;
        transform: scale(1) translate(0,0);
    }
}
.roomrobot11-img-ba02{
    position: absolute;
    width: 707px;
    height: 244px;
    background: url(${base}/static/images/qiqi/video-png.png) no-repeat center center;
    z-index: 2;
    top: 50%;
    left: 23.4%;
}
.roomrobot11-img-ba03{
    z-index: 2;
    position: absolute;
    width: 351px;
    height: 351px;
    background: url(${base}/static/images/qiqi/roomrobot11-2.png) no-repeat center center;
    top: 59.6%;
    left: 67.2%;
}
.roomrobot11-img-viedobox{
    position: absolute;
    z-index: 1;
    width: 574px;
    height: 119px;
    left: 29.6%;
    top: 55%;
    overflow: hidden;

}
.roomrobot11-img-viedobox-video{
    width: 100%;
    height: 100%;
    object-fit:fill;
}
.roomrobot11-texttail{
    height: 280px;
    text-align: center;
    position: relative;
    bottom: -1200px;

}
.roomrobot11-texttail .container-roomrobot04-text-h,.roomrobot012-text .container-roomrobot04-text-h{
    color: #555c60;
}
.roomrobot11-texttail .container-roomrobot04-text-word{
    color: #9ca0a2;
}
.roomrobot11-texttail-img{
    height: 37px;
    margin-top: 50px;
}
.roomrobot011-text-start{
    display: block;
    width:300px;
    height: 35px;
    font-size: 16px;
    color: #fc4b1e;
    margin:8px 0 0 592px;
}
.roomrobot011-start{
    display: block;
    float: left;
    width: 25px;
    height: 25px;
    background: url(${base}/static/images/qiqi/roomrobot-play-on.png) no-repeat left ;
    background-size: cover;
    margin-top: 0px;
    margin-right: -14px;
}
.roomrobot011-text-start-text{
    display: block;
    float: left;
    width: 180px;
    height: 20px;

}
.roomrobot11-texttail .textsecond-text-tail{
    margin-top: 40px;
}
.container-roomrobot012{
    height: 808px;
    background: url(${base}/static/images/qiqi/roomrobot12.jpg) no-repeat center center;
}
.roomrobot012-text{
    height: 336px;
    margin-top: 120px;
    margin-left: 4%;
}
.roomrobot012-text .container-roomrobot04-text-word{
    color: #7f8588;
}
.roomrobot12-texttail-img{
    height: 37px;
    margin-top: 24px;
}
.roomrobot12-texttail-img .roomrobot011-text-start{
    margin: 0 0 0 0 ;
}
.roomrobot12-texttail-img .roomrobot011-start{
    margin-right: 4px;
}
.roomrobot12-texttail-tail{
    width: 200px;
    height: 24px;
    color: #fc4b1e;
    display: block;
    font-size: 16px;
    text-decoration: none;
    margin-top: 86px;
}
.roomrobot12-texttail-tail1{
    display: block;
    color: #fc4b1e;
    text-decoration: none;
    font-size: 16px;
    width: 200px;
    height: 24px;
    margin-top: 80px;
}
.container-textfourth{
    text-align: center;
    height: 245px;
    color: #fff;
    background: #eb582a url(${base}/static/images/qiqi/roomrobot-sjb.png) no-repeat center bottom;
}
.container-roomrobot13{
    text-align: center;
    height: 952.7px;
    background: #fff url(${base}/static/images/qiqi/roomrobot13.jpg) no-repeat center top;
}
.container-roomrobot13  .container-roomrobot04-text-word{
    color: #9ca0a2;
}
.roomrobot012-text .roomrobot12-texttail-tail{
    text-align: center;
    margin: -6px 0 0 570px;
}
.container-roomrobot14{
    height: 1140px;
}
.roomrobot14-img{
    position: relative;
    width: 535px;
    height: 1140px;
    float: left;
}
.roomrobot14-img1{
    position: absolute;
    z-index: 3;
    background: url(${base}/static/images/qiqi/roomrobot14.jpg) center bottom;
    left: 0;
}
.roomrobot14-img2{
    position: absolute;
    z-index: 2;
    background: url(${base}/static/images/qiqi/roomrobot14-on.jpg) center bottom;
    left: 0;

}
.roomrobot14-textcontent{
    position: absolute;
    right: 0;
    float: left;
    width: 520px;
    height: 881px;
    margin: 130px 220px 0 0;
}
.roomrobot14-textcontent .container-roomrobot04-text-h{
    color: #555c60;
}
.roomrobot14-textcontent .container-roomrobot04-text-word{
    color: #565656;
}
.roomrobot04-tail{
    width: 575.59px;
    float: left;
    text-align:left;
    margin-top: -8px;
}
.textsecond-text-img2{
    width: 520px;
    height: 45px;
    margin: 146px 0 80px 0;
    background: url(${base}/static/images/qiqi/roomrobot14-03.png) no-repeat 0 0;
}
.roomrobot14-textcontent ul{
    display:block;
    width: 520px;
    height: 183px;
    margin:  0 0 0 -38px;
}
.roomrobot14-textcontent ul li{
    display:block;
    width: 57px;
    height: 93px;
    float: left;
    margin-right: 20px;
}
.roomrobot14-textcontent ul li span{
    display: block;
    padding: 20px 0 0 0;
    color: #fc4b1e;
}
.roomrobot14-textcontent .roomrobot04-tail{
    margin-top: 54px;
}
.roomrobot14-tailimg{
    width: 57px;
    height: 57px;
    margin: 0 auto;
    background: url(${base}/static/images/qiqi/roomrobot14-icon.png) no-repeat;
}
.roomrobot14-tailimg1{
    background-position: 0 0;
}
.roomrobot14-tailimg2{
    background-position: -92px 0;
}
.roomrobot14-tailimg3{
    background-position: -185px 0;
}
.roomrobot14-tailimg4{
    background-position: -277px 0;
}
.roomrobot14-tailimg5{
    background-position: -370px 0;
}
.roomrobot14-tailimg6{
    background-position: -462px 0;
}
.container-roomrobot15{
    height: 974px;
    background: url(${base}/static/images/qiqi/roomrobot15.jpg) no-repeat center center;
    overflow: hidden;
}
.roomrobot15-textcontent{
    height: 531px;
    width: 1240px;
}
.container-roomrobot15 .roomrobot14-textcontent{
    left: 58px;
}
.container-roomrobot15 .roomrobot14-textcontent .container-roomrobot04-text-h{
    font-size: 35px;
    line-height: 45px;
}
.container-roomrobot15 .roomrobot14-textcontent .container-roomrobot04-text-word{
    font-size: 16px;
    line-height: 30px;
    color: hsl(200, 4%, 52%);
}
.container-roomrobot15 ul{
    display: block;
    width: 1035px;
    height: 220px;
    margin: 26px 0 0 0;
}
.container-roomrobot15 ul li{
    display: block;
    width: 79px;
    height: 120px;
    float: left;
    margin: 0px 82px 0 -28px;
}
.container-roomrobot15 .roomrobot14-textcontent ul span{
    padding: 20px 0 0 0;
    display: block;
    color: #6a635d;
    margin: 0 0 0 24px;
}
.container-roomrobot15 .roomrobot14-textcontent ul .textsecond-text-tail{
    margin-top: 140px;
    margin-left: -452px;
}
.roomrobot15-img{
    width: 79px;
    height: 79px;
    background: url(${base}/static/images/qiqi/roomrobot15-icon.png) no-repeat;
}
.roomrobot15-img1{
    background-position: 0 0;
}
.roomrobot15-img2{
    background-position: -130px 0;
}
.roomrobot15-img3{
    background-position: -261px 0;
}
.container-roomrobot16{
    text-align: center;
    height: 732px;
    background: #242425;
}
.roomrobot16-textcontent{
    width: 1240px;
    height: 556px;;
    margin: 130px auto
}
.roomrobot16-textcontent .container-roomrobot04-text-h{
    color: #fff;
    font-size: 35px;
    height: 40px;
}
.roomrobot16-textcontent ul{
    width: 1240px;
    height: 475px;
    margin: 66px 0 0 100px;
    list-style:none;
}
.roomrobot16-textcontent li{
    text-align: left;
    float: left;
    width: 364.63px;
    height: 60px;
    margin: 0 auto;
    margin-bottom: 80px;
    
}
.roomrobot16-textcontent-img1{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 3px;
}
.roomrobot16-textcontent-img2{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -304px;
}
.roomrobot16-textcontent-img3{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -611px;
}
.roomrobot16-textcontent-img4{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -100px;
}
.roomrobot16-textcontent-img5{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -406px;
}
.roomrobot16-textcontent-img6{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -714px;
}
.roomrobot16-textcontent-img7{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -201px;
}
.roomrobot16-textcontent-img8{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -509px;
}
.roomrobot16-textcontent-img9{
    background: url(${base}/static/images/qiqi/roomrobot17-icon.png) no-repeat;
    background-position: 0 -817px;
}

.roomrobot16-textcontent .textsecond-text-tail{
    text-align: center;
    width: 1200px;
    position: absolute;
    text-align: center;
    height: 16px;
    bottom: 46px;
}
.container-roomrobot18{
    height: 740px;
    background: url(${base}/static/images/qiqi/roomrobot18b.jpg) no-repeat center center;
}
.roomrobot18-textcontent{
    margin: 76px 196px 0 0;
    float: right;
}
.roomrobot18-textcontent .container-roomrobot04-text-h{
    font-size: 35px;
    line-height: 40px;
    color: #555c60;
}
.roomrobot18-textcontent .container-roomrobot04-text-word{
    font-size: 16px;
    line-height: 30px;
    color: #555c60;
}
.roomrobot18-textcontent a{
    text-decoration: none;
    color: #fc4b1e;
    font-size: 16px;
}
.container-roomrobot19{
    position: relative;
    height: 1200px;
}
.container-roomrobot19-left{
    width: 1280px;
    height: 600px;
    position: absolute;
    right: 50%;
    background: url(${base}/static/images/qiqi/roomrobot19-a.jpg) no-repeat center center;

    
}
.container-roomrobot19-right{
    width: 1280px;
    height: 600px;
    position: absolute;
    left: 50%;
    background: url(${base}/static/images/qiqi/roomrobot19-b.jpg) no-repeat center center;
    
}
.container-roomrobot19-c{
    width: 1280px;
    height: 600px;
    position: absolute;
    right: 50%;
    bottom: 0;
    background: url(${base}/static/images/qiqi/roomrobot19-c.jpg) no-repeat center center;

}
.container-roomrobot19-d{
    width: 1280px;
    height: 600px;
    position: absolute;
    left: 50%;
    bottom: 0;
    background: url(${base}/static/images/qiqi/roomrobot19-d.jpg) no-repeat center center;
    
}
.container-roomrobot19-left .roomrobot18-textcontent{
    margin: 332px 314px 0 0px;
}
.container-roomrobot19-right .roomrobot18-textcontent{
    margin: 122px 854px 0 0px;
}
.container-roomrobot19-c .roomrobot18-textcontent{
    margin: 304px 90px 0 0px;
}
.container-roomrobot19-d .roomrobot18-textcontent{
    margin: 96px 906px 0 0px;
}
.container-roomrobot-nex{
    height: 348px;
    background: url(${base}/static/images/qiqi/roomrobot-next-01.jpg) no-repeat center center;
}
.roomrobot-nex-img{
    display: block;
    height: 348px;
    width: 100%;
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
        <div class="container-roomrobot01 section-items">
            <div class="roomrobot01-text">

                <span class="roomrobot01-text-h">我，米家扫地机器人</span>
                <br>
                <span class="roomrobot01-text-h2">智商高，扫得干净扫得快</span>
                <br>
                <span class="roomrobot01-text-keyword">智能路径规划&nbsp;&nbsp;|&nbsp;&nbsp;大风压澎湃吸力&nbsp;&nbsp;|&nbsp;&nbsp;远程智能控制&nbsp;&nbsp;|&nbsp;&nbsp;大电池持久清扫
                    <br>
                </span>
                <span class="roomrobot01-text-money roomrobot01-text-moneyblack">1699</span>
                <span class="roomrobot01-text-yuan">元</span>
                <br>

            </div>
            <div class="roomrobot01-dirt"></div>
            <div class="roomrobot01-effect">

                <div class="roomrobot01-effect-items">
                    <div class="roomrobot01-effect-shadow"></div>

                    <div class="effect-items-body">
                    </div>
                    <div class="effect-items-fan">

                    </div>
                    <div class="effect-items-fan1">

                    </div>
                    <!-- <div class="effect-items-fan effect-items-fan2">

                    </div> -->
                </div>
                <a href="JavaScript:;" class="roomrobot01-text-start">

                    <i class="start"></i>
                    <span class="roomrobot01-text-start-text">点击观看完整产品视频</span>
                </a>
            </div>
        </div>
        <div class="container-roomrobot02 section-items">
            <div class="roomrobot02-01img roomrobot02-0img"></div>
            <div class="roomrobot02-02img roomrobot02-0img"></div>
            <div class="roomrobot02-text">
                <span class="roomrobot02-text-h">这就是我，</span>
                <br>
                <br>
                <span class="roomrobot02-text-word">一台全能的扫地机器人</span>
            </div>
        </div>
        <div class="container-roomrobot03 section-items">
            <div class="roomrobot03-imgbox">
                <div class="roomrobot03-imgbox roomrobot03-01">
                </div>
            </div>
            <div class="roomrobot03-imgbox">
                <div class="roomrobot03-imgbox roomrobot03-02"></div>

            </div>
            <div class="roomrobot03-imgbox">
                <div class="roomrobot03-imgbox roomrobot03-03"></div>

            </div>
            <div class="roomrobot03-01-text">

                <i class="roomrobot03-01-text-img"></i>
                <span class="roomrobot03-02-text-h">够聪明</span>
                <br>
                <span class="roomrobot03-02-text-word">LDS 等众多传感器
                    <br> 地图生成，路径规划
                    <br> 自动回充
                    <br> 断点续扫
                </span>

            </div>
            <div class="roomrobot03-02-text">

                <i class="roomrobot03-01-text-img roomrobot03-01-text-img-02"></i>
                <span class="roomrobot03-02-text-h">够强壮</span>
                <br>
                <span class="roomrobot03-02-text-word">大吸力风机
                    <br> 浮动主刷
                    <br> 动态调速边刷
                    <br> 10mm 沿墙清扫</span>
            </div>
            <div class="roomrobot03-03-text">

                <i class="roomrobot03-01-text-img roomrobot03-01-text-img-03"></i>
                <span class="roomrobot03-02-text-h">够省心</span>
                <br>
                <span class="roomrobot03-02-text-word">极简设计
                    <br> 5200mAh 大电池
                    <br> 远程智能控制
                    <br> 实时清扫地图查看
                </span>
            </div>
        </div>
        <div class="container-textfirst section-items">
            <span class="container-textfirst-h">“聪明的我，像人一样思考”</span>
        </div>
        <div class="container-roomrobot04 section-items">
            <div class="container-roomrobot04-text">
                <span class="container-roomrobot04-text-h">行之有据，我会规划家里的清扫路径</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">我拥有数量众多的传感器，将获取的数据信息实时同步给我的三颗 “大脑” ——处理器，他们会模拟人类大脑的思考方
                    <br> 式，并互相协作，将所采集的数据交给 SLAM 算法，构建房间地图，并实时定位。根据地图划分区域和规划清扫路径，最
                    <br> 终形成先沿边后 Z 字形的清扫路径，逐一完成分区清扫任务。</span>
                <br>
                <div class="roomrobot04-text-imgbox">
                    <i class="roomrobot04-text-img1 roomrobot04-text-img"></i>
                    <i class="roomrobot04-text-img2 roomrobot04-text-img"></i>
                    <i class="roomrobot04-text-img3 roomrobot04-text-img"></i>
                    <i class="roomrobot04-text-img4 roomrobot04-text-img"></i>
                    <br>
                    <span class="roomrobot04-text-imgbox-key roomrobot03-02-text-h">眼睛</span>
                    <span class="roomrobot04-text-imgbox-key roomrobot03-02-text-h">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;感官</span>
                    <span class="roomrobot04-text-imgbox-key roomrobot03-02-text-h">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大脑</span>
                    <span class="roomrobot04-text-imgbox-key roomrobot03-02-text-h">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;思维</span>
                </div>
                <div class="roomrobot04-text-imgbox-tail">
                    <span class="roomrobot04-text-imgbox-word roomrobot04-text-imgbox-worddisplay">LDS 激光测距传感器</span>
                    <span class="roomrobot04-text-imgbox-word roomrobot04-text-imgbox-worddisplay">多传感器协同工作</span>
                    <span class="roomrobot04-text-imgbox-word roomrobot04-text-imgbox-worddisplay">三颗独立处理器</span>
                    <span class="roomrobot04-text-imgbox-word roomrobot04-text-imgbox-worddisplay">SLAM 算法</span>
                </div>
            </div>
            <div class="container-roomrobot04-img"></div>

        </div>
        <div class="container-textsecond  section-items">
            <div class="textsecond-text section-items">
                <span class="textsecond-text-h container-roomrobot04-text-h">一双明眸，让我精准探测室内空间</span>
                <br>
                <br>
                <span class="textsecond-text-h2">高精度激光测距传感器</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word textsecond-text-word">LDS 激光测距传感器就是我的眼睛，它会以 5 × 360°/秒 的速度扫描房间，获取距离信息。当激光投射到障碍物上时，会在
                    <br> 我的眼睛里形成光斑。同时，图像传感器会根据光斑的像素序号来计算到激光测距传感器的中心距离*。
                </span>
                <div class="textsecond-text-img">
                    <div class="textsecond-text-imgbox">
                        <i class="textsecond-img textsecond-img1"></i>
                        <br>
                        <span class="textsecond-imgtext textsecond-imgtextdis">5 × 360°/ 秒 扫描</span>
                    </div>
                    <div class="textsecond-text-imgbox">
                        <i class="textsecond-img textsecond-img2"></i>
                        <br>
                        <span class="textsecond-imgtext textsecond-imgtextdis">1800 次/秒 测距</span>
                    </div>
                    <div class="textsecond-text-imgbox">
                        <i class="textsecond-img textsecond-img3"></i>
                        <br>
                        <span class="textsecond-imgtext textsecond-imgtextdis">最大精确测距范围 6m</span>
                    </div>
                    <div class="textsecond-text-imgbox">
                        <i class="textsecond-img textsecond-img4"></i>
                        <br>
                        <span class="textsecond-imgtext textsecond-imgtextdis">误差 ≤ 2%</span>
                    </div>
                </div>
            </div>
            <div class="textsecond-text-tail section-items">
                <span>* 激光测距传感器数据来自石头科技实验室。</span>
            </div>
        </div>
        <div class="container-roomrobot06 section-items">
            <div class="container-roomrobot06-bg section-items"></div>
            <div class="container-roomrobot06-text">
                <span class="container-roomrobot04-text-h">聪明过人，三颗大脑让我独立思考</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">三颗独立的处理器就是我聪明的 “大脑”，它会模拟人类大脑的思考方式，并互相协作，同步采集并处理传
                    <br> 感器信息，通过定位和计算，实时构建地图并规划最终的清扫路径，让扫地的效率更高。
                </span>
            </div>
            <ul class="container-roomrobot06-img">
                <li class="container-roomrobot06-img-box">
                    <div class="roomrobot06-img1 roomrobot06-img"></div>
                    <br>
                    <span class="container-roomrobot04-text-word">Allwinner
                        <br> ARM Cortex™-A7 架构的四核应用处理</span>
                </li>
                <li class="container-roomrobot06-img-box">
                    <div class="roomrobot06-img2 roomrobot06-img"></div>
                    <br>
                    <span class="container-roomrobot04-text-word roomrobot06-img-text">TI 德州仪器
                        <br> 数字信号处理器
                    </span>
                </li>
                <li class="container-roomrobot06-img-box">
                    <div class="roomrobot06-img3 roomrobot06-img"></div>
                    <br>
                    <span class="container-roomrobot04-text-word roomrobot06-img-text">ST 意法半导体
                        <br> ARM Cortex-M3 架构的微控制器</span>
                </li>
            </ul>
        </div>

        <div class="container-roomrobot07 section-items">
            <div class="roomrobot07-text section-items">
                <span class="container-roomrobot04-text-h">全面感官，我能时刻察觉复杂环境</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">不同的家有着不同的空间环境，如何才能满足各种家庭环境？我身上涵盖了 12 类主流机器人所具备的传感器，
                    <br> 9.6cm 机身高度能轻松进入家的各个角落，看得见与看不见的地方都能优雅的完成清扫。</span>
                <br>
                <br>
                <a href="JavaScript:;">继续了解我身上更多的传感器＞</a>
            </div>
            <div class="roomrobot07-tips-1 roomrobot07-tips">
                <span>LDS 激光测距传感器</span>
            </div>
            <div class="roomrobot07-tips-2 roomrobot07-tips">
                <span>沿墙传感器</span>
            </div>
            <div class="roomrobot07-tips-3 roomrobot07-tips">
                <span>尘盒检测传感器</span>
            </div>
            <div class="roomrobot07-tips-4 roomrobot07-tips">
                <span>碰撞传感器</span>
            </div>
            <div class="roomrobot07-tips-5 roomrobot07-tips">
                <span>超声雷达传感器</span>
            </div>
            <div class="roomrobot07-tips-6 roomrobot07-tips">
                <span>电子罗盘传感器</span>
            </div>
            <div class="roomrobot07-tips-7 roomrobot07-tips">
                <span>悬崖传感器</span>
            </div>
            <div class="roomrobot07-tips-8 roomrobot07-tips">
                <span>陀螺仪 / 加速度计</span>
            </div>
            <div class="roomrobot07-tips-9 roomrobot07-tips">
                <span>跌落传感器</span>
            </div>
            <div class="roomrobot07-tips-10 roomrobot07-tips">
                <span>里程计</span>
            </div>
            <div class="roomrobot07-tips-11 roomrobot07-tips">
                <span>风机转速传感器</span>
            </div>

        </div>
        <div class="container-roomrobot08 section-items">
            <div class="roomrobot08-text section-items">
                <span class="container-roomrobot04-text-h">神机妙算，行业领先的 SLAM 算法</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">同步定位与地图构建算法又称 SLAM 算法，被运用在美国 NASA 火星车、Google 无人驾驶汽车等高科技项目中，它是
                    <br> 根据激光测距传感器获取的精准距离信息以及陀螺仪方向数据、里程计数据、加速度计数据等全方位数据进行计算，通
                    <br> 过此算法可以实时构建房间地图，并准确知道自己在地图上的位置，从而为全面的路径规划提供保障。
                </span>
                <br>
                <br>
            </div>
        </div>
        <div class="container-roomrobot09 section-items">
            <div class="roomrobot09-text section-items">
                <span class="container-roomrobot04-text-h">走自己的路，高效完成清扫任务</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">我会根据 SLAM 算法绘制的地图划分区域和规划清扫路径，从而进行清扫。在传感器的配合下，我能够知道
                    <br> 室内地面物体分布，识别障碍物并实时规划清扫路径。为保证清扫效果和清扫效率，我会采用先延边后 Z 字形
                    <br> 的清扫路径，逐一完成分区清扫，高效的完成清扫任务。
                </span>
                <a href="JavaScript:;" class="roomrobot01-text-start">

                    <i class="start"></i>
                    <span class="roomrobot01-text-start-text">点击观看路径规划对比视频</span>
                </a>
            </div>
            <div class="roomrobot09-body"></div>
        </div>
        <div class="container-roomrobot10 section-items">
            <div class="roomrobot10-content section-items">
                <span class="container-roomrobot04-text-h">不用操心，我会自动回充并断点续扫</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">通过我自带的激光测距传感器扫描并定位充电座，识别它在地图上的位置。当
                    <br> 房间全部清扫完成，我会自动规划最短路线返回充电座充电。在清扫途中，
                    <br> 如果电量低于 20%，我能自动返回充电座充电，当电量充至 80％ 后我
                    <br> 还会回到上次未清扫完成地点继续清扫，免去重复清扫的尴尬。
                </span>
                <br>
                <ul class="roomrobot10-content-imgcontent">
                    <li>
                        <div class="roomrobot10-content-img1 roomrobot10-content-img"></div>
                        <span>自动回充</span>
                    </li>
                    <li>
                        <div class="roomrobot10-content-img2 roomrobot10-content-img"></div>
                        <span>断点续扫</span>
                    </li>
                    <div class="roomrobot10-content-imgtail">
                        <a href="JavaScript:;" class="roomrobot01-text-start">

                            <i class="start"></i>
                            <span class="roomrobot01-text-start-text">点击观看自动回充及断点续扫视频</span>
                        </a>
                    </div>
                </ul>

            </div>
        </div>
        <div class="container-textthird section-items">
            <span class="container-textfirst-h">“不止聪明，我更有扎实的扫地基本功”</span>
        </div>
        <div class="container-roomrobot11 section-items">
            <div class="roomrobot11-textcontent section-items">
                <span class="container-roomrobot04-text-h">洁净如初的地面，交给爱干净的我</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">我除了是一台“聪明” 的机器人，更是洁净清扫的好帮手。整机浮动贴合地面、强大的高静压风机可以有效吸尘，同时
                    <br> 配合边刷横扫、滚刷竖卷等立体清扫系统可以轻松吸起浮土灰尘、毛发、碎屑，更可深度清洁地板、地砖缝隙积尘。即
                    <br> 使光脚行走在地面上，也没有丝毫灰尘和颗粒感，让你时刻感受温馨干净的家！
                    <br>
                </span>
                <br>
                <ul class="roomrobot10-content-imgcontent">
                    <li>
                        <div class="roomrobot11-img1 roomrobot11-img"></div>
                        <span>强力风机</span>
                    </li>
                    <li>
                        <div class="roomrobot11-img2 roomrobot11-img"></div>
                        <span>浮动主刷</span>
                    </li>
                    <li>
                        <div class="roomrobot11-img3 roomrobot11-img"></div>
                        <span>动态边刷</span>
                    </li>
                </ul>
            </div>

            <div class="roomrobot11-img-ba01">

            </div>
            <div class="roomrobot11-img-ba02"></div>
            <div class="roomrobot11-img-ba03"></div>
            <div class="roomrobot11-img-viedobox">
                <video class="roomrobot11-img-viedobox-video" src="${base}/static/images/qiqi/roomrobot-shuazi.mp4" autoplay="autoplay" muted loop="loop"></video>
            </div>
            <canvas></canvas>
            <!-- 老吴我做不到我放弃= =灰尘太难了 -->
            <div class="roomrobot11-texttail section-items">
                <span class="container-roomrobot04-text-h">澎湃吸力，我有强大的肺活量</span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">采用日本 NIDEC 无刷电机，最大风压约为 1800Pa*，强大的风量带来的强劲风压可以快速有效的吸走
                    <br> 附着在地面或地毯上的灰尘，清扫效果立竿见影。
                    <br>
                </span>
                <div class="roomrobot11-texttail-img section-items">
                    <a href="JavaScript:;" class="roomrobot011-text-start">

                        <i class="roomrobot011-start"></i>
                        <span class="roomrobot011-text-start-text">点击观看吸力视频</span>
                    </a>
                </div>
                <div class="textsecond-text-tail section-items">
                    <span>* 由石头科技实验室测得，在产品实际使用过程中，风机全速模式下，风压最大约为1800Pa。</span>
                </div>
            </div>
        </div>
        <div class="container-roomrobot012 section-items">
            <div class="roomrobot012-text section-items">
                <span class="container-roomrobot04-text-h">沿墙清扫，
                    <br> 连墙边都不放过
                </span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">在清扫过程中最头疼的问题就是墙边缝隙经常扫不干净，我在
                    <br> 沿墙传感器的作用下，在清扫墙边缝隙的过程中始终和墙精确
                    <br> 保持约 10mm 的距离，同时配合边刷高速旋转可以彻底将墙边
                    <br> 缝隙的灰尘清理干净，不错过家的每一寸空间。
                    <br>
                </span>
                <div class="roomrobot12-texttail-img section-items">
                    <a href="JavaScript:;" class="roomrobot011-text-start">

                        <i class="roomrobot011-start"></i>
                        <span class="roomrobot011-text-start-text">观看沿墙清扫视频</span>
                    </a>
                </div>
                <a href="JavaScript:;" class="roomrobot12-texttail-tail1">继续了解我的清扫系统 ></a>
            </div>
        </div>
        <div class="container-textfourth section-items">
            <span class="container-textfirst-h">“精力充沛，聪明的我还有更高的追求”</span>
        </div>
        <div class="container-roomrobot13 section-items">
            <div class="roomrobot012-text section-items">
                <span class="container-roomrobot04-text-h">干净的外观配爱干净的你
                    <br>
                </span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">我采用了模块化的设计构造，由七部分组成，全身为纯净的白色，简洁优雅。9.6cm 的身高让我可以穿行于各种狭
                    <br> 窄空间，IMR 工艺的上盖，更让我质感透亮， 周身采用高强度抗冲击ABS 材料，耐磨不易老化。而四周及底面采
                    <br> 用磨砂处理工艺，避免因碰撞磨损留下痕迹。充电座使用防火等级 V0 级塑胶材料，有效减少了安全隐患。
                    <br>
                    <br>
                </span>
                <a href="JavaScript:;" class="roomrobot12-texttail-tail">继续了解更多我的设计 ></a>
            </div>
        </div>
        <div class="container-roomrobot14 section-items">
            <div class="roomrobot14-img1 roomrobot14-img">

            </div>
            <div class="roomrobot14-img2 roomrobot14-img">

            </div>
            <div class="roomrobot14-textcontent">
                <span class="container-roomrobot04-text-h">强劲动力
                    <br> 源自我的强大电池
                    <br>
                </span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word">高能量密度 18650 锂离子电芯，容量为 5200mAh，标准模式下单次
                    <br> 最大续航时间约 2.5 小时最大清扫面积约 250 平米*，特殊设计的恒流
                    <br> 恒压充电机制保证电池长寿命，同时配合自动回充的贴心功能，可以
                    <br> 满足不同面积家庭的清扫需求。
                    <br>
                    <br>
                </span>
                <div class="textsecond-text-tail roomrobot04-tail">
                    <span>*此数据在木地板地面清扫下测试得出，数据来自于石头科技实验室。</span>
                </div>
                <div class="textsecond-text-img2"></div>
                <span class="container-roomrobot04-text-h roomrobot14-text-tail-h">多重保护，请放心我的电池安全
                    <br>
                </span>
                <br>
                
                <span class="container-roomrobot04-text-word .roomrobot14-text-tail-word">我的电芯采用了不锈钢外壳，自带 PTC/CID 等安全防护装置，电池组和
                    <br> 配套电源适配器均采用一流的精密充放电控制芯片，而电池组保护板配置
                    <br> 了先进的一级、二级防护芯片，基于用户安全为目标而设计的电池组多串
                    <br> 保护板，具备防过充、过放、过热/冷、短路、过流、二次过压等多重安
                    <br> 全 保护，确保电池组长寿命使用*。
                    <br>
                    <br>
                </span>
                <ul>
                    <li>
                        <div class="roomrobot14-tailimg1 roomrobot14-tailimg"></div>
                        <span>过充保护</span>
                    </li>
                    <li>
                        <div class="roomrobot14-tailimg2 roomrobot14-tailimg"></div>
                        <span>过放保护</span>
                    </li>
                    <li>
                        <div class="roomrobot14-tailimg3 roomrobot14-tailimg"></div>
                        <span>温度保护</span>
                    </li>
                    <li>
                        <div class="roomrobot14-tailimg4 roomrobot14-tailimg"></div>
                        <span>短路保护</span>
                    </li>
                    <li>
                        <div class="roomrobot14-tailimg5 roomrobot14-tailimg"></div>
                        <span>过流保护</span>
                    </li>
                    <li>
                        <div class="roomrobot14-tailimg6 roomrobot14-tailimg"></div>
                        <span>二次过压</span>
                    </li>
                    <div class="textsecond-text-tail roomrobot04-tail">
                        <span>* 符合国标 GB31241-2014，并通过 UN38.3 航空运输认证等国际安全标准。</span>
                    </div>
                </ul>

            </div>
        </div>


        <div class="container-roomrobot15 section-items">
            <div class="roomrobot14-textcontent">

                <span class="container-roomrobot04-text-h roomrobot14-text-tail-h">远程智能控制，
                    <br> 家里没人也能让我扫地
                    <br>
                </span>
                <br>
                <br>
                <span class="container-roomrobot04-text-word .roomrobot14-text-tail-word">打开米家APP ，可以实时查看清扫状态，通过实时地图了解清扫
                    <br> 进度。此外，你也可以随时安排我的清扫任务，上班前设置好每天
                    <br> 的定时清扫时间，下班回家后就可以感受干净地面带来的小幸福。清
                    <br> 扫时，还有安静、标准、强力三种清扫模式可以随心切换，而耗材到
                    <br> 期前米家APP 会提醒你更换相关部件，一键下单，智能控制就是
                    <br> 这么简单*。
                    <br>
                    <br>
                </span>
                <ul>
                    <li>
                        <div class="roomrobot15-img1 roomrobot15-img"></div>
                        <span>标准</span>
                    </li>
                    <li>
                        <div class="roomrobot15-img2 roomrobot15-img"></div>
                        <span>清扫</span>
                    </li>
                    <li>
                        <div class="roomrobot15-img3 roomrobot15-img"></div>
                        <span>回充</span>
                    </li>
                    <div class="textsecond-text-tail roomrobot04-tail">
                        <span>* 清扫路径根据实际情况计算，图片仅为效果。</span>
                    </div>
                </ul>
            </div>
        </div>
        <div class="container-roomrobot16 section-items">
            <div class="roomrobot16-textcontent">
                <span class="container-roomrobot04-text-h roomrobot14-text-tail-h">饱经磨练，让我的陪伴更长久
                    <br>
                </span>
                <ul>
                    <li class="roomrobot16-textcontent-img1">

                        <span class="roomrobot16-textcontent-h">1500 小时</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">持续运行寿命测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img2">

                        <span class="roomrobot16-textcontent-h">300000 次</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">碰撞缓冲器寿命测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img3">

                        <span class="roomrobot16-textcontent-h">10000 次</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">按键寿命测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img4">

                        <span class="roomrobot16-textcontent-h">1500 次</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">上盖开合测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img5">

                        <span class="roomrobot16-textcontent-h">1500 小时</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">尘盒开合测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img6">

                        <span class="roomrobot16-textcontent-h">10000 次</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">充电接触可靠性测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img7">

                        <span class="roomrobot16-textcontent-h">-5℃ - 40℃</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">高低温工作测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img8">

                        <span class="roomrobot16-textcontent-h">2000 小时</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">风机可靠性测试</span>
                    </li>
                    <li class="roomrobot16-textcontent-img9">

                        <span class="roomrobot16-textcontent-h">50G</span>
                        <br>
                        <span class="roomrobot16-textcontent-word">冲击测试</span>
                    </li>
                </ul>
                <div class="textsecond-text-tail roomrobot04-tail">
                    <span>* 上述文中所出现数据均来自石头科技实验室或官方测定，根据实际使用情况的不同会产生误差。</span>
                </div>
            </div>
        </div>
        <div class="container-roomrobot18 section-items">
            <div class="roomrobot18-textcontent">
                <span class="container-roomrobot04-text-h">虚拟墙，更安全的保护屏障
                    <br>
                </span>
                <br>
                <span class="container-roomrobot04-text-word">米家扫地机器人虚拟墙纤薄美观，25mm 的宽度与 2mm 的高度，让
                    <br> 它可以任意放置在家中任何角落，表面磁强高达 300 高斯，通过机身
                    <br> 前部的电子罗盘传感器，米家扫地机器人可以正确识别到虚拟墙并绕
                    <br> 开而不会尝试穿越。
                    <br>
                </span>
                <span class="roomrobot18-digital">39 </span>
                <span class="roomrobot18-yuan">元 (选配)</span>
                <br>
                <a href="JavasCript:;">点击购买虚拟墙 ></a>
            </div>
        </div>
        <div class="container-roomrobot19 section-items">
            <div class="container-roomrobot19-left">
                <div class="roomrobot18-textcontent">
                    <span class="small-roomrobot04-text-h container-roomrobot04-text-h">米家扫地机器人主刷罩
                        <br>
                    </span>
                    <span class="container-roomrobot04-text-word">定期更换，时刻保证清扫
                        <br>
                    </span>
                    <span class="roomrobot18-digital">39 </span>
                    <span class="roomrobot18-yuan">元 (2个)</span>
                    <br>
                    <a href="JavasCript:;">立即购买 ></a>
                </div>
            </div>
            <div class="container-roomrobot19-right">
                <div class="roomrobot18-textcontent">
                    <span class="small-roomrobot04-text-h container-roomrobot04-text-h">米家扫地机器人尘盒滤网
                        <br>
                    </span>
                    <span class="container-roomrobot04-text-word">定期更换，有效过滤灰尘
                        <br>
                    </span>
                    <span class="roomrobot18-digital">39 </span>
                    <span class="roomrobot18-yuan">元</span>
                    <br>
                    <a href="JavasCript:;">立即购买 ></a>
                </div>
            </div>
            <div class="container-roomrobot19-c">
                <div class="roomrobot18-textcontent">
                    <span class="small-roomrobot04-text-h container-roomrobot04-text-h">米家扫地机器人边刷
                        <br>
                    </span>
                    <span class="container-roomrobot04-text-word">定期更换，让墙边始终如新
                        <br>
                    </span>
                    <span class="roomrobot18-digital">29 </span>
                    <span class="roomrobot18-yuan">元</span>
                    <br>
                    <a href="JavasCript:;">立即购买 ></a>
                </div>
            </div>
            <div class="container-roomrobot19-d">
                <div class="roomrobot18-textcontent">
                    <span class="small-roomrobot04-text-h container-roomrobot04-text-h">米家扫地机器人主刷
                        <br>
                    </span>
                    <span class="container-roomrobot04-text-word">定期更换，清扫更高效
                        <br>
                    </span>
                    <span class="roomrobot18-digital">39 </span>
                    <span class="roomrobot18-yuan">元</span>
                    <br>
                    <a href="JavasCript:;">立即购买 ></a>
                </div>
            </div>
        </div>
        <div class="container-roomrobot-nex section-items">
            <a class="roomrobot-nex-img" href="JavaScript:;"></a>
        </div>
        <div class="footer">
            <div class="footer-content">
                <div class="footer-content-pic">
                    <img src="${base}/static/images/qiqi/b30def5a8f0e967d128dec2b49751aa6.png" width="100%" height="100%">
                </div>
                <div class="footer-content-font">
                    <span class="footer-content-font-h">扫码关注【
                        <span class="footer-content-font-h-m">小米商城</span>】公众号</span><br>
                    <span class="footer-content-font-tail">回复“真心想要”，免费赢小米小爱音箱mini！</span>
                </div>
            </div>
        </div>
    </div>
    <script src="${base}/static/js/jquery-2.1.1.min.js"></script>
    <script>
        $(function () {
            $(window).scrollTop(0);
            // $(".roomrobot01-text").hide(1000);
            // $(".roomrobot01-text").show(3000);
            // 开头字体消失出现
            $(".roomrobot01-text").fadeOut(2400);

            $(".roomrobot01-effect .roomrobot01-text-start").fadeOut(2400);

            $(".roomrobot01-text").fadeIn(3000);

            $(".roomrobot01-effect .roomrobot01-text-start").fadeIn(3000);
            // 风扇位置的改变
            $(".effect-items-fan").hide(2000);
            $(".effect-items-fan1").fadeOut(4000);
            $(".effect-items-fan").fadeIn(4000);
            // 鼠标移入放大移出缩小
            $(".roomrobot03-01-text,.roomrobot03-01").mouseover(function () {
                $(".roomrobot03-01").css("transform", "scale(1.4)");
            }).mouseout(function () {
                $(".roomrobot03-01").css("transform", "scale(1.35)");
            })
            $(".roomrobot03-02-text,.roomrobot03-02").mouseover(function () {
                $(".roomrobot03-02").css("transform", "scale(1.4)");
            }).mouseout(function () {
                $(".roomrobot03-02").css("transform", "scale(1.35)");
            })
            $(".roomrobot03-03-text,.roomrobot03-03").mouseover(function () {
                $(".roomrobot03-03").css("transform", "scale(1.4)");
            }).mouseout(function () {
                $(".roomrobot03-03").css("transform", "scale(1.35)");
            })

             
            // var a=$(window).scrollTop();
            // alert(a);
            // 到了一定位置图片开始往下移动
            $(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 500) {
                    $(".roomrobot02-0img").addClass("roomrobot02-01imgchange");
                }
                if (height >= 2818) {
                    $(".container-roomrobot04-img").addClass("container-roomrobot04-imgchange");
                }
                if (height >= 4268) {
                    $(".container-roomrobot06-bg").css("transform", "scale(1.05)")
                }
                if (height >= 7805) {
                    $(".roomrobot09-body").css("transform", "translate(0,0)")
                }
                if (height >= 13553) {
                    $(".roomrobot14-img1").fadeOut(2000);
                }

            })
        });




    </script>
</body>

</html>