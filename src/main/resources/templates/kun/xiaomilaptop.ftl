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
	<link rel="stylesheet" href="../xiaomi/css/xiaomilaptop.css">
    <style type="text/css">
       
    *{
    box-sizing: content-box;
    
}


.body {
    font: 14px/1.5 "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
    color: #333;
    min-width: 1226px;
   
}
.laptop{
    text-align: center;
}

.section-system{
    overflow: hidden;
    position: relative;
    height: 1900px;
    background-color: #202020;
 

}
.col-fff {
    color: #fff;
}
.txt-title{
    padding-top: 100px;
    font-size: 40px;
}
.txt-info{
    font-size: 16px;
    line-height: 1.8;
}
 .section-system .wind {
    position: absolute;
}
.wind-wrap{
    position: absolute;
    left: 50%;
    margin-left: -630px;
    top: 332px;
    width: 1260px;
    height: 520px;
    background: url("${base}/static/images/kun/ku/laptop/main-body.png") no-repeat bottom center;

}
.left-wind{  
    top: 197px;
    left: 150px;
    position: absolute;
    width: 179px;
    height: 177px;
}
.right-wind{
    top: 197px;
    right: 150px;
    position: absolute;
    width: 179px;
    height: 177px;

}
.lwind01,.rwind01{
    left: 18px;
    top: 15px;
    width: 150px;
    height: 149px;
    
}
.lwind02,.rwind02{
    width: 179px;
    height: 177px;
    left: 0;
    top: 0;
    z-index: 6;
}
.lwind03,.rwind03{
    left: 20px;
    top: 15px;
    width: 145px;
    height: 149px;
}
.lwind04,.rwind04{
    left: 4px;
    top: 0;
    width: 175px;
    height: 175px;
}
.lwind05,.rwind05{
    top: 30px;
    left: 30px;
    width: 122px;
    height: 121px;
}
.lwind06,.rwind06{
    top: 30px;
    left: 30px;
    width: 122px;
    height: 121px;
}
.lwind07,.rwind07{
    top: 30px;
    left: 30px;
    width: 119px;
    height: 118px;
}
.lwind08,.rwind08{
    top: 27px;
    left: 27px;
    width: 124px;
    height: 126px;
    z-index: 2;
}

.lwind01{
    background: url("${base}/static/images/kun/ku/laptop/left-wind01.png") no-repeat bottom center;
    animation: rotate .4s infinite linear;
    
    transform: rotate(45deg);
    
}
.rwind01{
    background: url("${base}/static/images/kun/ku/laptop/left-wind01.png") no-repeat bottom center;
    animation: rotate1 .4s infinite linear; 
    transform: rotate(45deg);
}

.lwind02{
    background: url("${base}/static/images/kun/ku/laptop/left-wind02.png") no-repeat bottom center;
    animation: rotate .4s infinite linear;
    
    transform: rotate(90deg);
}
.rwind02{
    background: url("${base}/static/images/kun/ku/laptop/right-wind02.png") no-repeat bottom center;
    animation: rotate1 .4s infinite linear;
    
    transform: rotate(90deg);
}
.lwind03{
    background: url("${base}/static/images/kun/ku/laptop/left-wind03.png") no-repeat bottom center;
    animation: rotate .4s infinite linear;
    
    transform: rotate(135deg);

}
.rwind03{
    background: url("${base}/static/images/kun/ku/laptop/right-wind03.png") no-repeat bottom center;
    animation: rotate1 .4s infinite linear;
    
    transform: rotate(90deg);
}
.lwind04{
    
    background: url("${base}/static/images/kun/ku/laptop/left-wind04.png") no-repeat bottom center;
    animation: rotate .4s infinite linear;
    transform: rotate(45deg);
}
.rwind04{
    background: url("${base}/static/images/kun/ku/laptop/right-wind04.png") no-repeat bottom center;
    animation: rotate1 .4s infinite linear;
    
    transform: rotate(90deg);
}
.lwind05,.rwind05{
    background: url("${base}/static/images/kun/ku/laptop/left-wind05.png") no-repeat bottom center;

}
.lwind06,.rwind06{
    background: url("${base}/static/images/kun/ku/laptop/left-wind06.png") no-repeat bottom center;

}
.lwind07,.rwind07{
    background: url("${base}/static/images/kun/ku/laptop/left-wind07.png") no-repeat bottom center;

}
.lwind08,.rwind08{
    background: url("${base}/static/images/kun/ku/laptop/left-wind08.png") no-repeat bottom center;

}
.wind-out{
    position: absolute;
    bottom: 445px;
    left: 84px;
    width: 1092px;
    height:0px;
    animation: out 1.6s infinite linear;
    background: url("${base}/static/images/kun/ku/laptop/wind-out.png") no-repeat bottom center;
}


@keyframes rotate{
    from{
   transform:rotate(0deg);
  }
  to{
   transform:rotate(-360deg);
  }
}

@keyframes rotate1{
    from{
   transform:rotate(0deg);
  }
  to{
   transform:rotate(360deg);
  }
}

@keyframes out{
    0%, 20% {
    height: 0px;
    opacity: 0;
    /* filter: alpha(opacity=0)\9; */
}
40%, 60% {
    opacity: 0;
    /* filter: alpha(opacity=0)\9; */
}
80%, 100% {
    height: 77px;
    opacity: 1;
    /* filter: alpha(opacity=100)\9; */
}
}
.col-fff {
    color: #fff;
}
.col-000 {
    color: #000;
}
.container {
    width: 1226px;
    *zoom: 1;
    margin-right: auto;
    margin-left: auto;
}
.section-top{
    height: 855px;
   
   
    background: url(${base}/static/images/kun/ku/laptop/bg-top.jpg) no-repeat center;
     background-size: contain;
   /* .section-top-img{
    height: 890px;
    background: url(${base}/static/images/kun/ku/laptop/bg-top.jpg) center center;
   */

} 
.section-feature{
    height: 360px;
   
}
.section-perfor{
    height: 760px;
}
.section-process{
    height: 992px;
    /* background-color: yellowgreen; */
    background-color: rgb(249, 249, 249);
}
.section-game{
    height: 1100px;
    background-color: rgb(249, 249, 249);

}
.section-screen{
    height: 760px;
}

