!classDefinition: #EmpresaTest category: 'TP2'!
TestCase subclass: #EmpresaTest
	instanceVariableNames: ''
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:18:26'!
test001_unaEmpresaTieneUnNombreYUnCuit
	| unaEmpresa unNombre |
	unNombre _ 'Marolio'.
	unaEmpresa _ Empresa conNombre: unNombre yCuit: 2342. 
	
	Assert that: unaEmpresa nombre isEqualTo: 'Marolio'.
	Assert that: unaEmpresa cuit isEqualTo: 2342.! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:21:00'!
test002_unaEmpresaReciénCreadaNoTieneNingúnEmpleado
	| unaEmpresa unNombre |
	unNombre _ 'Marolio'.
	unaEmpresa _ Empresa conNombre: unNombre yCuit: 2342. 
	
	Assert that: unaEmpresa cantidadDeEmpleados isEqualTo: 0.
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:23:11'!
test003_unEmpleadoDePlantaTemporalTieneUnaInformaciónBásica
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	
	Assert that: unEmpleado nombre isEqualTo: 'Eduardo'.
	Assert that: unEmpleado dirección isEqualTo: 'calle123 60'.
	Assert that: unEmpleado estadoCivil isEqualTo: 'Soltero'.
	Assert that: unEmpleado fechaDeNacimiento isEqualTo: June/06/04.
	Assert that: unEmpleado sueldoBásico isEqualTo: 60000*peso.! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:23:15'!
test004_unEmpleadoDePlantaPermanenteTieneUnaInformaciónBásica
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	Assert that: unEmpleado nombre isEqualTo: 'Eduardo'.
	Assert that: unEmpleado dirección isEqualTo: 'calle123 60'.
	Assert that: unEmpleado estadoCivil isEqualTo: 'Soltero'.
	Assert that: unEmpleado fechaDeNacimiento isEqualTo: June/06/04.
	Assert that: unEmpleado sueldoBásico isEqualTo: 60000*peso.! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:45:33'!
test005_unEmpleadoDePlantaTemporalTieneFechaDeFinDeDesignación
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	
	Assert that: unEmpleado fechaDeDesignación  isEqualTo: May/10/06. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:51:15'!
test006_unEmpleadoDePlantaTemporalTieneHorasExtras
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	
	Assert that: unEmpleado horasExtras  isEqualTo: 4. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:57:48'!
test007_unEmpleadoDePlantaPermanenteTieneInformaciónSobreLaCantidadDeHijos
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	Assert that: unEmpleado cantidadDeHijos  isEqualTo: 2. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:59:13'!
test008_unEmpleadoDePlantaPermanenteTieneInformaciónSobreSuAntiguedad
	| unEmpleado  |
	unEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	Assert that: unEmpleado antiguedad  isEqualTo: 20*year. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:46:41'!
test009_unEmpleadoDePlantaPermanenteTieneAsignacionesYRetencionesDeSueldoBruto
	| unEmpleado  sueldoBrutoEsperado |
	unEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	sueldoBrutoEsperado _ (unEmpleado sueldoBásico + unEmpleado salarioFamiliar - unEmpleado retenciones). 
	
	Assert that: unEmpleado sueldoBruto  isEqualTo: sueldoBrutoEsperado. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:55:15'!
