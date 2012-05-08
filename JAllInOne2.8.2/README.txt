JAllInOne Project
===================

1. Requirements
---------------
The following files must be available to use JAllInOne:
- clientjaio.jar 
- common-beanutils-1.5.jar
- common-collections-2.1.jar
- common-digester-175.jar
- itext-1.3.1.jar
- jasperreports-1.2.7.jar
- jcalendar.jar
- jnlp.jar
- jnlp-servlet.jar
- jruleengine.jar
- jsr94.jar 
- log4j-1.2.7.jar
- serveros.jar 
- netscape.jar
- poi-2.0-RC2-20040102.jar
- pooler.jar
- serverjaio.jar
- clientos.jar
- commonos.jar
- serveros.jar
- BcImage.jar
- barbecue-1.1.jar

Note: OfficeLnFs_2.7.jar an open source project available in http://officelnfs.sourceforge.net/ and distributed with a BSD-style license.

Note: a JDBC driver is also required (not included in this distribution), according to the database.


2. Directory Structure
----------------------
src		source files of JAllInOne.

lib		jar files 

docs		documentation files.

classes/        client-side files

pub/            build.xml Ant file and JAllInOne war file

/		db.xml database project file, created using DBDesigner 4


3. Installation instructions
----------------------------

JAllInOne must be deployed into a J2EE application server.
Tomcat can be used. Yuo have to deploy the jallinone.war file into the A.S
and (re)start it.
A database schema must also be provided. JAllInOne has been tested on Oracle, SQL Server and MySQL rel.5 
You have to include the JDBC driver into the WEB-INF/lib folder of the web app or into a lib subfolder of the A.S.
When you connect for the first time to the application the client-side application will be downloaded and
the setup wizard will be showed to guide you in the database structure creation.


JDK 1.4 is required.
I can be used with java 1.5 or 1.6 too.

