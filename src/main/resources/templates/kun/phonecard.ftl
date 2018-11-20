<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<style>
.body{
    font: 14px/1.5 "Helvetica Neue",Helvetica,Arial,"Microsoft Yahei","Hiragino Sans GB","Heiti SC","WenQuanYi Micro Hei",sans-serif;
    color: #333;
    background-color: #fff;
    min-width: 1226px;
    margin: 0;
}
.micard-banner{
    width: 100%;
    height: 652px;
    background: url(${base}/static/images/kun/ku/phonecard/banner_bg.jpg);
    background-position: center center;
    background-repeat: no-repeat;
}
.micard-full{
    width: 100%;
    height: 940px;
  
    margin-top: -20px;
}
.micard-lot{
    width:100%;
    height: 816px;
    background: url(${base}/static/images/kun/ku/phonecard/cardSlot_bg.jpg);
    background-position: center center;
    background-repeat: no-repeat;
}
.micard-wander{
    height: 724px;
    width: 100%;    
    background: url(${base}/static/images/kun/ku/phonecard/wander_bg.jpg);
    background-position: center center;
    background-repeat: no-repeat;
    }
.micard-business{
    width: 100%;
    height: 671.73px;
    background-color:rgb(229, 229, 229);
}
.micard-cut{
    width: 100%;
    height: 696px;
    background: url(${base}/static/images/kun/ku/phonecard/cutCard_bg.jpg);
    background-position: center center;
    background-repeat: no-repeat;
}
.micard-mobile{
    width: 100%;
    height: 694px;
    background-color: rgb(245, 245, 245);
}
.micard-foot{
    width: 1690px;
    height: 143px;
    background: url(${base}/static/images/kun/ku/phonecard/foot1.jpg);
    }
.banner-container{
    width: 1241px;
    height: 443px;
    margin: 0 auto;
   
}
.full-container{
    height: 890px;
    width: 1241px;
    margin: 0 auto;
   
}
.mobile-left{
    width: 612px;
    height: 578px;
    background-color: rgb(255, 255, 255);
    float: left;
    margin-left: 300px;
    margin-top: 70px;
}
.mobile-right{
    width: 612px;
    height: 578px;
    background-color: rgb(255, 255, 255);
    float: right;
    margin-right: 300px;
    margin-top: 70px;
}
.text{
    width: 1091px;
    height: 273px;
  
    padding-top: 50px;
}
.text-title{
    margin:60px 0px 25px 132px;
    font-size: 60px;
    font-family: 'F64bde';
    color: #fff;
    font-weight: normal;
}
.text-webfont{
    margin: 0 0 0 106px;
    font-size: 26px;
    font-family: 'Fa4d09';
    color: #fff;
}
.text-buttom{
    display: block;
    width: 225px;
    height: 50px;
    margin:80px 3px 10px 124px;
    line-height: 50px;
    background-color: #ffdd44;
    text-align: center;
    color: #ff6709;
    font-family: 'F64bde';
    font-size: 16px;
}
.full-container-text{
    width: 100%;
    height: 100px;
    text-align: center;

}
.full-container-title{
    width: 1240px;
    height: 60px;
    text-align: center;
    font-family: 'F64bde';
    margin-bottom: 0;
    font-size: 42px;
    color: #454545;
    font-weight: bolder;
    line-height: 60px;
    padding-top: 100px;
   
    
}
.full-container-webfont{
    width: 1240px;
    height: 24px;
    margin-top: 0;
    font-size: 16px;
    color: #757575;
    margin: 1em 0;
    text-align: center;
}
.lot-text{
    width: 1241px;
    height: 372.46px;
    margin: 0 auto;

}
.lot-title{
    width:372px;
    height: 120px;
    text-align:left;
    color: black;
    display: block;
    font-size: 44px;
    font-weight: normal;
    padding-top: 150px;
    float: right;
    line-height: 80px;
    padding-right: 50px;
    }
.lot-webfont{
    width: 372px;
    height: 48px;
    text-align: left;
    color:black;
    line-height: 25px;
    display: block;
    font-size: 15px;
    padding-right: 50px;
    float: right;
    padding-top: 335px;
    margin-right: -420px;

    }