test010_unEmpleadoDePlantaTemporalTieneHorasExtrasYRetencionesDeSueldoBruto
	| unEmpleado  sueldoBrutoEsperado |
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	sueldoBrutoEsperado _ (unEmpleado sueldoBásico + unEmpleado horasExtrasTrabajadas - unEmpleado retenciones). 
	
	Assert that: unEmpleado sueldoBruto  isEqualTo: sueldoBrutoEsperado. 
	
	
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:22:29'!
test011_unaEmpresaSabeElTotalDeSueldosNetosDeTodosSusEmpleados
	| unaEmpresa unNombre unEmpleado otroEmpleado |
	unNombre _ 'Marolio'.
	unaEmpresa _ Empresa conNombre: unNombre yCuit: 2342.
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	otroEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 100000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	unaEmpresa contratarA: unEmpleado. 
	unaEmpresa contratarA: otroEmpleado.
	
	Assert that: unaEmpresa totalSueldoNeto isEqualTo: 160000*peso. 
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:25:26'!
test012_unaEmpresaSabeElTotalDeSueldosBrutosDeTodosSusEmpleados
	| unaEmpresa unNombre unEmpleado otroEmpleado |
	unNombre _ 'Marolio'.
	unaEmpresa _ Empresa conNombre: unNombre yCuit: 2342.
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	otroEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 100000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	unaEmpresa contratarA: unEmpleado. 
	unaEmpresa contratarA: otroEmpleado.
	
	Assert that: unaEmpresa totalSueldoBruto isEqualTo: 161399.65*peso. 
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:25:45'!
test013_unaEmpresaSabeElTotalDeRetencionesDeTodosSusEmpleados
	| unaEmpresa unNombre unEmpleado otroEmpleado |
	unNombre _ 'Marolio'.
	unaEmpresa _ Empresa conNombre: unNombre yCuit: 2342.
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	otroEmpleado _ EmpleadoDePlantaPermanente conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 100000*peso cantidadDeHijos: 2 yAntiguedad: 20*year. 
	
	unaEmpresa contratarA: unEmpleado. 
	unaEmpresa contratarA: otroEmpleado.
	
	Assert that: unaEmpresa montoTotalDeRetenciones isEqualTo: 60.35*peso. 
	
	! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:19:15'!
test014_unReciboDeHaberesTieneLaInformaciónBásicaDelEmpleado
	| unReciboDeHaberes unEmpleado |
	unEmpleado _ EmpleadoDePlantaTemporal conNombre: 'Eduardo' conDirección: 'calle123 60'  estadoCivil: 'Soltero' fechaDeNacimiento: June/06/04 sueldoBásico: 60000*peso fechaDeDesignación: May/10/06 yHorasExtras: 4.
	unReciboDeHaberes _ ReciboDeHaberes de: unEmpleado conFechaDeEmisión: May/05/2022.
	
	Assert that: unReciboDeHaberes nombreDelEmpleado isEqualTo: 'Eduardo'. 
	Assert that: unReciboDeHaberes direcciónDeEmpleado isEqualTo: 'calle123 60'. 
	Assert that: unReciboDeHaberes fechaDeEmisión isEqualTo: May/05/2022. 
	Assert that: unReciboDeHaberes sueldoNetoDeEmpleado isEqualTo: 60000*peso. 
	Assert that: unReciboDeHaberes sueldoBrutoDeEmpleado isEqualTo: 60139.9*peso. 
	
	
	
! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:08:55'!
test015_unEmpleadoContratadoTieneLaInformaciónBásicaMásNúmeroDeContratoYMedioDePago
	| unEmpleado |
	unEmpleado _ EmpleadoContratado nombre: 'Mario' dirección: 'calle 54 112' estadoCivil: 'Casado/a' fechaDeNacimiento: May/26/1998 sueldoBásico: 80000*peso númeroDeContrato: 2644 yMedioDePago: 'Transferencia bancaria'. 
	
	Assert that: unEmpleado nombre isEqualTo: 'Mario'. 
	Assert that: unEmpleado dirección isEqualTo: 'calle 54 112'.
	Assert that: unEmpleado estadoCivil isEqualTo:  'Casado/a'. 
	Assert that: unEmpleado fechaDeNacimiento isEqualTo: May/26/1998. 
	Assert that: unEmpleado sueldoBásico isEqualTo: 80000*peso. 
	Assert that: unEmpleado númeroDeContrato isEqualTo: 2644. 
	Assert that: unEmpleado medioDePago isEqualTo: 'Transferencia bancaria'. 
	
	
	
	
! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:34:12'!
test016_unEmpleadoContratadoTieneSueldoBruto
	| unEmpleado |
	unEmpleado _ EmpleadoContratado nombre: 'Mario' dirección: 'calle 54 112' estadoCivil: 'Casado/a' fechaDeNacimiento: May/26/1998 sueldoBásico: 80000*peso númeroDeContrato: 2644 yMedioDePago: 'Transferencia bancaria'. 
	
	Assert that: unEmpleado sueldoBruto isEqualTo: 80000*peso.
	
	
	
! !

!EmpresaTest methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:09:56'!
test017_unEmpleadoContratadoTieneRetenciónPorGastosAdministrativosConceptualesDeSuSueldoNeto
	| unEmpleado unSueldoEsperado |
	unEmpleado _ EmpleadoContratado nombre: 'Mario' dirección: 'calle 54 112' estadoCivil: 'Casado/a' fechaDeNacimiento: May/26/1998 sueldoBásico: 80000*peso númeroDeContrato: 2644 yMedioDePago: 'Transferencia bancaria'. 
	unSueldoEsperado _ 80000*peso - (50*peso). 
	
	Assert that: unEmpleado sueldoNeto isEqualTo: unSueldoEsperado.
	
	
	
! !


!classDefinition: #Empleado category: 'TP2'!
Object subclass: #Empleado
	instanceVariableNames: 'nombre dirección estadoCivil fechaDeNacimiento sueldoBásico'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!Empleado methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:56:56'!
retenciones 
	^ self subclassResponsibility ! !

!Empleado methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:56:44'!
sueldoBruto
	^ self subclassResponsibility ! !


!classDefinition: #EmpleadoContratado category: 'TP2'!
Empleado subclass: #EmpleadoContratado
	instanceVariableNames: 'númeroDeContrato medioDePago'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:19:50'!
dirección
	^dirección! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:20:02'!
estadoCivil
	^estadoCivil! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:20:10'!
fechaDeNacimiento
	^fechaDeNacimiento! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:20:34'!
medioDePago
	^medioDePago! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:19:41'!
nombre
	^nombre! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:07:12'!
nombre: unNombre dirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico númeroDeContrato: unNúmeroDeContrato yMedioDePago: unMedioDePago 
	nombre _ unNombre.
	dirección _ unaDirección. 
	estadoCivil _ unEstadoCivil. 
	fechaDeNacimiento _ unaFechaDeNacimiento. 
	sueldoBásico _ unSueldoBásico. 
	númeroDeContrato _ unNúmeroDeContrato. 
	medioDePago _ unMedioDePago.! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:20:27'!
númeroDeContrato
	^númeroDeContrato! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:06:14'!
retenciones
	^ self retenciónPorGastosAdministrativosYContractuales! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:07:02'!
retenciónPorGastosAdministrativosYContractuales
	^ (50*peso). ! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:09:11'!
sueldoBásico
	^sueldoBásico. ! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:34:43'!
sueldoBruto 
	^ sueldoBásico ! !

!EmpleadoContratado methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:10:16'!
sueldoNeto
	^ sueldoBásico - self retenciones.! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoContratado class' category: 'TP2'!
EmpleadoContratado class
	instanceVariableNames: ''!

!EmpleadoContratado class methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 02:15:16'!
nombre: unNombre dirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico númeroDeContrato: unNúmeroDeContrato yMedioDePago: unMedioDePago 
	^ self new nombre: unNombre dirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico númeroDeContrato: unNúmeroDeContrato yMedioDePago: unMedioDePago! !


!classDefinition: #EmpleadoDePlantaPermanente category: 'TP2'!
Empleado subclass: #EmpleadoDePlantaPermanente
	instanceVariableNames: 'cantidadDeHijos antiguedad'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:59:24'!
antiguedad
	^antiguedad! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:43:17'!
aportesJubilatorios
	^ 0.15*peso! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:37:04'!
