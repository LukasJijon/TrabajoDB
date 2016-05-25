/*==============================================================*/
/* BORRADO DE TABLAS */
/*==============================================================*/

drop table TotPropEmpleado cascade constraints;

drop table ARRIENDO cascade constraints;

drop table CLIENTE cascade constraints;

drop table EMPLEADO cascade constraints;

drop table OFICINA cascade constraints;

drop table PROPIEDAD cascade constraints;

drop table PROPIETARIO cascade constraints;

drop table VISITA cascade constraints;

--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ARRIENDO
--------------------------------------------------------

  CREATE TABLE "USER1"."ARRIENDO" 
   (	"NUMARRIENDO" NUMBER(*,0), 
	"NUMPROPIEDAD" VARCHAR2(4 BYTE), 
	"NUMCLIENTE" VARCHAR2(4 BYTE), 
	"RENTA" FLOAT(126), 
	"FORMAPAGO" VARCHAR2(10 BYTE), 
	"DEPOSITO" FLOAT(126), 
	"PAGADO" CHAR(1 BYTE), 
	"INICIORENTA" DATE, 
	"FINRENTA" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table CLIENTE
--------------------------------------------------------

  CREATE TABLE "USER1"."CLIENTE" 
   (	"NUMCLIENTE" VARCHAR2(4 BYTE), 
	"NOMBRE" VARCHAR2(30 BYTE), 
	"APELLIDO" VARCHAR2(30 BYTE), 
	"DIRECCION" VARCHAR2(35 BYTE), 
	"TELEFONO" VARCHAR2(10 BYTE), 
	"TIPOPREF" VARCHAR2(25 BYTE), 
	"MAXRENT" FLOAT(126)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table EMPLEADO
--------------------------------------------------------

  CREATE TABLE "USER1"."EMPLEADO" 
   (	"NUMEMPLEADO" VARCHAR2(4 BYTE), 
	"NOMBRE" VARCHAR2(30 BYTE), 
	"APELLIDO" VARCHAR2(30 BYTE), 
	"CARGO" VARCHAR2(35 BYTE), 
	"SEXO" VARCHAR2(1 BYTE), 
	"FECHNAC" DATE, 
	"SALARIO" FLOAT(126), 
	"NUMOFICINA" VARCHAR2(4 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table OFICINA
--------------------------------------------------------

  CREATE TABLE "USER1"."OFICINA" 
   (	"NUMOFICINA" VARCHAR2(4 BYTE), 
	"CALLE" VARCHAR2(30 BYTE), 
	"CIUDAD" VARCHAR2(25 BYTE), 
	"CODIGOPOSTAL" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PROPIEDAD
--------------------------------------------------------

  CREATE TABLE "USER1"."PROPIEDAD" 
   (	"NUMPROPIEDAD" VARCHAR2(4 BYTE), 
	"ESTADO" VARCHAR2(15 BYTE), 
	"CALLE" VARCHAR2(30 BYTE), 
	"CIUDAD" VARCHAR2(25 BYTE), 
	"CODIGOPOSTAL" VARCHAR2(10 BYTE), 
	"TIPO" VARCHAR2(25 BYTE), 
	"HAB" NUMBER(*,0), 
	"RENTA" FLOAT(126), 
	"NUMPROPIETARIO" VARCHAR2(4 BYTE), 
	"NUMEMPLEADO" VARCHAR2(4 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PROPIETARIO
--------------------------------------------------------

  CREATE TABLE "USER1"."PROPIETARIO" 
   (	"NUMPROPIETARIO" VARCHAR2(4 BYTE), 
	"NOMBRE" VARCHAR2(30 BYTE), 
	"APELLIDO" VARCHAR2(30 BYTE), 
	"DIRECCION" VARCHAR2(30 BYTE), 
	"TELEFONO" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table TOTPROPEMPLEADO
--------------------------------------------------------

  CREATE TABLE "USER1"."TOTPROPEMPLEADO" 
   (	"NUMEMPLEADO" VARCHAR2(4 BYTE), 
	"TOTPROP" NUMBER(*,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

--------------------------------------------------------
--  DDL for Table VISITA
--------------------------------------------------------

  CREATE TABLE "USER1"."VISITA" 
   (	"NUMCLIENTE" VARCHAR2(4 BYTE), 
	"NUMPROPIEDAD" VARCHAR2(4 BYTE), 
	"FECHA" DATE, 
	"COMENTARIO" VARCHAR2(600 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for trigger TR_LlenaTotPropEmpleado
--------------------------------------------------------
create or replace TRIGGER TR_LlenaTotPropEmpleado
AFTER INSERT on empleado
 for each row
 begin
    insert into TOTPROPEMPLEADO values(:new.numempleado,0);
end ;
/

--------------------------------------------------------
--  DDL for Trigger TR_ActPropEmpleado
--------------------------------------------------------
create or replace TRIGGER TR_ActPropEmpleado
AFTER INSERT OR DELETE or update of numempleado on propiedad
 for each row
 begin
    if inserting then
    update TOTPROPEMPLEADO set totprop=totprop+1 where numempleado=:new.numempleado;
    elsif deleting then
    update TOTPROPEMPLEADO set totprop=totprop-1 where numempleado=:old.numempleado;
    else
    update TOTPROPEMPLEADO set totprop=totprop+1 where numempleado=:new.numempleado;
    update TOTPROPEMPLEADO set totprop=totprop-1 where numempleado=:old.numempleado;
    end if;
end ;
/


REM INSERTING into USER1.ARRIENDO
SET DEFINE OFF;
Insert into USER1.ARRIENDO (NUMARRIENDO,NUMPROPIEDAD,NUMCLIENTE,RENTA,FORMAPAGO,DEPOSITO,PAGADO,INICIORENTA,FINRENTA) values ('10024','PA14','CR62','650','Visa','1300','Y',to_date('01/06/05','DD/MM/RR'),to_date('31/05/06','DD/MM/RR'));
Insert into USER1.ARRIENDO (NUMARRIENDO,NUMPROPIEDAD,NUMCLIENTE,RENTA,FORMAPAGO,DEPOSITO,PAGADO,INICIORENTA,FINRENTA) values ('10075','PL94','CR76','400','Contado','800','N',to_date('01/08/05','DD/MM/RR'),to_date('31/01/06','DD/MM/RR'));
Insert into USER1.ARRIENDO (NUMARRIENDO,NUMPROPIEDAD,NUMCLIENTE,RENTA,FORMAPAGO,DEPOSITO,PAGADO,INICIORENTA,FINRENTA) values ('10012','PG21','CR74','600','Cheque','1200','Y',to_date('01/07/05','DD/MM/RR'),to_date('30/06/06','DD/MM/RR'));
REM INSERTING into USER1.CLIENTE
SET DEFINE OFF;
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR76','Jhon','Kay','56 High ST,Londonn,SW14EH','0207774563','Departamento','450');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR56','Aline','Stewart','64 Fern Dr, Glasgow G42 OBL','0141324182','Departamento','350');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR74','Mike','Ritchie','63 Well St, Glasgow,G42','0141943742','Casa','750');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR62','Mary','Tregear','12 Park PI, Glasgow, G40QR','0141225742','Departamento','600');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR78','Juan','Kayser','55 High ST,Londonn,SW14EH','0207774564','Departamento','450');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR57','Alicia','Soto','63 Fern Dr,. GlasgowG42 OBL','0141324183','Departamento','350');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR72','Miguel','Torres','62 Well St, Glasgow,G42','0141943740','Casa','750');
Insert into USER1.CLIENTE (NUMCLIENTE,NOMBRE,APELLIDO,DIRECCION,TELEFONO,TIPOPREF,MAXRENT) values ('CR63','Maria','Perez','13 Park PI, Glasgow,G4 0QR','0141225741','Departamento','600');
REM INSERTING into USER1.EMPLEADO
SET DEFINE OFF;
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL21','Jhon','White','Gerente','M',to_date('01/10/45','DD/MM/RR'),'300000','B005');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG37','Peter','Denver','Asistente','M',to_date('10/11/60','DD/MM/RR'),'120000','B006');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG14','David','Ford','Supervisor','M',to_date('09/09/58','DD/MM/RR'),'180000','B003');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SA9','Mary','Lee','Asistente','F',to_date('17/09/59','DD/MM/RR'),'90000','B007');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG5','Tina','Sarandon','Gerente','F',to_date('21/03/60','DD/MM/RR'),'240000','B003');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL41','Julie','Roberts','Asistente','F',to_date('13/06/63','DD/MM/RR'),'90000','B005');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL22','Juan','Blanco','Gerente','M',to_date('01/10/44','DD/MM/RR'),'300000','B005');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG36','Luis','Jara','Asistente','M',to_date('10/11/61','DD/MM/RR'),'120000','B003');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG13','David','Gates','Supervisor','M',to_date('09/09/58','DD/MM/RR'),'180000','B003');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SA8','Maria','Bombal','Asistente','F',to_date('17/09/59','DD/MM/RR'),'90000','B007');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SG4','Susana','Sarandons','Gerente','F',to_date('21/03/60','DD/MM/RR'),'240000','B003');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL40','Jose','Bond','Asistente','M',to_date('13/06/63','DD/MM/RR'),'90000','B005');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL50','Juan','Perez','Vendedor','M',to_date('13/06/63','DD/MM/RR'),'151000','B015');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL60','Jaime','Soto','Vendedor','M',to_date('14/06/83','DD/MM/RR'),'350000','B115');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL70','Julia','Berne','Vendedor','F',to_date('23/01/53','DD/MM/RR'),'200000','B215');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL55','Jorge','Fernandez','Vendedor','M',to_date('13/06/63','DD/MM/RR'),'151000','B015');
Insert into USER1.EMPLEADO (NUMEMPLEADO,NOMBRE,APELLIDO,CARGO,SEXO,FECHNAC,SALARIO,NUMOFICINA) values ('SL65','Jose','Isla','Vendedor','M',to_date('14/06/83','DD/MM/RR'),'350000','B115');
REM INSERTING into USER1.OFICINA
SET DEFINE OFF;
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B005','16 Holhead','Aberdeem','AB7 5SU');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B007','6 Argvill St.','London','NW2');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B003','164 Main street','Glasgow','G119Qx');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B004','2 Manor Rd','Glasgow','G114Qx');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B001','10 Dale Rd','bristol','G12');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B002','17 Holhead','Aberdeem','AB7 5SU');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B008','7 Argvill St.','London','NW21');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B006','163 Main street','Glasgow','G11');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B010','2 Manor Rd','Glasgow','G114x');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B011','14 Dale Rd','bristol','G2');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B017','6 Argvill St.','London','W2');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B013','166 Main street','Glasgow','9Qx');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B014','3 Manor Rd','Glasgow','Qx');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B012','11 Dale Rd','bristol','GH2');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B015','Costanera 25','Valdivia','0324');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B115','Picarte 124','Valdivia','0324');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B215','El Morro 110','Arica','10300');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B315','El Vergel 1500','Arica','123123');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B415','Av. Walker Martinez 1360','Santiago','W101');
Insert into USER1.OFICINA (NUMOFICINA,CALLE,CIUDAD,CODIGOPOSTAL) values ('B515','Av. Antonio Varas 929','Santiago','W101');
REM INSERTING into USER1.PROPIEDAD
SET DEFINE OFF;
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PA14','Disponible','16 Holhead','Aberdeem','AB7 5SU','Casa','6','650','C046','SL21');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PL94','Reservada','6 Argvill St.','London','NW2','Departamento','4','400','C087','SL21');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PG4','Disponible','6 Lawrence St','Glasgow','G119QX','Departamento','3','350','C040','SA9');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PG36','Disponible','2 Manor Rd','Glasgow','G114QX','Departamento','3','375','C093','SA9');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PG21','Arrendada','AV. Matta 150','Santiago','G12','Casa','5','600','C087','SG5');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR01','Disponible','Macul 120 ','Santaigo','G129AX','Departamento','4','450','C093','SA8');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR02','Reservada','Macul 220','Santiago','G129AX','Departamento','5','550','C093','SG13');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR03','Arrendada','Macul 420','Santiago','G129AX','Departamento','6','650','C093','SG14');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR04','Disponible','Macul 620','Santiago','G129AX','Departamento','3','350','C093','SG36');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR05','Disponible','Loa 100','Santiago','G129AX','Departamento','2','250','C093','SG4');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PG16','Reservada','Arturo Prats 250','Santiago','G129AX','Departamento','4','450','C047','SL22');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR07','Disponible','Gorbea 200','Santiago','G129AX','Departamento','6','650','C047','SL40');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR08','Arrendada','Gomez 230','Santiago','G129AX','Departamento','2','250','C041','SL41');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR09','Arrendada','Garibaldi 1500','Santiago','G129AX','Departamento','6','650','C041','SL50');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR10','Disponible','Las Urbinas 210','Santiago','G129AX','Departamento','6','650','C094','SL55');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR11','Reservada','Lastarria 1400','Santiago','G129AX','Departamento','3','350','C094','SL60');
Insert into USER1.PROPIEDAD (NUMPROPIEDAD,ESTADO,CALLE,CIUDAD,CODIGOPOSTAL,TIPO,HAB,RENTA,NUMPROPIETARIO,NUMEMPLEADO) values ('PR12','Disponible','Las Giraldas 200','Santiago','G129AX','Departamento','4','450','C093','SL70');
REM INSERTING into USER1.PROPIETARIO
SET DEFINE OFF;
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C046','Joe','Keogh','2 Fergus Dr, AberdeenAB 7SX','0122486121');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C087','Carol','Farrel','6 Achray St.Glasgow, G32 9DX','0141357741');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C040','Tina','Murphy','63 Well St, Glasgow, G42','0141943742');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C093','Tony','Shaw','12 Park PI, Glasgow, G40QR','0141225742');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C047','Jose','Casanova','El Volvan 123, Santiago AB 7SX','0122486125');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C088','Carolina','Fernandez','Macul 1800. Santiago, G32 9DX','0141357741');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C041','Cristina','Mora','Av. Matta 1800, Santiago, G42','0141943752');
Insert into USER1.PROPIETARIO (NUMPROPIETARIO,NOMBRE,APELLIDO,DIRECCION,TELEFONO) values ('C094','Jorge','Figueroa','Av. Macul 120, Santiago, G40QR','0141225542');
REM INSERTING into USER1.TOTPROPEMPLEADO
SET DEFINE OFF;
REM INSERTING into USER1.VISITA
SET DEFINE OFF;
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR56','PA14',to_date('24/11/99','DD/MM/RR'),'muy peque�o');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR62','PA14',to_date('14/11/99','DD/MM/RR'),'no tiene sal�n');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR76','PG4',to_date('20/10/99','DD/MM/RR'),'muy lejos');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR72','PG16',to_date('24/06/07','DD/MM/RR'),'Bakan');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR72','PG36',to_date('24/06/07','DD/MM/RR'),'Super');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR62','PG16',to_date('25/06/07','DD/MM/RR'),'Cool');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR62','PG4',to_date('25/06/07','DD/MM/RR'),null);
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR62','PG36',to_date('25/06/07','DD/MM/RR'),'No salva');
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR72','PG4',to_date('25/06/07','DD/MM/RR'),null);
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR56','PG36',to_date('28/10/99','DD/MM/RR'),null);
Insert into USER1.VISITA (NUMCLIENTE,NUMPROPIEDAD,FECHA,COMENTARIO) values ('CR56','PG4',to_date('26/11/99','DD/MM/RR'),null);
--------------------------------------------------------
--  DDL for Index PK_VISITA
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_VISITA" ON "USER1"."VISITA" ("NUMCLIENTE", "NUMPROPIEDAD", "FECHA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_EMPLEADO
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_EMPLEADO" ON "USER1"."EMPLEADO" ("NUMEMPLEADO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_TOTPROPEMPLEADO
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_TOTPROPEMPLEADO" ON "USER1"."TOTPROPEMPLEADO" ("NUMEMPLEADO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_OFICINA
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_OFICINA" ON "USER1"."OFICINA" ("NUMOFICINA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_ARRIENDO
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_ARRIENDO" ON "USER1"."ARRIENDO" ("NUMARRIENDO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_PROPIEDAD
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_PROPIEDAD" ON "USER1"."PROPIEDAD" ("NUMPROPIEDAD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_PROPIETARIO
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_PROPIETARIO" ON "USER1"."PROPIETARIO" ("NUMPROPIETARIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PK_CLIENTE
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PK_CLIENTE" ON "USER1"."CLIENTE" ("NUMCLIENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table ARRIENDO
--------------------------------------------------------

  ALTER TABLE "USER1"."ARRIENDO" ADD CONSTRAINT "PK_ARRIENDO" PRIMARY KEY ("NUMARRIENDO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."ARRIENDO" MODIFY ("NUMARRIENDO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROPIETARIO
--------------------------------------------------------

  ALTER TABLE "USER1"."PROPIETARIO" ADD CONSTRAINT "PK_PROPIETARIO" PRIMARY KEY ("NUMPROPIETARIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."PROPIETARIO" MODIFY ("NUMPROPIETARIO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROPIEDAD
--------------------------------------------------------

  ALTER TABLE "USER1"."PROPIEDAD" ADD CONSTRAINT "PK_PROPIEDAD" PRIMARY KEY ("NUMPROPIEDAD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."PROPIEDAD" MODIFY ("NUMPROPIEDAD" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TOTPROPEMPLEADO
--------------------------------------------------------

  ALTER TABLE "USER1"."TOTPROPEMPLEADO" ADD CONSTRAINT "PK_TOTPROPEMPLEADO" PRIMARY KEY ("NUMEMPLEADO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."TOTPROPEMPLEADO" MODIFY ("NUMEMPLEADO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table VISITA
--------------------------------------------------------

  ALTER TABLE "USER1"."VISITA" ADD CONSTRAINT "PK_VISITA" PRIMARY KEY ("NUMCLIENTE", "NUMPROPIEDAD", "FECHA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."VISITA" MODIFY ("FECHA" NOT NULL ENABLE);
  ALTER TABLE "USER1"."VISITA" MODIFY ("NUMPROPIEDAD" NOT NULL ENABLE);
  ALTER TABLE "USER1"."VISITA" MODIFY ("NUMCLIENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table EMPLEADO
--------------------------------------------------------

  ALTER TABLE "USER1"."EMPLEADO" ADD CONSTRAINT "PK_EMPLEADO" PRIMARY KEY ("NUMEMPLEADO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."EMPLEADO" MODIFY ("NUMEMPLEADO" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table OFICINA
--------------------------------------------------------

  ALTER TABLE "USER1"."OFICINA" ADD CONSTRAINT "PK_OFICINA" PRIMARY KEY ("NUMOFICINA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."OFICINA" MODIFY ("NUMOFICINA" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CLIENTE
--------------------------------------------------------

  ALTER TABLE "USER1"."CLIENTE" ADD CONSTRAINT "PK_CLIENTE" PRIMARY KEY ("NUMCLIENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."CLIENTE" MODIFY ("NUMCLIENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table ARRIENDO
--------------------------------------------------------

  ALTER TABLE "USER1"."ARRIENDO" ADD CONSTRAINT "FK_ARRIENDO_CLIENTE" FOREIGN KEY ("NUMCLIENTE")
	  REFERENCES "USER1"."CLIENTE" ("NUMCLIENTE") ENABLE;
  ALTER TABLE "USER1"."ARRIENDO" ADD CONSTRAINT "FK_ARRIENDO_PROPIEDAD" FOREIGN KEY ("NUMPROPIEDAD")
	  REFERENCES "USER1"."PROPIEDAD" ("NUMPROPIEDAD") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table EMPLEADO
--------------------------------------------------------

  ALTER TABLE "USER1"."EMPLEADO" ADD CONSTRAINT "FK_EMPLEADO_OFICINA" FOREIGN KEY ("NUMOFICINA")
	  REFERENCES "USER1"."OFICINA" ("NUMOFICINA") ON DELETE CASCADE ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PROPIEDAD
--------------------------------------------------------

  ALTER TABLE "USER1"."PROPIEDAD" ADD CONSTRAINT "FK_PROPIEDAD_EMPLEADO" FOREIGN KEY ("NUMEMPLEADO")
	  REFERENCES "USER1"."EMPLEADO" ("NUMEMPLEADO") ON DELETE SET NULL ENABLE;
  ALTER TABLE "USER1"."PROPIEDAD" ADD CONSTRAINT "FK_PROPIEDAD_PROPIETARIO" FOREIGN KEY ("NUMPROPIETARIO")
	  REFERENCES "USER1"."PROPIETARIO" ("NUMPROPIETARIO") ON DELETE SET NULL ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TOTPROPEMPLEADO
--------------------------------------------------------

  ALTER TABLE "USER1"."TOTPROPEMPLEADO" ADD CONSTRAINT "FK_TOTPROP_EMPLEADO" FOREIGN KEY ("NUMEMPLEADO")
	  REFERENCES "USER1"."EMPLEADO" ("NUMEMPLEADO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table VISITA
--------------------------------------------------------

  ALTER TABLE "USER1"."VISITA" ADD CONSTRAINT "FK_VISITA_CLIENTE" FOREIGN KEY ("NUMCLIENTE")
	  REFERENCES "USER1"."CLIENTE" ("NUMCLIENTE") ENABLE;
  ALTER TABLE "USER1"."VISITA" ADD CONSTRAINT "FK_VISITA_PROPIEDAD" FOREIGN KEY ("NUMPROPIEDAD")
	  REFERENCES "USER1"."PROPIEDAD" ("NUMPROPIEDAD") ENABLE;

--------------------------------------------------------
--  DDL for Trigger TR_ACTUALIZAR_ESTADO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "USER1"."TR_ACTUALIZAR_ESTADO" 
 after insert on ARRIENDO 
 for each row
 begin
    update propiedad set estado='Arrendada' where numpropiedad=:new.numpropiedad;
end ;
/
ALTER TRIGGER "USER1"."TR_ACTUALIZAR_ESTADO" ENABLE;
--------------------------------------------------------
--  DDL for Function ET
--------------------------------------------------------

  CREATE OR REPLACE FUNCTION "USER1"."ET" (estad varchar2)
   RETURN integer
IS
v_contador integer;
  CURSOR c1 IS
  SELECT COUNT(*)
  FROM propiedad
  WHERE ESTADO = estad;
BEGIN
   OPEN c1;
   FETCH c1 INTO v_contador;
   CLOSE c1;
   return v_contador;
END;

/

--------------------------------------------------------
--  DDL for Function SalariosPorOficina
--------------------------------------------------------


create or replace 
FUNCTION SalariosPorOficina (noficina varchar2)
   RETURN varchar2
IS
total varchar2(500);
BEGIN
   select sum(salario)
   into total
   from empleado 
   where numoficina=noficina;
   return 'Total: ' || to_char(total,'$999G999G999');
END SalariosPorOficina;
/

--------------------------------------------------------
--  DDL for Procedure informacion
--------------------------------------------------------

create or replace 
procedure informacion
  as
begin
  for rec in
  (
    select propi.numpropiedad numero, propi.estado estados, propi.tipo tipos, propie.nombre nombrepropie,propie.apellido apellidopropie,emple.nombre nombreemple,emple.apellido apellidoemple
    from propiedad propi left join propietario propie 
    on propi.numpropietario=propie.numpropietario
    left join empleado emple on propi.numempleado=emple.numempleado
  )
  loop
    dbms_output.put_line('Numero Propiedad: ' || rec.numero);
    dbms_output.put_line('Estado Propiedad: ' || rec.estados);
    dbms_output.put_line('Tipo Propiedad: ' || rec.tipos);
    dbms_output.put_line('Nombre Propietario: ' || rec.nombrepropie || ' ' || rec.apellidopropie);
    dbms_output.put_line('Nombre Empleado: ' || rec.nombreemple || ' ' || rec.apellidoemple);
    dbms_output.put_line('----------------------------------');
  end loop;
end informacion;

/

--------------------------------------------------------
--  DDL for Procedure INFORMACIONCURSOR
--------------------------------------------------------


create or replace 
PROCEDURE INFORMACIONCURSOR
(
p_cursor OUT NOCOPY SYS_REFCURSOR
)
as
BEGIN
  OPEN P_CURSOR FOR
    select propi.numpropiedad numero, propi.estado estados, propi.tipo tipos, propie.nombre || ' ' || propie.apellido nombrepropie,emple.nombre || ' ' || emple.apellido nombreemple
    from propiedad propi join propietario propie 
    ON PROPI.NUMPROPIETARIO=PROPIE.NUMPROPIETARIO
    JOIN EMPLEADO EMPLE ON PROPI.NUMEMPLEADO=EMPLE.NUMEMPLEADO;
end INFORMACIONCURSOR;