.section-screen-div{
    height: 760px;
    background-color: aqua;
    background: url(${base}/static/images/kun/ku/laptop/bg-screen.jpg) no-repeat center;
     background-size: contain;
     padding-top: 110px;
  
}
.section-keybord{
    height: 950px;
    background-color: aqua;
}
.section-keybord-main{
    height: 790px;
  
}
.section-keycap{
    height: 603px;
  
}
.section-touch{
    height: 994px;
   
    background: url(${base}/static/images/kun/ku/laptop/bg-touch.jpg) center;
    background-size: cover;
    margin-top: 20px;
}
.section-body{
    height: 1100px;
 
}
.section-interface{
    height: 1065px;
    
    background: url(${base}/static/images/kun/ku/laptop/bg-interface.jpg) center;
    background-size: cover;
}
.section-sound{
    height: 1068px;
    
    background: url(${base}/static/images/kun/ku/laptop/bg-sound.jpg) center;
    background-size: cover;
}
.section-expirence{
    height: 480px;
  
}
.section-buy{
    height: 1142px;
    background-color: #fafafa;
    position: relative;
}
 .feature-list{
    list-style: none;
}

.txt-title{
    font-size: 40px;
    line-height: 50px;
}
.txt-info{
    margin-top: 20px;
    font-size: 24px;
}
.sestion-clearfix{
    
    height: 389px;
   
    margin: 0 auto;
    margin-top: 10px;
    padding-left: 300px;
}
.bt{
    width: 405px;
    height: 114.6px;
    
    float: left;
    text-align: center;
    /* line-height: 114.6px; */
    list-style: none;
    border: 1px solid #e0e0e0;
    border-right: 0;
    border-bottom: 0;
    padding: .56em 0 .5em;
    
    
}
.bt1{
    list-style: none;
    width: 405px;
    height: 114.6px;
    /* line-height: 123.25px; */
    float: left;
    text-align: center;
    border: 1px solid #e0e0e0;
    border-top: none;
    border-right: 0;
    border-bottom: 0;
   
    padding: .56em 0 .5em;
}
.bt11{
    list-style: none;
    width: 405px;
    height: 114.6px;
    /* line-height: 123.25px; */
    float: left;
    text-align: center;
    border: 1px solid #e0e0e0;
    border-top: none;
    border-right: 0;
    border-bottom: 0;
    border-left: none;
    padding: .56em 0 .5em;
}
.bt2{
    list-style: none;
    width: 405px;
    height: 114.6px;
    /* line-height: 123.25px; */
    float: left;
    text-align: center;
    border: 1px solid #e0e0e0;
    border-left: none;
    padding: .56em 0 .5em;
    border-right: 0;
    border-bottom: 0;
}
.web-titile{
    font-size: 30px;
    font-family: 'F31e09';
    font-weight: normal;
    line-height: 1.5;
}
.web-txt-info {
    font-size: 16px;
    line-height: 1.8;
}
.context {
    width: 100%;
    height: 100%;
    vertical-align: middle;
    text-align: center;
    color: #fff;
}  
.section-top .context{
    margin-top: 20px;
} 
.perfor-context{
    margin-top: -600px;

} 
.section-perfor .txt-title{
    font-size: 60px;
    font-style: normal;
  
}
.context-top{
    margin-top: -90px;
    
}
.container{
    width: 1226px;
    *zoom: 1;
    margin-right: auto;
    margin-left: auto;
}

.laptop-container{
    margin-top: -900px;

}
.li-left{
    width: 613px;
    height: 310px;
    float: left;
    margin-left: -60px;
    margin-top: -230px;
    display: inline-block;
}
.li-right{
    width: 613px;
    height: 310px;
    float: right;
    margin-right: -60px;
    margin-top: -230px;

}
.laptop-container{
    text-align: left;
}
.zhuban{
    width: 1293px;
    height: 472px;
    background: url(${base}/static/images/kun/ku/laptop/zhuban.png)no-repeat center center;
    margin-top: 270px;
    position: absolute;
    left: 50%;
    margin-left: -630px;
}

