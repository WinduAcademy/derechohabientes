/*==============================================================*/
/* DBMS name:      ORACLE Version 12c                           */
/* Created on:     29/11/2016 19:19:15                          */
/*==============================================================*/

/*==============================================================*/
/* Table: ASOCIADOA                                             */
/*==============================================================*/
create table ASOCIADOA (
   IDPERSONA            INTEGER               not null,
   IDFORMULARIO         INTEGER               not null,
   FIRMAFORM            CLOB,
   constraint PK_ASOCIADOA primary key (IDPERSONA, IDFORMULARIO)
);


/*==============================================================*/
/* Table: PROVINCIA                                             */
/*==============================================================*/
create table PROVINCIA (
   IDPROVINCIA          INTEGER               not null,
   IDDEPARTAMENTO       INTEGER               not null,
   DESCPROVINCIA        CLOB,
   constraint PK_PROVINCIA primary key (IDPROVINCIA)
);


/*==============================================================*/
/* Table: CARTAATENCIONMED                                      */
/*==============================================================*/
create table CARTAATENCIONMED (
   NUMATMED             INTEGER               not null,
   IDVINCULO            INTEGER               not null,
   constraint PK_CARTAATENCIONMED primary key (NUMATMED)
);



/*==============================================================*/
/* Table: DEPARTAMENTO                                          */
/*==============================================================*/
create table DEPARTAMENTO (
   IDDEPARTAMENTO       INTEGER               not null,
   DESCDEPARTAMENTO     CLOB,
   constraint PK_DEPARTAMENTO primary key (IDDEPARTAMENTO)
);

/*==============================================================*/
/* Table: DISTRITO                                              */
/*==============================================================*/
create table DISTRITO (
   IDDISTRITO           INTEGER               not null,
   IDPROVINCIA          INTEGER               not null,
   DESCDISTRITO         CLOB,
   constraint PK_DISTRITO primary key (IDDISTRITO)
);


/*==============================================================*/
/* Table: DOMICILIO                                             */
/*==============================================================*/
create table DOMICILIO (
   IDDOMICILIO          INTEGER               not null,
   IDTIPOZONA           INTEGER               not null,
   NOMBREZONA           CLOB,
   IDTIPOVIA            INTEGER               not null,
   NOMBREVIA            CLOB,
   IDDISTRITO           INTEGER               not null,
   ATTRIBUTE_36         CLOB,
   NUMEXT               INTEGER,
   NUMINT               INTEGER,
   constraint PK_DOMICILIO primary key (IDDOMICILIO)
);




/*==============================================================*/
/* Table: EMPLEADOR                                             */
/*==============================================================*/
create table EMPLEADOR (
   IDEMPLEADOR          INTEGER               not null,
   APELLIDOPATEMP       CLOB,
   APELLIDOMATEMP       CLOB,
   NOMBREEMP            CLOB,
   FIRMA                CLOB,
   constraint PK_EMPLEADOR primary key (IDEMPLEADOR)
);

/*==============================================================*/
/* Table: FORMULARIO                                            */
/*==============================================================*/
create table FORMULARIO (
   IDFORMULARIO         INTEGER               not null,
   DESCFORMULARIO       CLOB,
   constraint PK_FORMULARIO primary key (IDFORMULARIO)
);

/*==============================================================*/
/* Table: INCAPACIDAD                                           */
/*==============================================================*/
create table INCAPACIDAD (
   IDINCAPACIDAD        INTEGER               not null,
   CERTIFICADOMEDICO    CLOB,
   constraint PK_INCAPACIDAD primary key (IDINCAPACIDAD)
);

/*==============================================================*/
/* Table: MOTIVODEBAJA                                          */
/*==============================================================*/
create table MOTIVODEBAJA (
   IDMOTIVO             INTEGER               not null,
   IDSITUACION          INTEGER               not null,
   DESCMOTIVO           CLOB,
   constraint PK_MOTIVODEBAJA primary key (IDMOTIVO)
);



