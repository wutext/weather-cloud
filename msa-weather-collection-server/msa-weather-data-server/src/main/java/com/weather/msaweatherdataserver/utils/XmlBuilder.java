package com.weather.msaweatherdataserver.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class XmlBuilder {

    /**
     * xml数据转实体类
     * @param clazz
     * @param xmlStr
     * @return
     * @throws IOException
     */
    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws IOException {

        Object xmlObject = null;
        Reader reader = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            reader = new StringReader(xmlStr);
            xmlObject = unmarshaller.unmarshal(reader);

        } catch (JAXBException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
        return xmlObject;
    }
}
