package qr.program.api.utils;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.Map;

/**
 * @author qr
 * @date 2022/4/28 11:24
 */
public class TransformUtil {

    public static void main(String[] args) {
        jsonToJavaBean("{\n" +
                "\t\t\t\t\t\"date\": \"2022-01-16\",\n" +
                "\t\t\t\t\t\"weekDay\": 7,\n" +
                "\t\t\t\t\t\"yearTips\": \"辛丑\",\n" +
                "\t\t\t\t\t\"type\": 1,\n" +
                "\t\t\t\t\t\"typeDes\": \"休息日\",\n" +
                "\t\t\t\t\t\"chineseZodiac\": \"牛\",\n" +
                "\t\t\t\t\t\"solarTerms\": \"小寒后\",\n" +
                "\t\t\t\t\t\"avoid\": \"出行.治病.安葬.开市\",\n" +
                "\t\t\t\t\t\"lunarCalendar\": \"腊月十四\",\n" +
                "\t\t\t\t\t\"suit\": \"会亲友.纳采.进人口.修造.动土.竖柱.上梁.祭祀.开光.塑绘.祈福.斋醮.嫁娶.安床.移徙.入宅.安香.纳畜\",\n" +
                "\t\t\t\t\t\"dayOfYear\": 16,\n" +
                "\t\t\t\t\t\"weekOfYear\": 2,\n" +
                "\t\t\t\t\t\"constellation\": \"摩羯座\",\n" +
                "\t\t\t\t\t\"indexWorkDayOfMonth\": 0\n" +
                "\t\t\t\t}");
    }

    /**
     * 将 jsonStr 字符串的内容转换成 javaBean
     * @param jsonStr jsonStr, 暂时不考虑数组
     * @return javaBean 的字符串
     */
    public static String jsonToJavaBean(String jsonStr) {
        jsonStr = jsonStr.replaceAll("\t","").replaceAll("\n","");
        JSONObject jsonObject = JSONUtil.parseObj(jsonStr);
        for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.println(entry.getKey() + ";");
        }
        return null;
    }

}