/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA (
   IDPERSONA            INTEGER               not null,
   IDTIPOPERSONA        INTEGER               not null,
   IDVINCULO            INTEGER,
   IDSITUACION          INTEGER,
   NUMERODOCUMENTO      INTEGER,
   DESSEXO              VARCHAR2(20),
   IDDOMICILIO          INTEGER               not null,
   IDTIPODOCUMENTO      INTEGER,
   IDEMPLEADOR          INTEGER,
   IDINCAPACIDAD        INTEGER,
   APELLIDOPAT          CLOB,
   APELLIDOMAT          CLOB,
   NOMBRE               CLOB,
   FECHANACIMIENTO      DATE,
   constraint PK_PERSONA primary key (IDPERSONA)
);

/*==============================================================*/
/* Table: RELACIONADOA                                          */
/*==============================================================*/
create table RELACIONADOA (
   IDPERSONA            INTEGER               not null,
   PER_IDPERSONA        INTEGER               not null,
   IDTIPORELACION       INTEGER               not null,
   constraint PK_RELACIONADOA primary key (IDPERSONA, PER_IDPERSONA, IDTIPORELACION)
);

/*==============================================================*/
/* Table: SEXO                                                  */
/*==============================================================*/
create table SEXO (
   DESSEXO              VARCHAR2(20)                 not null,
   constraint PK_SEXO primary key (DESSEXO)
);

/*==============================================================*/
/* Table: SITUACION                                             */
/*==============================================================*/
create table SITUACION (
   IDSITUACION          INTEGER               not null,
   IDMOTIVO             INTEGER,
   DESCSITUACION        CLOB,
   constraint PK_SITUACION primary key (IDSITUACION)
);
/*==============================================================*/
/* Table: TIPODEDOCUMENTO                                       */
/*==============================================================*/
create table TIPODEDOCUMENTO (
   IDTIPODOCUMENTO      INTEGER               not null,
   DESCTIPODOCUMENTO    CLOB,
   constraint PK_TIPODEDOCUMENTO primary key (IDTIPODOCUMENTO)
);

/*==============================================================*/
/* Table: TIPODERELACION                                        */
/*==============================================================*/
create table TIPODERELACION (
   IDTIPORELACION       INTEGER               not null,
   TIPORELACION         CLOB,
   constraint PK_TIPODERELACION primary key (IDTIPORELACION)
);

/*==============================================================*/
/* Table: TIPODEVIA                                             */
/*==============================================================*/
create table TIPODEVIA (
   IDTIPOVIA            INTEGER               not null,
   DESCTIPOVIA          CLOB,
   constraint PK_TIPODEVIA primary key (IDTIPOVIA)
);

/*==============================================================*/
/* Table: TIPODEZONA                                            */
/*==============================================================*/
create table TIPODEZONA (
   IDTIPOZONA           INTEGER               not null,
   DESCTIPOZONA         CLOB,
   constraint PK_TIPODEZONA primary key (IDTIPOZONA)
);

/*==============================================================*/
/* Table: TIPOPERSONA                                           */
/*==============================================================*/
create table TIPOPERSONA (
   IDTIPOPERSONA        INTEGER               not null,
   DESCRIPCIONTIPOPERSONA CLOB,
   constraint PK_TIPOPERSONA primary key (IDTIPOPERSONA)
);

/*==============================================================*/
/* Table: VINCULOFAMILIAR                                       */
/*==============================================================*/
create table VINCULOFAMILIAR (
   IDVINCULO            INTEGER               not null,
   NUMATMED             INTEGER,
   DESCVINCULO          CLOB,
   constraint PK_VINCULOFAMILIAR primary key (IDVINCULO)
);

/*==============================================================*/
/* Index: DEFINE2_FK                                            */
/*==============================================================*/
create index DEFINE2_FK on MOTIVODEBAJA (
   IDSITUACION ASC
);
/*==============================================================*/
/* Index: TIENE2_FK                                             */
/*==============================================================*/
create index TIENE2_FK on DOMICILIO (
   IDTIPOVIA ASC
);

