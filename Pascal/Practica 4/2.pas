{Escribir un programa que:
a. Implementar un modulo que almacene informacion de socios de un club en un arbol binario de busqueda. De cada socio se debe almacenar numero de socio, 
nombre y edad. La carga finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. La informacion de cada socio debe generarse
aleatoriamente.
b. Una vez generado el arbol, realice modulos independientes que reciban el arbol como parametro para: 
    i. Informar los datos de los socios en orden creciente.
    ii. Informar los datos de los socios en orden decreciente.
    iii. Informar el número de socio con mayor edad. Debe invocar a un módulo recursivo que retorne dicho valor.
    iv. Aumentar en 1 la edad de los socios con edad impar e informar la cantidad de socios que se les aumento la edad.
    vi. Leer un nombre e informar si existe o no existe un socio con ese nombre. Debe invocar a un módulo recursivo que reciba el nombre leído y retorne verdadero o falso.
    vii. Informar la cantidad de socios. Debe invocar a un módulo recursivo que retorne dicha cantidad.
    viii. Informar el promedio de edad de los socios. Debe invocar a un módulo recursivo que retorne el promedio de las edades de los socios.

}

Program ImperativoClase3;

type rangoEdad = 12..100;
     cadena15 = string [15];
     socio = record
               numero: integer;
               nombre: cadena15;
               edad: rangoEdad;
             end;
     arbol = ^nodoArbol;
     nodoArbol = record
                    dato: socio;
                    HI: arbol;
                    HD: arbol;
                 end;
     
procedure GenerarArbol (var a: arbol);
{ Implementar un modulo que almacene informacion de socios de un club en un arbol binario de busqueda. De cada socio se debe almacenar numero de socio, 
nombre y edad. La carga finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. La informacion de cada socio debe generarse
aleatoriamente. }

  Procedure CargarSocio (var s: socio);
  var vNombres:array [0..9] of string= ('Ana', 'Jose', 'Luis', 'Ema', 'Ariel', 'Pedro', 'Lena', 'Lisa', 'Martin', 'Lola'); 
  
  begin
    s.numero:= random (51) * 100;
    If (s.numero <> 0)
    then begin
           s.nombre:= vNombres[random(10)];
           s.edad:= 12 + random (79);
         end;
  end;  
  
  Procedure InsertarElemento (var a: arbol; elem: socio);
  Begin
    if (a = nil) 
    then begin
           new(a);
           a^.dato:= elem; 
           a^.HI:= nil; 
           a^.HD:= nil;
         end
    else if (elem.numero < a^.dato.numero) 
         then InsertarElemento(a^.HI, elem)
         else InsertarElemento(a^.HD, elem); 
  End;

var unSocio: socio;  
Begin
 writeln;
 writeln ('----- Ingreso de socios y armado del arbol ----->');
 writeln;
 a:= nil;
 CargarSocio (unSocio);
 while (unSocio.numero <> 0)do
  begin
   InsertarElemento (a, unSocio);
   CargarSocio (unSocio);
  end;
 writeln;
 writeln ('//////////////////////////////////////////////////////////');
 writeln;
end;

procedure informarsociosordendecreciente (a:arbol);
begin
  if (a<>nil) then begin
    informarsociosordendecreciente (a^.hd);
    writeln ('Numero: ', a^.dato.numero, ' Nombre: ', a^.dato.nombre, ' Edad: ', a^.dato.edad);
    informarsociosordendecreciente (a^.hi);
  end;
end;



procedure InformarSociosOrdenCreciente (a: arbol);
{ Informar los datos de los socios en orden creciente. }
  
  procedure InformarDatosSociosOrdenCreciente (a: arbol);
  begin
    if (a <> nil) then begin 
		InformarDatosSociosOrdenCreciente (a^.HI);
		writeln ('Numero: ', a^.dato.numero, ' Nombre: ', a^.dato.nombre, ' Edad: ', a^.dato.edad);
		InformarDatosSociosOrdenCreciente (a^.HD);
	end;		
  end;

Begin
 writeln;
 writeln ('----- Socios en orden creciente por numero de socio ----->');
 writeln;
 InformarDatosSociosOrdenCreciente (a);
 writeln;
 writeln ('//////////////////////////////////////////////////////////');
 writeln;
end;


procedure InformarNumeroSocioConMasEdad (a: arbol);
{ Informar el numero de socio con mayor edad. Debe invocar a un modulo recursivo que retorne dicho valor.  }

     procedure actualizarMaximo(var maxValor,maxElem : integer; nuevoValor, nuevoElem : integer);
	begin
	  if (nuevoValor >= maxValor) then
	  begin
		maxValor := nuevoValor;
		maxElem := nuevoElem;
	  end;
	end;
	procedure NumeroMasEdad (a: arbol; var maxEdad: integer; var maxNum: integer);
	begin
	   if (a <> nil) then
	   begin
		  actualizarMaximo(maxEdad,maxNum,a^.dato.edad,a^.dato.numero);
		  numeroMasEdad(a^.hi, maxEdad,maxNum);
		  numeroMasEdad(a^.hd, maxEdad,maxNum);
	   end; 
	end;