.txt-title-top{
    font-size: 40px;
    line-height: 10px;
}
.txt-info-top{
    margin-top: 30px;
    font-size: 24px;
}
.box{
    opacity: 0;
}
.ram01{
    
    background: url(${base}/static/images/kun/ku/laptop/ram01.png)no-repeat center center;
    margin-left: 426px;
    margin-top: 90px;
    width: 63px;
    height: 157px;
    
}
.ram01ani{
    animation: show 1s linear;
    animation-fill-mode: forwards;
}
.ram02{
    
    background: url(${base}/static/images/kun/ku/laptop/ram02.png)no-repeat center center;
    margin-left: 530px;
    margin-top: -155px;
    width: 155px;
    height: 65px;
    /* animation: show 1.5s; */
}
.pan01{
    
    background: url(${base}/static/images/kun/ku/laptop/pan01.png)no-repeat center center;
    margin-left: 190px;
    margin-top: -80px;
    width: 278px;
    height: 84px;
    /* animation: show 1.5s; */
}
.card{
    background: url(${base}/static/images/kun/ku/laptop/card.png)no-repeat center center;
    margin-left: 900px;
    margin-top: 230px;
    width: 278px;
    height: 84px;
   /* animation: show 1.5s; */
}
.laptop .txt-title{
    /* padding-top: 30px; */
    line-height: 60px;

   

}
.section-screen li:first-child {

    padding-left: 0px;
    border: none;
}
.section-screen li {

    display: inline-block;
    *zoom: 1;
    *display: inline;
    padding: 0 25px;
        padding-left: 25px;
    font-size: 18px;
    line-height: 1.5;
    color: #424242;
    border-left: 1px solid #ccc;

}
.section-screen .context{
    width: 845px;
    height: 200px;
    padding-left: 1040px;
    margin-top: 20px;
    text-align: left;
    
}
.section-screen .txt-title{
    margin-left: 40px;
}
.content{
    position: relative;
    overflow: hidden;
    margin: 40px auto 20px;
    width: 1226px;
    height: 730px;
    background: #fafafa;


}
.pic-keyboard{
    margin-top: 80px;
    margin-left: 57px;

}
.pic-maskkeyboard{
    margin-top: -410px;
    margin-left: 45px;

}
.pos-text01{
    
    height: 215px;
    float: left;
    margin-left: 80px;
    margin-top: 35px;
    display: inline-block;
}
.pos-text02{
   
    height: 215px;
    float: right;
    margin-right: 25px;
    margin-top: 35px;

}
.pos {

position: absolute;

}
.delay1{
animation-delay: 1s;
}
@keyframes show{
    0% {
    opacity:0;
    }
    50%{
        opacity: .3;
    }
    75%{
        opacity: .6;
    }
    100% {
    opacity: 1;
   
    }
}
.capright,.capleft{
    position: relative;
    float: left;
    width: 603px;
    height: 603px;
    background: #fafafa;
}
.capright{
    margin-left: 20px;

   
}
.capleft{
    margin-left: 310px;
   
    
    
}
.capr05{
    bottom: 300px;
    height: 20px;
    position: absolute;
    left: 175px;
    width: 252px;
    background-repeat: no-repeat;
  
    }
.capr04{

    bottom: 320px;
    height: 86px;
    position: absolute;
    left: 175px;
    width: 252px;
    background-repeat: no-repeat;
    
}
.capr04ani{
    animation: high 1.5s linear;   
}
.capr04,.capr05{
background: url(${base}/static/images/kun/ku/laptop/capl04.png);
}
.layer{
    position: absolute;
    left: 175px;
    top: 164px;
    width: 255px;
    height: 186px;
    z-index: 1;
    /* background: url(${base}/static/images/kun/ku/laptop/capl.png); */
}
.layer1{
    position: absolute;
    left: 175px;
    top: 164px;
    width: 255px;
    height: 186px;
    z-index: 1;
    background: url(${base}/static/images/kun/ku/laptop/capl.png);
}
.capl01{
    background: url(${base}/static/images/kun/ku/laptop/capl01.png);    
}
.capl01ani{
    animation: press 2s;
    animation-delay: 0.5s;
}

.capl02{
    background: url(${base}/static/images/kun/ku/laptop/capl02.png);
    /* animation: press 2s;
    animation-delay: 0.7s; */

}
.capl03{
    background: url(${base}/static/images/kun/ku/laptop/capl03.png);
    /* animation: press 2s;
    animation-delay: 0.9s; */
    
}
.capl01,.capl02,.capl03{
    position: absolute;
    top: 0;
    left: 0;
    width: 253px;
    height: 154px;
    opacity: 0;
    animation-fill-mode: forwards;
}
.capl-context{
    margin-top: 400px;
  
}
.capr-context{
    margin-top: 380px;
  
}
.icon-touch{
    opacity: 0;
    width: 64px;
    height: 64px;
    position: absolute;
    margin-left: 1050px;
    margin-top: 290px;
    background: url(${base}/static/images/kun/ku/laptop/icon-touch.png);
    background-size: cover;
}
/* .icon-touch-ani{
    animation: show
} */
.touch-context{
   padding-top: 660px;
}
@keyframes high{
    0%{
       height:  85px;
    }
    50%{
        height: 35px;
    }
    100%{
        height:  85px;
    }
}
@keyframes press{
    0%{
        opacity: 0;
    }
    100%{
        opacity: 1;
    }
}
@keyframes show{
    0% {
    opacity:0;
    }
    50%{
        opacity: .3;
    }
    75%{
        opacity: .6;
    }
    100% {
    opacity: 1;
   
    }
}
.layer-wrap{
    position: absolute;
   
    left: 50%;
    margin-left: -623px;
    width: 1246px;
    height: 570px;



}
.layer{
    position: absolute;
    opacity: 0;


}
.layermask {
    opacity: 1;

    left: 20px;
    top: 340px;
    width: 1220px;
    height: 194px;
    z-index: 1;
    background: url(${base}/static/images/kun/ku/laptop/layermask.png)no-repeat center center;
}
.layerall {
    opacity: 1;
    left: 25px;
    top: 240px;
    width: 1210px;
    height: 230px;
    background:  url(${base}/static/images/kun/ku/laptop/layerall.png)no-repeat center center;
    /* transition: all .5s 1s ease-in; */
   
}
.layerallani{
    z-index: 2;
    animation: all 1s linear ;
    animation-fill-mode: forwards;
    animation-delay: .1s;
   
}
.layer01{
    top: 240px;
    left: 55px;
    width: 1157px;
    height: 222px;
    background:  url(${base}/static/images/kun/ku/laptop/layer01.png)no-repeat center center;
    
}
.layer01ani{
    animation: up 2s linear;
    animation-fill-mode: forwards;
    animation-delay: .1s;
    z-index: 3;
}