/*==============================================================*/
/* Index: TIENE5_FK                                             */
/*==============================================================*/
create index TIENE5_FK on DOMICILIO (
   IDDISTRITO ASC
);
/*==============================================================*/
/* Index: TIENE6_FK                                             */
/*==============================================================*/
create index TIENE6_FK on DOMICILIO (
   IDTIPOZONA ASC
);
/*==============================================================*/
/* Index: PERTENECE_FK                                          */
/*==============================================================*/
create index PERTENECE_FK on DISTRITO (
   IDPROVINCIA ASC
);
/*==============================================================*/
/* Index: ASOCIADOA2_FK                                         */
/*==============================================================*/
create index ASOCIADOA2_FK on CARTAATENCIONMED (
   IDVINCULO ASC
);
/*==============================================================*/
/* Index: ASOCIADOA_FK                                          */
/*==============================================================*/
create index ASOCIADOA_FK on ASOCIADOA (
   IDFORMULARIO ASC
);
/*==============================================================*/
/* Index: ASOCIADOA4_FK                                         */
/*==============================================================*/
create index ASOCIADOA4_FK on ASOCIADOA (
   IDPERSONA ASC
);

/*==============================================================*/
/* Index: ES_FK                                                 */
/*==============================================================*/
create index ES_FK on PERSONA (
   IDTIPOPERSONA ASC
);

/*==============================================================*/
/* Index: TIENE7_FK                                             */
/*==============================================================*/
create index TIENE7_FK on PERSONA (
   IDVINCULO ASC
);

/*==============================================================*/
/* Index: TIENE8_FK                                             */
/*==============================================================*/
create index TIENE8_FK on PERSONA (
   IDSITUACION ASC
);

/*==============================================================*/
/* Index: TIENE11_FK                                            */
/*==============================================================*/
create index TIENE11_FK on PERSONA (
   DESSEXO ASC
);

/*==============================================================*/
/* Index: TIENE_FK                                              */
/*==============================================================*/
create index TIENE_FK on PERSONA (
   IDDOMICILIO ASC
);

/*==============================================================*/
/* Index: TIENE14_FK                                            */
/*==============================================================*/
create index TIENE14_FK on PERSONA (
   IDTIPODOCUMENTO ASC
);

/*==============================================================*/
/* Index: JEFEDE_FK                                             */
/*==============================================================*/
create index JEFEDE_FK on PERSONA (
   IDEMPLEADOR ASC
);

/*==============================================================*/
/* Index: TIENE12_FK                                            */
/*==============================================================*/
create index TIENE12_FK on PERSONA (
   IDINCAPACIDAD ASC
);


/*==============================================================*/
/* Index: PERTENECE2_FK                                         */
/*==============================================================*/
create index PERTENECE2_FK on PROVINCIA (
   IDDEPARTAMENTO ASC
);



/*==============================================================*/
/* Index: RELACIONADOA2_FK                                      */
/*==============================================================*/
create index RELACIONADOA2_FK on RELACIONADOA (
   IDPERSONA ASC
);

/*==============================================================*/
/* Index: RELACIONADOA3_FK                                      */
/*==============================================================*/
create index RELACIONADOA3_FK on RELACIONADOA (
   PER_IDPERSONA ASC
);

/*==============================================================*/
/* Index: RELACIONADOA_FK                                       */
/*==============================================================*/
create index RELACIONADOA_FK on RELACIONADOA (
   IDTIPORELACION ASC
);


/*==============================================================*/
/* Index: DEFINE_FK                                             */
/*==============================================================*/
create index DEFINE_FK on SITUACION (
   IDMOTIVO ASC
);

/*==============================================================*/
/* Index: ASOCIADOA3_FK                                         */
/*==============================================================*/
create index ASOCIADOA3_FK on VINCULOFAMILIAR (
   NUMATMED ASC
);

alter table ASOCIADOA
   add constraint FK_ASOCIADO_ASOCIADOA_FORMULAR foreign key (IDFORMULARIO)
      references FORMULARIO (IDFORMULARIO);