.wander-text{
    width: 1859px;
    height: 250px;
}
.wander-title{
    width:1859px;
    height: 151.48px;
    text-align: center;
    color: white;
    line-height: 70px;
    display: block;
    font-size: 43px;
    padding-top: 90px;
}
.wander-webfont{
    width: 1859px;
    height: 23px;
    text-align: center;
    color:white;
    line-height: 25px;
    display: block;
    font-size: 18px;
    margin-top: 0px;
}
.business-img{
    width: 500px;
    height: 594px;
    float: right;
    margin-top: -282px;
    padding-right: 420px;
  
}
.business-text{
    width: 360px;
    height: 360px;
}
.business-title{
    width:400px;
    height: 151.48px;
    text-align: left;
    color: black;
    line-height: 70px;
    display: block;
    font-size: 43px;
    padding-top: 230px;
    padding-left: 360px;
}
.business-webfont{
    width: 400px;
    height: 23px;
    text-align: left;
    color:black;
    line-height: 30px;
    display: block;
    font-size: 16px;
    margin-top: 0px;
    padding-left: 360px;
}
.cut-text{
    width: 360px;
    height: 360px;
}
.cut-title{
    width:400px;
    height: 151.48px;
    text-align: left;
    color: white;
    line-height: 60px;
    display: block;
    font-size: 43px;
    padding-top: 180px;
    padding-left: 1070px;
}
.cut-webfont{
    width: 400px;
    height: 23px;
    text-align: left;
    color:white;
    line-height: 30px;
    display: block;
    font-size: 17px;
    margin-top: 25px;
    padding-left: 1070px;
}
.mobile-left-img{
    width: 437px;
    height: 274px;
    background: url(${base}/static/images/kun/ku/phonecard/cms_14901656975961_euUyK.jpg)no-repeat;
    background-size: cover;
    margin-top: 60px;
    margin-left: 90px;
}
.mobile-right-img{
    width: 437px;
    height: 274px;
    background: url(${base}/static/images/kun/ku/phonecard/cms_14901657081676_crHLJ.jpg)no-repeat;
    background-size: cover;
    margin-top: 60px;
    margin-left: 90px;
}
.mobile-left-text{
    width: 611px;
    height: 48px;
    text-align: center;
    font-size: 16px;
    color: #454545;
    margin-top: 30px;
    
}
.mobile-right-text{
    width: 611px;
    height: 48px;
    text-align: center;
    font-size: 16px;
    color: #454545;
    margin-top: 30px;
    
}
.mobile-left-buttom{
    display: block;
    width: 210px;
    height: 55px;
    margin: 30px auto;
    font-weight: bold;
    line-height: 55px;
    border: none;
    background-color: #ff6709;
    color: white;
    text-align: center;
    font-size: 16px;
}
.mobile-right-buttom{
    display: block;
    width: 210px;
    height: 55px;
    margin: 30px auto;
    font-weight: bold;
    line-height: 55px;
    border: none;
    background-color: #ff6709;
    color: white;
    text-align: center;
    font-size: 16px;

}
.full-container-table{
    width: 1121px;
    height: 352px;
    margin-left: 30px;
    margin-top: 130px;
    
}
.full-container-table table,td{

	
    border-collapse: collapse;
    border:1px solid #dadada;
    text-align: center;       
}
.full-container-text2{
    width: 1121px;
    height: 280px;
    margin: 0 auto;
    margin-top: 40px;
}
</style>
<body>
    <div class="body">
        <div class="micard-banner">
            <div class="banner-container">
                    <div class="text">
                            <h1 class="text-title">米粉卡日租卡</h1>
                            <p class="text-webfont">「1元日租卡」每天800M，流量刚刚好</p>
                            <p class="text-webfont">「不限量日租卡」3元不限量，真正吃到饱</p>
                            <a href="//mall.10046.mi.com/fanscard/index" class="text-buttom">立即体验</a>
                        </div>

            </div>

        </div>
        <div class="micard-full">
            <div class="full-container">
                <div class="full-container-text">
                                <h1 class="full-container-title">米粉卡，真正吃到饱</h1>
                                <p class="full-container-webfont">3元不限量，不用不花钱。1元800M，流量刚刚好。</p>
                               
                    
                </div>
            <div class="full-container-table">
                    <table class="full-container-table">
                            <tr style="background-color: rgb(229, 229, 229)" class="table-head">
                                <td  rowspan="2">套餐名称</td>
                                <td style="width: 200px;" rowspan="2">月费</td>
                                <td  colspan="6">套餐资费</td>
                            </tr>
                            <tr  style="background-color: rgb(229, 229, 229)"class="table-head">
                                <td>国内 <br>流量</td>
                                <td>国内 <br>拨打</td>
                                <td>国内 <br>短/彩信</td>
                                <td>国内 <br>接听</td>
                                <td>来电 <br>显示</td>
                            </tr>
                            <tr class="table-body">
                                <td>1元 <br>日租卡</td>
                                <td>5元</td>
                                <td>1元 / 天<br>800M</td>
                                <td rowspan="2">0.1元 / 分钟</td>
                                <td rowspan="2">0.1元 / 条</td>
                                <td rowspan="2">免费</td>
                                <td rowspan="2">免费</td>
                            </tr>
                            <tr class="table-body">
                                <td>不限量 <br>日租卡</td>
                                <td>5元</td>
                                <td>3元 / 天<br>不限量</td>
    
                            </tr>
                    </table>


            </div>
                   
                <div class="full-container-text2">
                        <p class="font-bold">1元日租卡：</p>
                        <p>按照1元包800M/日收取，流量为国内流量，当天未产生流量不收费，流量当日有效不可结转次日使用。当月累计的总流量达到40GB则暂停当月上网服务，次月初自动开通；如果客户当月申请继续使用，则继续提供服务，按照套餐资费提供服务。</p>
                        <p class="font-bold">3元不限量日租卡：</p>
                        <p>按照3元/日收取，全国流量不限量。当天未产生省内流量不收费。流量当日有效不可结转次日使用。当月累计的总流量达到20GB后，上网速率降至1M，次月恢复4G上网速率。</p>
                        <p class="font-bold">【温馨提示】：</p>
                        <p>1、收到货后请及时进行激活操作，激活有效期为发货后20天内，逾期未激活号码将自动销户。新疆、西藏用户在订购之后，需持本人身份证、电话卡到号码归属地营业厅激活；<br>
                            2、本套餐仅支持二代居民身份证办理入网，军人、保密单位等在国政通系统中无数据用户，无法办理入网，敬请谅解；<br>
                            3、米粉卡3元省内不限量老用户于2018年7月1日自动升级为米粉卡3元全国不限量；<br>
                            4、米粉卡3元省内不限量：当月手机上网流量累计达到40GB后，上网速率降至3.1Mbps以下，当月累计达到100GB后，上网速率降至128Kbps，次月恢复4G上网速率。<br>
                          5、米粉卡3元全国版：当月累计的总流量达到20GB后，上网速率降至1Mbps，次月恢复。</p>


                </div>

            </div>

        </div>
        <div class="micard-lot">
                <div class="lot-text">
                    <div class="lot-title">不用换卡<br>第二卡槽神器 </div>
                    <div class="lot-webfont"> 你的移动Wi-Fi，不论是小米笔记本外出办公，还是游玩流量分享，米粉卡给你的流量更多更满足。</div>

                </div>

        </div>
        <div class="micard-wander">
            <div class="wander-text">
                <div class="wander-title">海量号码覆盖全国<br>全国无漫游 </div>
                <div class="wander-webfont"> 给全国小米用户的米粉卡，在海量的号码中找到心仪的它。长市漫一个价， <br>
                    国内接听免费，畅听国内任何城市。</div>

            </div>
            

        </div>
        <div class="micard-business">
            <div class="business-text">
                <div class="business-title">所有业务 <br>网上搞定</div>
                <div class="business-webfont"> 无论是简单的话费查询、话费充值，还是复杂的 <br>
                    挂失补卡、业务变更，下载电信营业厅App一步 <br>
                    轻松搞定。<br>
                    ＊如有业务咨询问题，请关注微信公众号“米粉卡社区”</div>
            </div>
            <div class="business-img">
                <img src="../images/phonecard/business_img.png" alt="">

            </div>

        </div>
        <div class="micard-cut">
                <div class="cut-text">
                        <div class="cut-title">适用于所有手机  <br>不需要再剪卡</div>
                        <div class="cut-webfont"> 一张SIM卡涵盖3种尺寸，标准SIM卡、Micro-SIM、nano－SIM卡，不管你用的是小米手机、iPhone还是其他手机，全部都无需剪卡！
                            
                        </div>
                    </div>

        </div>
        <div class="micard-mobile">
            <div class="mobile-left">
                <div class="mobile-left-img"></div>
                <div class="mobile-left-text">全国大流量套餐，全国打电话0.1元/分钟<br>联通网络 / 电信网络</div>
                <div class="mobile-left-buttom"><a href="JavaScript"></a>立即办卡 </div>
                
            </div>
            <div class="mobile-right">
                <div class="mobile-right-img"></div>
                <div class="mobile-right-text">真正0月租，全国打电话0.1元/分钟，预存50元起<br>联通网络</div>
                <div class="mobile-right-buttom"><a  href="javascript"></a> 立即办卡</div>

            </div>
        </div>
        <div class="micard-foot">

        </div>

    </div>

</body>
</html>