.layer02 {

    top: 260px;
    left: 45px;
    width: 1170px;
    height: 189px;
    background:  url(${base}/static/images/kun/ku/laptop/layer02.png)no-repeat center center;
    

}
.layer02ani{
    animation: up2 2s linear ;
    animation-fill-mode: forwards;
    animation-delay: .1s;
    z-index: 4;
}
.layer03 {

    top: 285px;
    left: 12px;
    width: 1214px;
    height: 120px;
    background:  url(${base}/static/images/kun/ku/laptop/layer03.png)no-repeat center center;
   
}
.layer03ani{
    animation: up3 2s linear ;
    animation-fill-mode: forwards;
    animation-delay: .1s;
    z-index: 5;
}
.layer04{
    top: 300px;
    left: 12px;
    width: 1211px;
    height: 82px;
    background:  url(${base}/static/images/kun/ku/laptop/layer04.png)no-repeat center center;
   
}
.layer04ani{
    animation: up4 2s linear ;
    animation-fill-mode: forwards;
    animation-delay: .1s;
    z-index: 6;

}
.layer05{
    top: 300px;
    left: 12px;
    width: 1223px;
    height: 75px;
    background:  url(${base}/static/images/kun/ku/laptop/layer05.png)no-repeat center center;
  
}
.layer05ani{
    animation: up5 2s linear ;
    animation-fill-mode: forwards;
    z-index: 7;
    animation-delay: .1s;

}
.layer06{
    top: 270px;
    left: 0;
    width: 1246px;
    height: 49px;
    background:  url(${base}/static/images/kun/ku/laptop/layer06.png)no-repeat center center;
    
}
.layer06ani{
    animation: up6 2s linear ;
    animation-fill-mode: forwards;
    animation-delay: .1s;
    z-index: 8;
}
.body-context{
    height: 374px;
}
.small-play{
    display: inline-block;
    width: 18px;
    height: 18px;
    background:  url(${base}/static/images/kun/ku/laptop/small-play.png)no-repeat center center;
}
.section-interface .link{
   margin-top: 680px;
   margin-left: 20px;
   display: block;
}
.sound-context{
    text-align: left;
    height: 880px;
    width: 1700px;
    padding-top: 360px;
    margin-left: 120px;
}
.sound-context .txt-title{
    font-size: 50px;
    line-height: 85px;
}
.sound-context .txt-info{
    font-size: 19px;
}
.logo{
    width: 398px;
    height: 77px;
}
.section-buy .group{
    float: left;
    margin-left: 30px;
    width: 382px;
    height: 600px;
    background: #fff;
    list-style-type: none;
    text-align: left;
 

}
.type-list{
    margin-top: 20px;
    margin-left: 14%;
    position: absolute;
  
}
.section-buy .txt-title{
   
    margin-left: 20px;
    margin-top: 0;
    font-size: 30px;
    padding-top: 20px; 
    text-align: left;
    
}
.section-buy .txt-info{
    font-size: 19px;
    text-align: left;
    margin-left: 20px;
    
    
}
.J_currentPrice {
    color: red;
    font-size: 27px;
   
}
.price{
    text-align: left;
    margin-left: 20px;
    margin-top: 50px;
}
.text-buttom {
    display: block;
    width: 225px;
    height: 50px;
    border: 1px solid red;
    text-align: center;
    line-height: 50px;
    margin: 20px auto;
}
.note{
    width: 1226px;
    font-size: 12px;
    line-height: 1.5;
    text-align: left;
    color: #ccc;
    margin-left: 330px;
    margin-top: 720px;
}
@keyframes up{
    0%{
        opacity: 0;
        transform: translate3d(0,0,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(0, -20px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(0,-40px,0);
            }
    
}
@keyframes up2{
    0%{
        opacity: 0;
        transform: translate3d(0,0,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(3px, -62px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(3px, -112px, 0);
            }
    
}
@keyframes up3{
    0%{
        opacity: 0;
        transform: translate3d(0,-20,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(3px, -72px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(15px, -148px, 0);
            }
    
}
@keyframes up4{
    0%{
        opacity: 0;
        transform: translate3d(0,0,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(3px, -112px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(5px, -221px, 0);
            }
    
}
@keyframes up5{
    0%{
        opacity: 0;
        transform: translate3d(0,0,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(6px, -120px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(12px, -253px, 0);
            }
    
}
@keyframes up6{
    0%{
        opacity: 0;
        transform: translate3d(0,0,0);
    }
    50%{
        opacity: 0;
        transform: translate3d(5px, -120px, 0);

    }
    100%{ opacity: 1;
        transform: translate3d(15px, -249px, 0);
            }
    
}
@keyframes all{
    0% {
    opacity: 1;
    }
    /* 50%{
        opacity: 1;
    }
    75%{
        opacity: .3;
    } */
    100% {
    opacity: 0;
   
    }
}
.section-bg2{
    width: 1054px;
    height: 549px;
    margin-top: 20px;
    margin:150px auto;
    background-color: blueviolet;
    background: url(${base}/static/images/kun/ku/laptop/bg-processors2.jpg);
    background-size: cover;
}
.section-bg2-in{
    display: block;
    float: left;
    width: 717px;
    height: 405px;
   margin-top:40px;
   margin-left: 170px;
   

}
	
.section-bg{
    width: 1054px;
    height: 549px;
    margin-top: 20px;
    margin:0 auto;
    background-color: blueviolet;
    background: url(${base}/static/images/kun/ku/laptop/bg-processors2.jpg);
    background-size: cover;
}
.section-bg-in{
    display: block;
    float: left;
    width: 717px;
    height: 405px;
   margin-top:40px;
   margin-left: 170px;


}
.Controls1{
    color: #424242;
    border-color: #424242;
    border-bottom: 2px solid #b0b0b0;
        line-height: 50px;
        width: 150px;
        height: 50px;
        float: left;
        text-align: center;
        margin-left: -190px;
        margin-top: 160px;
        /* background-color:red; */
        text-indent:0;
    }

.Controls2{
    color: #424242;
    border-color: #424242;
    border-bottom: 2px solid #b0b0b0;
    line-height: 50px;
    width: 150px;
    height: 50px;
     float: left;
    text-align: center;
    text-indent:0;
    margin-left: -55px;
    margin-top: 160px;
    /* background-color:rgb(255, 255, 255); */
}
.Controls3{
    text-align: center;
    border-bottom: 2px solid #b0b0b0;
    line-height: 50px;
    color: #424242;
   
    width: 150px;
    height: 50px;
     float: left;
    text-align: center;
    margin-left: 80px;
    margin-top: 160px;
    /* background-color:red; */
    text-indent:0;
}

.Controls3:hover,.Controls2:hover,.Controls1:hover{
    
    border-bottom: 2px solid #000;
            color: #000;
            border-color: #424242;


}
.section-game .context{
    height: 200px;
}
       
    
    
    </style>
</head>

<body>
    <div class="main">

        <div class="section-top">
            <!-- <div class="section-top-img"></div> -->
            <div class="context-top context ">
                <h1 class="webfont txt-title-top col-000 top-context">小米笔记本Pro <span style="color: red">15.6″</span></h1>
                <h5 class="webfont txt-info-top  col-000">更强悍的专业笔记本</h5>
                <span class="J_currentPrice col-000" >
                    <i class="price-num num  col-000" style="font-size: 40px">5599</i>元起</span>
            </div>
               


        </div>

        <div class="section-feature">
              
          

             <div class="sestion-clearfix">
                    <div class="bt11">
                        <div class="web-titile">全新第八代</div>
                        <div class="web-txt-info">英特尔<sup>®</sup>酷睿™处理器</div> 
                    </div>
                    <div class="bt1">
                        <div class="web-titile">全新高性能独显</div>
                        <div class="web-txt-info">NVIDIA GeForce<sup>®</sup> MX150</div> 
                    </div>
                    <div class="bt1">
                        <div class="web-titile">双通道大内存</div>
                        <div class="web-txt-info">2400MHz DDR4</div> 
                    </div>
                    <div class="bt2">
                        <div class="web-titile">全尺寸背光键盘</div>
                        <div class="web-txt-info">19.5mm大键距</div> 
                    </div>
                    <div class="bt">
                         <div class="web-titile">全金属强化机身</div>
                        <div class="web-txt-info">镁合金骨架</div> 
                    </div>
                    <div class="bt">
                        <div class="web-titile">大满贯接口</div>
                        <div class="web-txt-info">主流接口多达7个</div> 
                     </div>
            </div>
        </div>


        <div class="section-perfor">
         <video src="${base}/static/images/kun/ku/laptop/d0a0c77b70caf6bebd26bfe040becfe9.mp4" style="width: 100%; height: 100%; object-fit: fill; " muted autoplay loop="loop"></video>

        
         <div class="context perfor-context">

            <h3 class="webfont txt-title col-fff">强大性能，为更专业的创造力而生</h3>
             <a href="javascript:;" class="btn-play J_play"><img src="${base}/static/images/kun/ku/laptop/icon-play.png" alt=""></a>
        </div>
     
        </div>

        <div class="section-process">
                <div class="context">
                        <h2 class="webfont txt-title col-000">第八代英特尔酷睿处理器<br>无锁4核8线程，性能提升40%</h2>
                        <p class="des txt-info col-000 ">最高配备第八代英特尔<sup>®</sup> 酷睿™ i7处理器 ，无锁4核8线程，最大频率达4.0GHz，性能较上一代提升40%。
                            <br>强大而高效的多任务处理能力，让你近乎实时地创建、编辑和共享图形渲染及视频内容。</p>
                        <div class="section-bg">
                            <div class="section-bg-in">
                                    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                            <!-- Indicators -->
                                            <ol class="carousel-indicators">
                                              <li data-target="#carousel-example-generic" data-slide-to="0" class="active"><div class="Controls1 slide-one">图像编辑</div></li>
                                              <li data-target="#carousel-example-generic" data-slide-to="1"><div class="Controls2 slide-two">视频编辑</div></li>
                                              <li data-target="#carousel-example-generic" data-slide-to="2"><div class="Controls3 slide-three">3D渲染</div></li>
                                            </ol>
                                          
                                            <!-- Wrapper for slides -->
                                            <div class="carousel-inner" role="listbox">
                                              <div class="item active">
                                                    <img src="${base}/static/images/kun/ku/laptop/img-pro01.jpg" alt="...">
                                                <div class="carousel-caption">
                                                
                                                </div>
                                              </div>
                                              <div class="item">
                                                    <img src="${base}/static/images/kun/ku/laptop/img-pro02.jpg" alt="...">
                                                <div class="carousel-caption">
                                                
                                                </div>
                                              </div>
                                              
                                              <div class="item">
                                                    <img src="${base}/static/images/kun/ku/laptop/img-pro03.jpg" alt="...">
                                                <div class="carousel-caption">
                                                 
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
                   
                    </div>

        </div>

        <div class="section-game">
                <div class="context">
                        <h2 class="webfont txt-title col-000">独立显卡 GeForce MX150<br>配合强劲散热系统，性能再提升32%</h2>
                        <p class="des txt-info col-000">配合强劲散热系统，比NVIDIA GeForce<sup>®</sup> MX150标称性能再提升32%。配备2GB GDDR5高速显存，<br>在1080p全高清画质下带来更逼真的场景渲染，更细腻的光影表现，更流畅的大场景游戏对战体验。</p>



                    </div>
<!-- 幻灯 -->
                    
            <div class="section-bg2">
                <div class="section-bg2-in">
                        <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <ol class="carousel-indicators">
                                  <li data-target="#carousel-example-generic" data-slide-to="0" class="active"><div class=" slide-one"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="1"><div class="slide-two"></div></li>
                                  <li data-target="#carousel-example-generic" data-slide-to="2"><div class=" slide-three"></div></li>
                                </ol>
                              
                                <!-- Wrapper for slides -->
                                <div class="carousel-inner" role="listbox">
                                  <div class="item active">
                                    <video src="${base}/static/images/kun/ku/laptop/aa6d6accd6b02a860e5a5c71e6db24e5.mp4" style="width: 717px ; height: 405px; object-fit: fill " autoplay loop muted poster="${base}/static/images/kun/ku/laptop/bg-game01.png" ></video>
                                    <div class="carousel-caption">
                                    
                                    </div>
                                  </div>
                                  <div class="item">
                                    <video src="${base}/static/images/kun/ku/laptop/155052d2392f95e31128debfaf1323d8.mp4" style="width: 717px ; height: 405px; object-fit: fill " poster="${base}/static/images/kun/ku/laptop/bg-game02.png" autoplay loop muted >
                                    <div class="carousel-caption">
                                    
                                    </div>
                                  </div>
                                  
                                  <div class="item">
                                    <video src="${base}/static/images/kun/ku/laptop/daded159e3a0c73b101d5feb9a6c8055.mp4" style="width: 717px ; height: 405px; object-fit: fill " poster="${base}/static/images/kun/ku/laptop/bg-game03.png" autoplay loop muted >
                                    <div class="carousel-caption">
                                     
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
                    

        </div>


        <div class="laptop">

            <div class="section section-system preload" >
                    <div class="context ">
                    <h3 class="webfont txt-title col-fff">全面加大散热系统<br>加大风量，高效降温</h3>
                    <p class="des txt-info col-fff ">大直径双风扇，大直径导热管，大面积导热片，高效散热降温</p>
                    </div>
                    <div class="wind-wrap">
                        <div class="left-wind">
                            <div class="wind lwind01"></div>
                            <div class="wind lwind02"></div>
                            <div class="wind lwind03"></div>
                            <div class="wind lwind04"></div>
                            <div class="wind lwind05"></div>
                            <div class="wind lwind06"></div>
                            <div class="wind lwind07"></div>
                            <div class="wind lwind08"></div>
                        </div>
                        <div class="right-wind">
                            <div class="wind rwind01"></div>
                            <div class="wind rwind02"></div>
                            <div class="wind rwind03"></div>
                            <div class="wind rwind04"></div>
                            <div class="wind rwind05"></div>
                            <div class="wind rwind06"></div>
                            <div class="wind rwind07"></div>
                            <div class="wind rwind08"></div>
                        </div>
                        <div class="wind-out"></div>
                    </div>
                    <div class="container laptop-container">
                        <ul class="clearfix">
                            <li class="li-left">
                                <h3 class="webfont txt-title col-fff">带宽提升80%<br>双通道大内存</h3>
                                <p class="des txt-info  col-fff">标配DDR4 2400MHz高规格内存，最高支持16GB。更有双通道设计，较单通道带宽提升80%。开启、运行大型文档和应用都更快。</p>
                            </li>
                            <li class="li-right">
                                <h3 class="webfont txt-title col-fff">至少快3倍<br>可扩展固态硬盘</h3>
                                <p class="des txt-info col-fff">256GB PCIe NVMe高速固态硬盘，采用更先进的PCIe x 4总线接口，将单个传输通道扩展为4通道，较SATA固态硬盘读写速度至少快3倍。预留SSD卡槽，任性扩展容量。</p>
                            </li>
                        </ul>
                    </div>
                    <div class="zhuban" id="zhuban">
                        <div class="ram01 box " id="ram01"></div>
                        <div class="ram02 box"></div>
                        <div class="card box"></div>
                        <div class="pan01 box"></div>
                    </div>
                </div>
    </div>
    

        <div class="section-screen ">
            <div class="section-screen-div">
                    <div class="context col-ffff">
                            <h2 class=" txt-title col-000">15.6" 全高清大屏<br>超窄边大视野</h2>
                            <ul>
                                <li>康宁<sup>®</sup>第三代大猩猩<sup>®</sup>玻璃<br>全贴合技术</li>
                                <li>6.52mm窄边框<br>81.5%屏占比</li>
                                <li>FHD全高清屏<br>72% NTSC 色域</li>
                            </ul>
                        </div> 

            </div>
            

        </div>

        <div class="section-keybord ">
            <video src="${base}/static/images/kun/ku/laptop/18fe8322c418852522ad1c2c762be92b.mp4" style="width: 100%; height: 100%; object-fit: fill; " muted autoplay loop="loop"></video>
            <div class="context perfor-context">

                    <h3 class="webfont txt-title col-fff">全尺寸键盘，和台式机一样的大键距</h3>
                     <a href="javascript:;" class="btn-play J_play"><img src="${base}/static/images/kun/ku/laptop/icon-play.png" alt=""></a>
                </div>

        </div>

        <div class="section-keybord-main">
                <div class="content">
                        <div class="pic-keyboard"><img src="${base}/static/images/kun/ku/laptop/keyboard01.png" alt=""></div>
                        <div class="pic-maskkeyboard"><img src="${base}/static/images/kun/ku/laptop/mask-keyboard.png" alt=""></div>
                        <div class="pos line01"></div>
                        <div class="pos line02"></div>
                        <div class="pos line03"></div>
                        <div class="pos-text01">
                            <h4 class="webfont web-titile">19.5mm防误触大键距</h4>
                            <p class="des web-txt-info">键距太长打字慢，键距太短容易误打。我们做到了和<br>台式机一样的19.5mm键距标准，更适合深度用户使用。</p>
                        </div>
                        <div class="pos-text02">
                            <h4 class="webfont web-titile">保留更多功能键</h4>
                            <p class="des web-txt-info">更大的键盘面积，为编写代码、<br>编辑文字，保留了更多的全尺寸功能键。</p>
                        </div>
                    </div>


        </div>

        <div class="section-keycap">
                <div class="capleft">
                        <div class="layer1">
                            <div class="capl01"></div>
                            <div class="capl02"></div>
                            <div class="capl03"></div>
                        </div>
                        <div class="context capl-context">
                            <h4 class="webfont web-titile col-000">更贴合手指的双曲面键帽</h4>
                            <p class="des web-txt-info col-000">0.3mm常用键定制键帽弧度，<br>减少双手长时间敲击键盘带来的疲劳感。</p>
                        </div>
                    </div>
                <div class="capright">
                        <div class="capr04"></div>
                        <div class="capr05"></div>
                       <div class="line01"></div> 
                        <div class="text">1.5mm</div>
                        <div class="line02"></div>
                        <div class="context capr-context ">
                            <h4 class="webfont web-titile col-000">1.5mm舒适回弹高键程</h4>
                            <p class="des web-txt-info col-000">有限的空间里，做到1.5mm高键程，更好回弹，<br>为你找回最熟悉的确认感。</p>
                        </div>
                    </div>
        </div>

        <div class="section-touch">
            <div class="icon-touch">

            </div>
            <div class="context touch-context">
                    <h2 class="webfont web-titile col-000">指纹解锁触控板<br>2秒唤醒进入桌面</h2>
                    <p class="des web-txt-info col-000">一旦体验过便捷的指纹解锁，就无法再忍受繁琐的密码输入过程。我们采用更先进的静态按压式指纹解锁，轻轻一按，<br>快速唤醒进入桌面。同时，通过识别指纹，不需要在服务器上储存密码，就能安全登录应用、网站，让个人信息加倍安全。</p>
                </div>
        </div>

        <div class="section-body">
                <div class="context body-context">
                        <h3 class="webfont txt-title col-000">抗压全金属强化机身<br>镁合金骨架，刚性提升2倍</h3>
                        <p class="des txt-info col-000">全金属机身，铝合金板材厚度提升25%。再增加镁合金金属骨架，刚性提升2倍。强硬的机身结构设计，<br>带来可靠耐用的表现，让日常使用无后顾之忧。</p>
                        <a href="javascript:;" class="J_play btn-video col-000"  >小米笔记本Pro机身暴力测试 <span class="small-play"></span></a>
                    </div>
                <div class="layer-wrap">
                        <div class="layer layer06"></div>
                        <div class="layer layer05"></div>
                        <div class="layer layer04"></div>
                        <div class="layer layer03"></div>
                        <div class="layer layer02"></div>
                        <div class="layer layer01"></div>
                        <div class="layer layerall"></div>
                        <div class="layer layermask"></div>
                    </div>

        </div>

        <div class="section-interface">
                <div class="context">
                        <h2 class="webfont txt-title col-000">大满贯接口<br>7大接口，满足全场景所需</h2>
                        <p class="des txt-info col-000">小米笔记本 Pro，接口丰富多达7个，配合小米多功能转接器，可扩展USB接口、HDMI接口、VGA接口、<br>Mini DP接口以及千兆网口等。出色的扩展能力，便捷的传输功能，让灵感随时共享。</p>
                        <a class="link col-000" >了解更多转接器 ></a>
                    </div>
                    

        </div>

        <div class="section-sound">
                <div class="context sound-context">
                        <h2 class="webfont txt-title">哈曼Infinity定制扬声器<br>配备杜比全景声影院级音效</h2>
                        <p class="des txt-info">全新升级的哈曼Infinity<sup>®</sup>定制扬声器，更大的腔体设计，带来更深的低频下潜<br>与细腻的高频表现 。戴上耳机，杜比<sup>®</sup>全景声为你带来影院级音效，看电影、<br>听音乐、或是进行专业的混音编曲，都能拥有身临其境的沉浸式体验。</p>
                        <div class="logo"><img src="${base}/static/images/kun/ku/laptop/icon-logo.png" alt=""></div>
                    </div>

        </div>

        <div class="section-expirence">
            
                <h2 class="webfont txt-title section-expirence-title" style="text-align: center">更多专业体验</h2>
                <div class="sestion-clearfix">
                        <div class="bt11">
                            <div class="web-titile">精准触控板</div>
                            <div class="web-txt-info">多手势操控</div> 
                        </div>
                        <div class="bt1">
                            <div class="web-titile">双天线 ac WiFi</div>
                            <div class="web-txt-info">抗干扰更稳定</div> 
                        </div>
                        <div class="bt1">
                            <div class="web-titile">全功能USB-C接口</div>
                            <div class="web-txt-info">支持充电、数据传输、视频输出</div> 
                        </div>
                        <div class="bt2">
                            <div class="web-titile">60Whr大电量</div>
                            <div class="web-txt-info">本地视频播放9小时</div> 
                        </div>
                        <div class="bt">
                             <div class="web-titile">1C快充</div>
                            <div class="web-txt-info">35分钟充电50%</div> 
                        </div>
                        <div class="bt">
                            <div class="web-titile">超轻便电源</div>
                            <div class="web-txt-info">支持18W手机快充</div> 
                         </div>
                </div>

        </div>

        <div class="section-buy">
                <h2 class="webfont txt-title " style="text-align:center">高性能的专业笔记本<br>挑选一个适合你的版本</h2>
                <ul class="type-list clearfix">
                        <li class="group">
                            <div class="context">
                                <h5 class="webfont txt-title ">i7处理器<br>16GB／256GB</h5>
                                <p class="des txt-info col-000">第八代英特尔<sup>®</sup> 酷睿™ i7-8550U<br>NVIDIA GeForce<sup>®</sup> MX150 独立显卡<br>2GB GDDR5显存<br>16GB DDR4 双通道内存 <br>256G PCIe SSD<br>支持M.2 SATA固态硬盘扩展<br>指纹解锁</p>
                                <div class="price ">
                                    <span class="J_currentPrice"><i class="pnum num">6799</i>元</span>
                                    <del class="J_originalPrice  col-000"><i class="num">6999</i>元</del>
                                </div>
                               
                                <a class="text-buttom " style="color:red;" href="${base}/qiqi/page">立即购买</a>
                            </div>
                        </li>
                        <li class="group">
                            <div class="context">
                                <h5 class="webfont txt-title col-000">i7处理器<br>8GB／256GB</h5>
                                <p class="des txt-info col-000">第八代英特尔<sup>®</sup> 酷睿™ i7-8550U<br>NVIDIA GeForce<sup>®</sup> MX150 独立显卡<br>2GB GDDR5 显存<br>8GB DDR4 双通道内存<br>256G PCIe SSD<br>支持M.2 SATA固态硬盘扩展<br>指纹解锁</p>
                                <div class="price " >
                                    <span class="J_currentPrice"><i class="pnum num">6399</i>元</span>
                                    <del class="J_originalPrice hide  col-000"><i class="num"></i>元</del>
                                </div>
                                <a class="text-buttom " style="color:red;" href="${base}/qiqi/page">立即购买</a>
                                     </div>
                        </li>
                        <li class="group">
                            <div class="context">
                                <h5 class="webfont txt-title col-000">i5处理器<br>8GB／256GB</h5>
                                <p class="des txt-info col-000">第八代英特尔<sup>®</sup> 酷睿™ i5-8250U<br>NVIDIA GeForce<sup>®</sup> MX150 独立显卡<br>2GB GDDR5显存<br>8GB DDR4 双通道内存<br>256G PCIe SSD<br>支持M.2 SATA固态硬盘扩展<br>指纹解锁</p>
        
                                <div class="price " >
                                    <span class="J_currentPrice"><i class="pnum num">5399</i>元</span>
                                    <del class="J_originalPrice  col-000"><i class="num">5599</i>元</del>
                                </div>
                                <a class="text-buttom " style="color:red;" href="${base}/qiqi/page">立即购买</a>  
                                                  
                            </div>
                        </li>

                    </ul>
                    <p class="note">数据说明：配合小米系列多功能转接器使用，实现接口大满贯。 无锁4核8线程指CPU设定的温度保护点与芯片自身硬件降频温度保护点一致，并且不会对机器硬件及性能产生影响 。 显卡跑分测试数据来自小米实验室，基于i7处理器 + MX150显卡产品配置，采用3DMark 11 P 进行跑分测试，与MX150标称性能进行对比。 NVMe技术可带来随机读写效率、低功耗等多方面的性能提升，附上参考文章http://www.expreview.com/42142.html。 SSD传输速度数据来自小米实验室。 主板示意图为小米笔记本Pro i7/16GB版本，具体以实物为准。 机身测试在专业工程师指导下拍摄, 请勿模仿。 802.11ac 2X2的双天线支持同时工作，对比 802.11ac 1X1 两个天线轮替工作，下载速度提升一倍。 电池寿命因不同因素而异，包括产品型号、配置、加载的应用、功能、使用情况、无线功能及电源管理设置，使用一段时间后，电池的最大容量将有所下降。 指纹识别解锁速度基于小米实验室测试结果，测试产品配置为i7处理器16GB内存。 板材厚度对比小米笔记本Air 13.3"提升25%。镁合金骨架对比塑胶骨架刚性提升2倍。 电池续航测试数据来自小米实验室，本地视频1080p分辨率下持续播放时间约9小时。1C 快充技术 相比一般 0.7C 快充技术，充电效率快30%；关机或者休眠情况下使用自带电源充电，从0至50%电量需35分钟。 18W手机快充需要手机本身支持相应功能。本页中提及的内存容量、尺寸厚度重量、屏幕开合角度等数据均为理论值，实测中存在合理误差。</p>
        </div>
</div>
</body>
<script src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/highlight.js/8.5/highlight.min.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${base}/static/js/kun/jquery.aniview.min.js"></script>
<script type="text/javascript" src="${base}/static/js/kun/jquery.flexslider-min.js"></script>

<script>
    var a=$(window).scrollTop();
           
//显示区域
    $(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height >= 5214) {
                    $(".ram01,.ram02,.card,.pan01").addClass("ram01ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 8120) {
                    $(".capr04").addClass("capr04ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 8120) {
                    $(".capl01,.capl02,.capl03").addClass("capl01ani");
                }
})
//图标
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 8600) {
                    $(".icon-touch").addClass("ram01ani");
                }
})
//笔记本分离
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer06").addClass("layer06ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer05").addClass("layer05ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer04").addClass("layer04ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer03").addClass("layer03ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer02").addClass("layer02ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layer01").addClass("layer01ani");
                }
})
    $(window).scroll(function () {
                 var height = $(window).scrollTop();
                if (height >= 10044) {
                    $(".layerall").addClass("layerallani");
                }
})
//
//文字出现效果
// $(document).ready(function(){
//         var i={animateThreshold:100};
//         $(".aniview").AniView(i),
//         $(".code").each(function(i,e){hljs.highlightBlock(e)})});

$(document).ready(function(){
			$('.flexslider').flexslider({
				directionNav: true,
				pauseOnAction: false
			});
        });
    //滑动到特定图
             $(".slide-one").click(function(){
                $("#carousel-example-generic").carousel(0);
            });
            $(".slide-two").click(function(){
                $("#carousel-example-generic").carousel(1);
            });
            $(".slide-three").click(function(){
                $("#carousel-example-generic").carousel(2);
            });
</script>
</html>