alter table ASOCIADOA
   add constraint FK_ASOCIADO_ASOCIADOA_PERSONA foreign key (IDPERSONA)
      references PERSONA (IDPERSONA);

alter table CARTAATENCIONMED
   add constraint FK_CARTAATE_ASOCIADOA_VINCULOF foreign key (IDVINCULO)
      references VINCULOFAMILIAR (IDVINCULO);

alter table DISTRITO
   add constraint FK_DISTRITO_PERTENECE_PROVINCI foreign key (IDPROVINCIA)
      references PROVINCIA (IDPROVINCIA);

alter table DOMICILIO
   add constraint FK_DOMICILI_TIENE2_TIPODEVI foreign key (IDTIPOVIA)
      references TIPODEVIA (IDTIPOVIA);

alter table DOMICILIO
   add constraint FK_DOMICILI_TIENE5_DISTRITO foreign key (IDDISTRITO)
      references DISTRITO (IDDISTRITO);

alter table DOMICILIO
   add constraint FK_DOMICILI_TIENE6_TIPODEZO foreign key (IDTIPOZONA)
      references TIPODEZONA (IDTIPOZONA);

alter table MOTIVODEBAJA
   add constraint FK_MOTIVODE_DEFINE2_SITUACIO foreign key (IDSITUACION)
      references SITUACION (IDSITUACION);

alter table PERSONA
   add constraint FK_PERSONA_ES_TIPOPERS foreign key (IDTIPOPERSONA)
      references TIPOPERSONA (IDTIPOPERSONA);

alter table PERSONA
   add constraint FK_PERSONA_JEFEDE_EMPLEADO foreign key (IDEMPLEADOR)
      references EMPLEADOR (IDEMPLEADOR);

alter table PERSONA
   add constraint FK_PERSONA_TIENE_DOMICILI foreign key (IDDOMICILIO)
      references DOMICILIO (IDDOMICILIO);

alter table PERSONA
   add constraint FK_PERSONA_TIENE11_SEXO foreign key (DESSEXO)
      references SEXO (DESSEXO);

alter table PERSONA
   add constraint FK_PERSONA_TIENE12_INCAPACI foreign key (IDINCAPACIDAD)
      references INCAPACIDAD (IDINCAPACIDAD);

alter table PERSONA
   add constraint FK_PERSONA_TIENE14_TIPODEDO foreign key (IDTIPODOCUMENTO)
      references TIPODEDOCUMENTO (IDTIPODOCUMENTO);

alter table PERSONA
   add constraint FK_PERSONA_TIENE7_VINCULOF foreign key (IDVINCULO)
      references VINCULOFAMILIAR (IDVINCULO);

alter table PERSONA
   add constraint FK_PERSONA_TIENE8_SITUACIO foreign key (IDSITUACION)
      references SITUACION (IDSITUACION);

alter table PROVINCIA
   add constraint FK_PROVINCI_PERTENECE_DEPARTAM foreign key (IDDEPARTAMENTO)
      references DEPARTAMENTO (IDDEPARTAMENTO);

alter table RELACIONADOA
   add constraint FK_RELACION_RELACIONA_TIPODERE foreign key (IDTIPORELACION)
      references TIPODERELACION (IDTIPORELACION);

alter table RELACIONADOA
   add constraint FK_RELACION_RELACIONA_PERSONA2 foreign key (IDPERSONA)
      references PERSONA (IDPERSONA);

alter table RELACIONADOA
   add constraint FK_RELACION_RELACIONA_PERSONA foreign key (PER_IDPERSONA)
      references PERSONA (IDPERSONA);

alter table SITUACION
   add constraint FK_SITUACIO_DEFINE_MOTIVODE foreign key (IDMOTIVO)
      references MOTIVODEBAJA (IDMOTIVO);

alter table VINCULOFAMILIAR
   add constraint FK_VINCULOF_ASOCIADOA_CARTAATE foreign key (NUMATMED)
      references CARTAATENCIONMED (NUMATMED);
