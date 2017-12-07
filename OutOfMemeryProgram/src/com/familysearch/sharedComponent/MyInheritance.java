package com.familysearch.sharedComponent;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class MyInheritance {

    public static void main(String[] args) {
        // open the txt in IntelliJ to see the line breaks; open the xml in the browser to see the nodes

        ClassRegistration classRegistration1 = new ClassRegistration("Sehoon Jo", "English", "2");
        ClassRegistration classRegistration2 = new ClassRegistration("Misook Jo", "Math", "3");
        ClassRegistration[] classRegistrationList = new ClassRegistration[2];
        classRegistrationList[0] = classRegistration1;
        classRegistrationList[1] = classRegistration2;
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.write(classRegistrationList, "c:\\Users\\josehoon\\Documents\\GitHub\\JavaBadge\\OutOfMemeryProgram\\src\\com\\familysearch\\RegistrationStatus.xml");
        TextWriter textWriter = new TextWriter();
        textWriter.write(classRegistrationList, "c:\\Users\\josehoon\\Documents\\GitHub\\JavaBadge\\OutOfMemeryProgram\\src\\com\\familysearch\\RegistrationStatus.txt");

        for(int i = 0; i < classRegistrationList.length; i++) {
            System.out.println("Student Name : " + classRegistrationList[i].studentName);
            System.out.println("Class Name : " + classRegistrationList[i].className);
            System.out.println("Credit Name : " + classRegistrationList[i].classCredit);
        }
    }

    public static class Writer {

        public void createFileWithContent(String fileContent, String fileName) {
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.append(fileContent);
                bufferedWriter.close();
                fileWriter.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class TextWriter extends Writer {

        public void write(ClassRegistration[] classRegistrationList, String fileName) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\nStudents Class Registration for 2017-2018 School Year:\n");
            stringBuilder.append("\n******************************************************\n");
            for(int i = 0; i < classRegistrationList.length; i++) {
                stringBuilder.append("Registration " + ((Integer)i + 1) + "\n" );
                stringBuilder.append("Student Name : " + classRegistrationList[i].getStudentName() + "\n");
                stringBuilder.append("Class Name : " + classRegistrationList[i].getClassName() + "\n");
                stringBuilder.append("Class Credit : " + classRegistrationList[i].getClassCredit() + "\n");
                stringBuilder.append("\n******************************************************\n");
            }
            createFileWithContent(stringBuilder.toString(), fileName);
        }
    }

    public static class XmlWriter extends Writer {
        public void write(ClassRegistration[] classRegistrationList, String fileName) {
            try {
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

                // root element
                Document document = documentBuilder.newDocument();
                Element element = document.createElement("ClassRegistrationList");
                document.appendChild(element);

                // staff element
                Element staffElement = document.createElement("ClassRegistration");
                element.appendChild(staffElement);

                for(int i = 0; i  < classRegistrationList.length; i++) {
                    // set attribute to staff element
                    Attr attr = document.createAttribute("id");
                    attr.setValue(String.valueOf(i + 1));
                    staffElement.setAttributeNode(attr);

                    // name element
                    Element documentElementName = document.createElement("name");
                    documentElementName.appendChild(document.createTextNode(classRegistrationList[i].getStudentName()));
                    staffElement.appendChild(documentElementName);

                    // class element
                    Element documentElementClass = document.createElement("class");
                    documentElementClass.appendChild(document.createTextNode(classRegistrationList[i].getClassName()));
                    staffElement.appendChild(documentElementClass);

                    // credit element
                    Element documentElementCredit = document.createElement("credit");
                    documentElementCredit.appendChild(document.createTextNode(classRegistrationList[i].getClassCredit()));
                    staffElement.appendChild(documentElementCredit);
                }
                TransformerFactory transformerFactory =  TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                OutputStream outputStream = new ByteArrayOutputStream();
                StreamResult streamResult = new StreamResult(outputStream);
                transformer.transform(domSource, streamResult);
                createFileWithContent(outputStream.toString(), fileName);
            } catch(ParserConfigurationException parseException) {
                parseException.printStackTrace();
            } catch(TransformerException tfe) {
                tfe.printStackTrace();
            }
        }
    }

    public static class ClassRegistration {
        private String studentName;
        private String className;
        private String classCredit;

        public ClassRegistration(String studentName, String className, String classCredit) {
            this.studentName = studentName;
            this.className = className;
            this.classCredit = classCredit;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getClassName() {
            return className;
        }

        public String getClassCredit() {
            return classCredit;
        }
    }
}
