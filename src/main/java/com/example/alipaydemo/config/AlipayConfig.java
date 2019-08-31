package com.example.alipaydemo.config;

/**
 * @Classname AlipayController
 * @Description notify_url 和 return_url 需要外网可以访问，建议natapp 内网穿透
 * @Date 2019/3/21 20:40
 * @Created by 爆裂无球
 */
public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101300680425";//在后台获取（必须配置）

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8090/pay/dealNo";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8090/pay/dealRe";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//注意：沙箱测试环境，正式环境为：https://openapi.alipay.com/gateway.do
}