asignaciónPorCónyuge
	| asignaciónSiCorresponde |  
	estadoCivil = 'Casado/a' ifTrue: [asignaciónSiCorresponde _ 100*peso]
	ifFalse: [asignaciónSiCorresponde _ 0*peso].
	^ asignaciónSiCorresponde. ! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:45:01'!
asignaciónPorHijos
	^ (cantidadDeHijos * 150*peso).! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:57:59'!
cantidadDeHijos
	^cantidadDeHijos! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:28:51'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento suedoBásico: unSueldo cantidadDeHijos: unaCantidadDeHijos yAntiguedad: unaAntiguedad 
	nombre _ unNombre. 
	dirección _ unaDirección.
	estadoCivil _ unEstadoCivil. 
	fechaDeNacimiento _ unaFechaDeNacimiento. 
	sueldoBásico _ unSueldo. 
	cantidadDeHijos _ unaCantidadDeHijos. 
	antiguedad _ unaAntiguedad. ! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:36:16'!
dirección
	^dirección! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:36:27'!
estadoCivil
	^estadoCivil! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:36:36'!
fechaDeNacimiento
	^fechaDeNacimiento! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:36:07'!
nombre
	^nombre! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:41:58'!
obraSocial
	^ 0.10*peso.! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:41:41'!
retenciones
	^ self obraSocial + self retenciónPorHijos + self aportesJubilatorios.! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:44:13'!
retenciónPorHijos
	^ (cantidadDeHijos * 20*peso).! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:44:46'!
salarioFamiliar
	^ self asignaciónPorHijos + self asignaciónPorCónyuge + ((antiguedad/year) *50*peso). ! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:28:51'!
sueldoBásico
	^ sueldoBásico ! !

!EmpleadoDePlantaPermanente methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:38:38'!
sueldoBruto
	^ sueldoBásico + self salarioFamiliar - self retenciones! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoDePlantaPermanente class' category: 'TP2'!
EmpleadoDePlantaPermanente class
	instanceVariableNames: ''!

!EmpleadoDePlantaPermanente class methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:34:22'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento YSueldoBásico: unSueldoBásico 
	^ self new conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBásico: unSueldoBásico! !

!EmpleadoDePlantaPermanente class methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:55:17'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldo cantidadDeHijos: unaCantidadDeHijos yAntiguedad: unaAntiguedad 
	^self new conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento suedoBásico: unSueldo cantidadDeHijos: unaCantidadDeHijos yAntiguedad: unaAntiguedad. ! !


!classDefinition: #EmpleadoDePlantaTemporal category: 'TP2'!
Empleado subclass: #EmpleadoDePlantaTemporal
	instanceVariableNames: 'fechaDeDesignación horasExtras'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:28:51'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico fechaDeDesignación: unaFechaDeDesignación yHorasExtras: unasHorasExtras 
	nombre _ unNombre.
	dirección _ unaDirección.
	estadoCivil _ unEstadoCivil. 
	fechaDeNacimiento _ unaFechaDeNacimiento. 
	sueldoBásico _ unSueldoBásico.
	fechaDeDesignación _ unaFechaDeDesignación.
	horasExtras _ unasHorasExtras. ! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:29:49'!
dirección
	^dirección! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:29:58'!
estadoCivil
	^estadoCivil! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:49:56'!
fechaDeDesignación
	^fechaDeDesignación! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:30:05'!
fechaDeNacimiento
	^fechaDeNacimiento! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:51:26'!
horasExtras
	^horasExtras! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:54:34'!
horasExtrasTrabajadas
	^ (horasExtras*40*peso)! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:29:39'!
nombre
	^nombre! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:53:14'!
obraSocial
	^ 0.10*peso.! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:53:30'!
retenciones
	^ self obraSocial + (5*peso*horasExtras)! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:28:51'!
sueldoBásico
	^ sueldoBásico ! !

!EmpleadoDePlantaTemporal methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 02:54:18'!
sueldoBruto
	^ sueldoBásico + self horasExtrasTrabajadas - self retenciones! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'EmpleadoDePlantaTemporal class' category: 'TP2'!
