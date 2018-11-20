<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>填写订单信息</title>
    <link rel="stylesheet" href="${base}/static/css/laptop/settlement.css">
</head>

<body>
    <div class="page-main">
        <div class="container">
            <div class="checkout-box">
                <div class="section section-address">
                    <div class="section-header clearfix">
                        <h3 class="title">收货地址</h3>
                        <div class="more">
                        </div>
                        <div class="mitv-tips hide" style="margin-left: 0;border: none;" id="J_bigproPostTip"></div>


                    </div>
                    <div class="section-body clearfix" id="J_addressList">
                        <div class="address-item address-item-new" id="J_newAddress">
                            <i class="iconfont">+</i>
                            添加新地址
                        </div>
                    </div>
                </div>


                <div class="section section-options section-shipment clearfix ">
                    <div class="section-header">
                        <h3 class="title">配送方式</h3>
                    </div>
                    <div class="section-body clearfix">
                        <ul class="clearfix J_optionList options a1">
                            <li data-type="shipment" class="J_option selected a1" data-amount="0" data-value="2">
                                包邮 </li>
                        </ul>

                        <div class="service-self-tip" id="J_serviceSelfTip"></div>
                    </div>
                </div>

                <div class="section section-options section-time clearfix">
                    <div class="section-header">
                        <h3 class="title">配送时间</h3>
                    </div>
                    <div class="section-body clearfix">
                        <ul class="J_optionList options options-list clearfix">
                            <!-- besttime start -->
                            <li data-type="time" class="J_option selected" data-value="1">
                                不限送货时间：
                                <span>周一至周日</span>
                            </li>
                            <li data-type="time" class="J_option " data-value="2">
                                工作日送货：
                                <span>周一至周五</span>
                            </li>
                            <li data-type="time" class="J_option " data-value="3">
                                双休日、假日送货：
                                <span>周六至周日</span>
                            </li>
                            <!-- besttime end -->
                        </ul>
                    </div>
                </div>

                <div class="section section-options section-invoice clearfix">
                    <div class="section-header">
                        <h3 class="title">发票</h3>
                    </div>
                    <div class="section-body clearfix">
                        <div class="invoice-result">
                            <span>电子发票</span>
                            <span>个人</span>
                            <span>商品明细</span>
                            <a href="javascript:;" data-toggle="modal" id="J_invoiceModify">修改 &gt;</a>
                        </div>
                    </div>
                </div>

                <div class="section section-goods">
                    <div class="section-header clearfix">
                        <h3 class="title">商品及优惠券</h3>
                        <div class="more">
                            <a href="//static.mi.com/cart/">返回购物车
                                <i class="iconfont">></i>
                            </a>
                        </div>
                    </div>
                    <div class="section-body">
                        <ul class="goods-list" id="J_goodsList">
                            <li class="clearfix">
                                <div class="col col-img">
                                    <img src="${base}/static/images/laptop/pms_1505897592.73836006!30x30.jpg" width="30" height="30">
                                </div>
                                <div class="col col-name">
                                    <a href="" target="_blank">
                                        15.6"小米笔记本Pro i5 8G MX150 深空灰 </a>

                                </div>
                                <div class="col col-price">
                                    5599元 x 1 </div>
                                <div class="col col-status">
                                    &nbsp;
                                </div>
                                <div class="col col-total">
                                    5599元
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>

                <div class="section section-count clearfix">
                    <div class="count-actions">
                        <!-- 优惠券 -->
                        <div class="coupon-trigger" id="J_useCoupon">
                            <i class="iconfont icon-plus">+</i>使用优惠券</div>
                        <!-- 购物卡 -->
                        <div class="ecard-trigger" id="J_useEcard">
                            <i class="iconfont icon-plus">+</i>使用小米礼品卡</div>

                    </div>
                    <div class="money-box" id="J_moneyBox">
                        <ul>
                            <li class="clearfix">
                                <label>商品件数：</label>
                                <span class="val">1件</span>
                            </li>
                            <li class="clearfix">
                                <label>商品总价：</label>
                                <span class="val">5599元</span>
                            </li>
                            <li class="clearfix">
                                <label>活动优惠：</label>
                                <span class="val">-0元</span>
                            </li>
                            <li class="clearfix">
                                <label>优惠券抵扣：</label>
                                <span class="val">-0元</span>
                            </li>

                            <li class="clearfix">
                                <label>运费：</label>
                                <span class="val">
                                    <i data-id="J_postageVal">0</i>元</span>
                            </li>
                            <li class="clearfix total-price">
                                <label>应付总额：</label>
                                <span class="val">
                                    <em data-id="J_totalPrice">5599</em>元</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>

        <div class="bar clearfix">
            <div class="mun">
                <a href="${base}/qiqi/carousel" class="" >去结算</a>
            </div>
        </div>
    </div>
    </div>
    </div>
</body>

</html>