var maxEdad, maxNum: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Con Mas Edad ----->');
  writeln;
  maxEdad := -1;
  NumeroMasEdad (a, maxEdad, maxNum);
  if (maxEdad = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio con mas edad: ', maxedad);
         writeln;
       end;
  writeln;
  writeln ('//////////////////////////////////////////////////////////');
  writeln;
end;

procedure AumentarEdadNumeroImpar (a: arbol);
{Aumentar en 1 la edad de los socios con edad impar e informar la cantidad de socios que se les aumento la edad.}
  
  function AumentarEdad (a: arbol): integer;
  var resto: integer;
  begin
     if (a = nil) then 
       AumentarEdad:= 0
     else begin
            resto:= a^.dato.edad mod 2;
            if (resto = 1) then 
              a^.dato.edad:= a^.dato.edad + 1;
            AumentarEdad:= resto + AumentarEdad (a^.HI) + AumentarEdad (a^.HD);
          end;  
  end;
  
begin
  writeln;
  writeln ('----- Cantidad de socios con edad aumentada ----->');
  writeln;
  writeln ('Cantidad: ', AumentarEdad (a));
  writeln;
  writeln;
  writeln ('//////////////////////////////////////////////////////////');
  writeln;
end;

procedure chequeo (a:arbol; var ok: boolean; chequear: cadena15);

begin
  if (a<>nil) and (ok=false) then begin
    if a^.dato.nombre=chequear then
      ok:=true;
    chequeo (a^.hi,ok,chequear);
    chequeo (a^.hd,ok,chequear);
  end;  
end;

procedure informarexistencianombresocio (a: arbol);
var
 ok:boolean;
 chequear:cadena15;
begin
  ok:=false;
  writeln ('Ingrese el nombre que quiere chequear si esta en el arbol');
  readln (chequear);
  chequeo(a,ok,chequear);
  if ok=true then
    writeln ('El nombre se encuentra en el arbol')
  else
    writeln ('El nombre no se encontro')
end;

procedure cantidad (a:arbol; var cant:integer);
begin
  if a<>nil then begin
    cant:=cant+1;
    cantidad (a^.hi,cant);
    cantidad (a^.hd,cant);
  end;
end;

procedure informarcantidadsocios (a:arbol; var cant:integer);
begin
  cant:=0;
  cantidad (a,cant);
  writeln('La cantidad de socios es: ',cant);
end;

procedure sumaredades (a:arbol; var anos:integer);
begin
  if a<>nil then begin
    anos:=anos+a^.dato.edad;
    sumaredades (a^.hi,anos);
    sumaredades (a^.hd,anos);
  end;
end;

procedure informarpromediodeedad (a:arbol; cant:integer);
var
  anostotales:integer;
  prom:real;
begin
  anostotales:=0;
  sumaredades (a,anostotales);
  writeln ('El promedio de edad de los socios del club es: ',anostotales/cant:0:2);
end;

procedure informax2 (a:arbol; var max: integer);
begin
  if a<>nil then begin
    if a^.dato.numero>max then 
      max:= a^.dato.numero;
    informax2 (a^.hd,max);
  end;
end;
Procedure informax (a: arbol); 
var
  max: integer;
begin
  max:=-9999;
  informax2 (a,max);
  if max<>-9999 then
    writeln ('El numero de socio mas grande es ',max)
  else
    writeln ('Arbol vacio');
end;

procedure informarmin2 (a:arbol; var s:socio);
begin
  if a<>nil then begin
    if a^.dato.numero<s.numero then
      s:=a^.dato;
    informarmin2 (a^.hi,s);
  end;
end;
procedure informarmin (a:arbol);
var
  s:socio; 
begin
  s.numero:=9999;
  informarmin2 (a,s);
  if s.numero=9999 then 
    writeln ('No hay socios cargados en el arbol')
  else begin
    writeln ('Datos del socio con el numero mas chico:');
    writeln ('numero: ',s.numero,'| edad: ',s.edad,'| nonmbre: ',s.nombre);
  end;
end;

procedure informarexistencianumero2 (a:arbol; num: integer; var ok: boolean);
begin
  if a<>nil then begin
    if a^.dato.numero=num then begin
      ok:=true;
    end
    else
      if a^.dato.numero>num then
        informarexistencianumero2 (a^.hi,num,ok)
      else
        informarexistencianumero2 (a^.hd,num,ok);
  end;
end;

procedure informarexistencianumero (a:arbol);
var
  num: integer;
  ok: boolean;
begin
  ok:=false;
  writeln ('Ingrese el numero de socio del que quiere chequear su existencia dentro del arbol');
  readln (num);
  informarexistencianumero2 (a,num,ok);
  if ok=false then 
    writeln ('El socio NO esta en el arbol')
  else
    writeln ('El socio ESTA en el arbol');
end;

procedure informarenrango2 (a:arbol; min,max: integer; var cant: integer);
begin
  if a<>nil then begin
    if (a^.dato.numero>min) and (a^.dato.numero<max) then begin
      cant:=cant+1;
      informarenrango2 (a^.hi,min,max,cant);
      informarenrango2 (a^.hd,min,max,cant);
    end
    else 
      if a^.dato.numero>=max then 
        informarenrango2 (a^.hi,min,max,cant)
      else
        informarenrango2 (a^.hd,min,max,cant);
  end;
end;

procedure informarenrango (a:arbol);
var
max,min,cant: integer;
begin
  cant:=0;
  writeln ('Ingrese el limite inferior del rango');
  readln (min);
  writeln ('Ingrese el limite superior del rango');
  readln (max);
  informarenrango2 (a,min,max,cant);
  writeln ('La cantidad de socios con numero dento del rango entre ',min,' y ',max,' es ',cant);
end;

var
  a: arbol; 
  cant:integer;
Begin
  randomize;
  GenerarArbol (a);
  InformarSociosOrdenCreciente (a);
  informarsociosordendecreciente (a);
  InformarNumeroSocioConMasEdad (a);
  AumentarEdadNumeroImpar (a);
  InformarExistenciaNombreSocio (a);
  InformarCantidadSocios (a,cant);
  InformarPromedioDeEdad (a,cant);
  writeln ('-------------------Practica 4');
  Informax (a);  
  informarmin (a);
  informarexistencianumero (a);
  informarenrango (a);
End.