EmpleadoDePlantaTemporal class
	instanceVariableNames: ''!

!EmpleadoDePlantaTemporal class methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:27:32'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento YSueldoBásico: unSueldoBásico 
	^ self new conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento ySueldoBásico: unSueldoBásico! !

!EmpleadoDePlantaTemporal class methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:47:50'!
conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico fechaDeDesignación: unaFechaDeDesignación yHorasExtras: unasHorasExtras 
	^ self new conNombre: unNombre conDirección: unaDirección estadoCivil: unEstadoCivil fechaDeNacimiento: unaFechaDeNacimiento sueldoBásico: unSueldoBásico fechaDeDesignación: unaFechaDeDesignación yHorasExtras: unasHorasExtras! !


!classDefinition: #Empresa category: 'TP2'!
Object subclass: #Empresa
	instanceVariableNames: 'nombre cuit empleados haberes'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:22:00'!
cantidadDeEmpleados
	^ empleados size. ! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 03:18:28'!
conNombre: unNombre yCuit: unCuit 
	nombre _ unNombre.
	cuit _ unCuit.
	empleados _ Set new. 
	haberes _ OrderedCollection new. ! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:08:43'!
contratarA: unEmpleado
	empleados add: unEmpleado ! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:20:29'!
cuit
	^cuit! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:24:53'!
montoTotalDeRetenciones
	^ empleados sum: [:unEmpleado | unEmpleado retenciones]! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:20:17'!
nombre
	^nombre! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:21:29'!
totalSueldoBruto
	^ empleados sum: [:unEmpleado | unEmpleado sueldoBruto]! !

!Empresa methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 03:19:14'!
totalSueldoNeto
	^ empleados sum: [:unEmpleado | unEmpleado sueldoBásico]! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'Empresa class' category: 'TP2'!
Empresa class
	instanceVariableNames: ''!

!Empresa class methodsFor: 'as yet unclassified' stamp: 'jj 9/7/2022 01:19:22'!
conNombre: unNombre yCuit: unCuit 
	^ self new conNombre: unNombre yCuit: unCuit.! !


!classDefinition: #ReciboDeHaberes category: 'TP2'!
Object subclass: #ReciboDeHaberes
	instanceVariableNames: 'nombreDelEmpleado direcciónDelEmpleado fechaDeEmisión sueldoNetoDeEmpleado sueldoBrutoDeEmpleado'
	classVariableNames: ''
	poolDictionaries: ''
	category: 'TP2'!

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:16:20'!
de: unEmpleado conFechaDeEmisión: unaFechaDeEmisión 
	nombreDelEmpleado _ unEmpleado nombre.
	direcciónDelEmpleado _ unEmpleado dirección. 
	fechaDeEmisión _ unaFechaDeEmisión. 
	sueldoNetoDeEmpleado _ unEmpleado sueldoBásico. 
	sueldoBrutoDeEmpleado _ unEmpleado sueldoBruto.! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:17:08'!
direcciónDeEmpleado
	^ direcciónDelEmpleado 
! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:17:19'!
fechaDeEmisión
	^fechaDeEmisión! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:16:42'!
nombreDelEmpleado
	^nombreDelEmpleado! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:18:59'!
sueldoBrutoDeEmpleado
	^sueldoBrutoDeEmpleado! !

!ReciboDeHaberes methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:17:59'!
sueldoNetoDeEmpleado
	^sueldoNetoDeEmpleado! !

"-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- "!

!classDefinition: 'ReciboDeHaberes class' category: 'TP2'!
ReciboDeHaberes class
	instanceVariableNames: ''!

!ReciboDeHaberes class methodsFor: 'as yet unclassified' stamp: 'jj 9/8/2022 01:14:07'!
de: unEmpleado conFechaDeEmisión: unaFechaDeEmisión 
	^self new de: unEmpleado conFechaDeEmisión: unaFechaDeEmisión. ! !
