<#assign base=request.contextPath />
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>我的购物车-小米商城</title>
    <link rel="stylesheet" href="${base}/static/css/laptop/shoppingcat.css">
    <link rel="stylesheet" href="${base}/static/css/laptop/iconfont.css">
</head>

<body>
    <div class="page-main">
        <div class="cartBox">
            <div class="cartBox-head">
                <ul>
                    <li class="col-check">
                        <i>
                            ✔
                        </i>
                        全选
                    </li>
                    <li class="col-img">&nbsp;</li>
                    <li class="col-name">商品名称</li>
                    <li class="col-price">单价</li>
                    <li class="col-num">数量</li>
                    <li class="col-total">小计</li>
                    <li class="col-action">操作</li>
                </ul>
            </div>
            <div class="item-box">
                <ul>
                    <li class="col-check">
                        <i>
                            ✔
                        </i>
                    </li>
                    <li class="col-img">
                        <img src="${base}/static/images/laptop/imagns/4/pms_1505897592.73836006!80x80.jpg" alt="">
                    </li>
                    <li class="col-name">
                        <a href="javascript:;"> 15.6"小米笔记本Pro i5 8G MX150 深空灰 </a>
                    </li>
                    <li class="col-price"> 5599元 </li>
                    <li class="col-num">
                        <div class="change-goods-num">
                            <a href="javascript:;" value="-" class="addBtn min">
                                <i>-</i>
                            </a>
                            <input type="text" value="1" class="join-money">
                            <a href="javascript:;" value="+" class="addBtn add">
                                <i>+</i>
                            </a>
                        </div>
                    </li>

                    <li class="col-total total">￥
                        <span class="allMoney" id="a1">5599</span>元
                    </li>

                    <li class="col-action">
                        <a href="">X</a>
                    </li>
                </ul>




            </div>

            <div class="raise-buy-box">
                <div class="item">
                    <i>+</i>
                    加94元得便携鼠标 94元
                </div>
                <div class="item">
                    <i>+</i>
                    加189元得VGA转接器 189元
                </div>
            </div>

            <div class="cart-bar">
                <div class="section-left">
                    <a href="javascript:;" class="back-shopping">
                        继续购物
                        <span>
                            共
                            <i>1</i> 件商品，已选择
                            <i>1</i> 件
                        </span>
                    </a>

                </div>
                <div class="section-right">
                    <span class="total-price">
                        合计：
                        <em class="allMoney1 " id="a2">5599</em>元
                    </span>
                    <a href="${base}/qiqi/settlement" class="btn1 but">去结算</a>
                </div>
            </div>
        </div>
        <div style="height: 40px;"></div>
        <div class="buy-succ-recommend container xm-carousel-container">
            <h2 class="xm-recommend-title">
                <span>
                    买购物车中商品的人还买了
                </span>
            </h2>
            <div class="xm-recommend">
                <div class="xm-carousel-wrapper" style="height: 640px; overflow: hidden;">
                    <ul class="xm-carousel-col-5-list xm-carousel-list clearfix" id="moveDiv">
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1525231442.13261362!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 13.3"小米笔记本Air 四核i5 8G 256G MX150 深空灰 </a>
                                </dd>
                                <dd class="xm-recommend-price font">5199元</dd>
                                <dd class="xm-recommend-tips font">
                                    4280人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1522050377.16658998!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米游戏本15.6"i7 16G 1T+256G 1060 6G </a>
                                </dd>
                                <dd class="xm-recommend-price font">8999元</dd>
                                <dd class="xm-recommend-tips font">
                                    360人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1490595812.95661863!140x140.png" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米无线鼠标 </a>
                                </dd>
                                <dd class="xm-recommend-price font">64元</dd>
                                <dd class="xm-recommend-tips font">
                                    9702人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1527492271.56333477!140x140.png" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米无线鼠标青春版 </a>
                                </dd>
                                <dd class="xm-recommend-price font">49元</dd>
                                <dd class="xm-recommend-tips font">
                                    243人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1514387870.88251945!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 12.5"小米笔记本Air M3 4G 128G 银色 </a>
                                </dd>
                                <dd class="xm-recommend-price font">3599元</dd>
                                <dd class="xm-recommend-tips font">
                                    436人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1505401464.03824312!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米MIX2 全网通版 6GB内存 黑色陶瓷 64GB </a>
                                </dd>
                                <dd class="xm-recommend-price font">2599元</dd>
                                <dd class="xm-recommend-tips font">
                                    1.5万人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1486535951.58962915!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米简约头层小牛皮钱包 </a>
                                </dd>
                                <dd class="xm-recommend-price font">129元</dd>
                                <dd class="xm-recommend-tips font">
                                    1.1万人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1491365468.1786002!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米蓝牙触控语音遥控器 </a>
                                </dd>
                                <dd class="xm-recommend-price font">99元</dd>
                                <dd class="xm-recommend-tips font">
                                    1904人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1529842983.87383073!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 小米平板4 8英寸LTE版 4GB内存 </a>
                                </dd>
                                <dd class="xm-recommend-price font">1499元</dd>
                                <dd class="xm-recommend-tips font">
                                    <!-- 4280人好评 -->
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                        <li class="J_xm-recommend-list">
                            <dl>
                                <dt>
                                    <a href="javascript:;">
                                        <img src="${base}/static/images/laptop/imagns/Other/pms_1493907623.25151558!140x140.jpg" alt="">
                                    </a>
                                </dt>
                                <dd class="xm-recommend-name font ddwidth">
                                    <a href="javascript:;"> 红米4X 全网通版 4GB内存 </a>
                                </dd>
                                <dd class="xm-recommend-price font">1099元</dd>
                                <dd class="xm-recommend-tips font">
                                    8712人好评
                                    <a href="javascript:;" class="btn btn-line-primary btn-small">加入购物车</a>
                                </dd>
                            </dl>
                        </li>
                    </ul>
                </div>

            </div>
        </div>
    </div>
    <script src="${base}/static/js/jquery-2.1.1.min.js"></script>
    <script>
        $(function () {
            $("li").hover(function () {
                $(this).find('.btn').show();
            }, function () {
                $(this).find('.btn').hide();
            });
        })



        var t = $(".join-money");
        var m = $(".allMoney").text();
        var mm = $(".allMoney");
        var mmm = $(".allMoney1");
        function updateMoney() {
            var tt = t.val();
            var total = m * tt;   //输入框中的份额数与每份金额数相乘得到总金额
            mm.text(total);
            mmm.text(total);
            if (t.val() <= 0) {
                mm.text(m);
            }
            
            
        }
       
        $(function () {
            $(".add").click(function () {
                t.val(parseInt(t.val()) + 1); //点击加号输入框数值加1
                if (t.val() >= 2) {
                    t.val(parseInt(2)); //最小值为1
                }
                updateMoney();
            });
            $(".min").click(function () {
                t.val(parseInt(t.val()) - 1); //点击减号输入框数值减1
                if (t.val() <= 0) {
                    t.val(parseInt(t.val()) + 1); //最小值为1
                }
                updateMoney();
            });
            $(".join-money").keyup(function () {
                var c = $(this);
                if (/[^\d]/.test(c.val())) {//替换非数字字符
                    var amount = c.val().replace(/[^\d]/g, '');
                    $(this).val(amount);
                }
                updateMoney();  //手动输入数值金额随之改变
            });

        });

        //  $(function () {
        //     $("#a2").html(mm.text(total));
        //  });

    </script>
</body>

</html>