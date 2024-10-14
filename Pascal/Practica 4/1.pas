{a. Almacenar los productos vendidos en una estructura eficiente para la búsqueda por código de producto.
De cada producto deben quedar almacenados su código, la cantidad total de unidades vendidas y el monto total. De cada venta se cargan código de venta, código del producto vendido, cantidad de unidades vendidas y precio unitario. El ingreso de las ventas finaliza cuando se lee el código de venta 0.
b. Imprimir el contenido del árbol ordenado por código de producto.
c. Retornar el menor código de producto.
d. Retornar la cantidad de códigos que existen en el árbol que son menores que un valor que se recibe como parámetro.
e. Retornar el monto total entre todos los códigos de productos comprendidos entre dos valores recibidos (sin incluir) como parámetros.

}

Program ImperativoClase4;

type 
venta = record
  codigoVenta: integer;
  codigoProducto: integer;
  cantUnidades: integer;
  precioUnitario: real;
end;

productoVendido = record
  codigo :integer;
  cantTotalUnidades: integer;
  montoTotal: real;
end;

arbol = ^nodoArbol;

nodoArbol = record
  dato: productoVendido;
  HI: arbol;
  HD: arbol;
end;

Procedure CargarVenta (var v :venta);
  begin
    v.codigoVenta:= random (51);
    If (v.codigoVenta <> 0)
    then begin
           v.codigoProducto:= random (100) + 1;
           v.cantUnidades:= random(15) + 1;
           v.precioUnitario:=  random (100)*2;
         end;
  end;  

Procedure ArmarProducto (var p :productoVendido; v: venta);
     begin
       p.codigo:= v.codigoProducto;
       p.cantTotalUnidades:= v.cantUnidades;
       p.montoTotal:= v.cantUnidades  * v.precioUnitario;
     end;

Procedure InsertarElemento (var a: arbol; elem: venta);
  var p: productoVendido;
  Begin
    if (a = nil) then begin
           new(a);
           ArmarProducto (p, elem);
           a^.dato:= p; 
           a^.HI:= nil; 
           a^.HD:= nil;
         end
    else if (elem.codigoProducto = a^.dato.codigo)
         then begin
                a^.dato.cantTotalUnidades:= a^.dato.cantTotalUnidades + elem.cantUnidades;
                a^.dato.montoTotal:= a^.dato.montoTotal + (elem.cantUnidades * elem.precioUnitario);
              end
         else if (elem.codigoProducto<a^.dato.codigo) 
              then InsertarElemento(a^.HI, elem)
              else InsertarElemento(a^.HD, elem); 
  End;
              
procedure ModuloA (var a: arbol);
{ Almacene los productos vendidos en una estructura eficiente para la búsqueda por código de producto. De cada producto deben quedar almacenados la cantidad total 
de unidades vendidas y el monto total. }

var unaVenta: venta;  
Begin
 writeln ('----- Ingreso de ventas y armado de arbol de productos -----');
 a:= nil;
 CargarVenta (unaVenta);
 while (unaVenta.codigoVenta<>  0) do
  begin
   InsertarElemento (a, unaVenta);
   CargarVenta (unaVenta);
  end;
 writeln;
 writeln ('-----------------------------------------------');
 writeln;
end;

procedure ModuloB (a: arbol);
{ Imprima el contenido del árbol ordenado por código de producto.}
  procedure ImprimirArbol (a :arbol);
  begin
    if (a<>nil)
    then begin
          if (a^.HI <> nil) then ImprimirArbol (a^.HI);
          writeln ('Codigo producto ', a^.dato.codigo, ' cantidad unidades ', a^.dato.cantTotalUnidades, ' monto total ', a^.dato.montoTotal:2:2);
          if (a^.HD <>nil) then ImprimirArbol (a^.HD);
         end;
  end;

begin
  writeln;
  writeln ('----- Modulo B -----');
  writeln;
  if ( a = nil) then writeln ('Arbol vacio')
                else ImprimirArbol (a);
  writeln;
  writeln ('-----------------------------------------------');
  writeln;
end;

function ObtenerMinimo (a: arbol):integer;
  begin
    if (a = nil) 
    then ObtenerMinimo:= 9999
    else if (a^.HI = nil) then ObtenerMinimo:= a^.dato.codigo
                          else ObtenerMinimo:= ObtenerMinimo (a^.HI)
  end;
  
procedure ModuloC (a :arbol);
{Retornar el menor código de producto.}
   
var menorCodigo :integer;
begin
  writeln ('----- Modulo C -----');
  menorCodigo:= ObtenerMinimo (a);
  if (menorCodigo = 9999) 
  then writeln ('Arbol vacio')
  else begin
         writeln;
         writeln ('El codigo menor es ', menorCodigo); 
         writeln;
       end;
end;

procedure moduloca2 (a:arbol; var  codmin:integer);

begin
  if a<>nil then begin
    if a^.hi<>nil then
      moduloca2 (a^.hi,codmin)
    else
      codmin:=a^.dato.codigo
  end;
end;

procedure moduloca (a:arbol);
var
  codigomin:integer;
begin
  codigomin:=9999;
  moduloca2 (a,codigomin);
  if (codigomin = 9999) then
    writeln ('Arbol vacio')
  else
    writeln ('El menor codigo de producto es: ',codigomin);
  
end;


procedure modulod2 (a:arbol; var cant: integer; x:integer);

begin
  if a<>nil then begin
    if a^.dato.codigo<x then begin
      cant:=cant+1;
    END;
      writeln ('INCREMENTE 1');
      modulod2 (a^.hi,cant,x);
      writeln ('LLEGUE A LA HOJA IZQUIERDA');
      modulod2 (a^.hd,cant,x);
  end;
end;

procedure ModuloD (a: arbol);
var
  x,cant: integer;
begin
  writeln ('Ingrese el valor (x) del que quiere chequear la cantidad de codigos menores que (x) que hay en el arbol');
  readln (x);
  cant:=0;
  modulod2 (a,cant,x);
  writeln ('La cantidad de codigos menores a ',x,' es: ',cant);
end;

procedure moduloe2 (a:arbol; var mont:real; min,max: integer);

begin
  if a<>nil then begin
    if (a^.dato.codigo>min) and (a^.dato.codigo<max) then begin
       mont:=mont+a^.dato.montototal;
       moduloe2 (a^.hi,mont,min,max);
       moduloe2 (a^.hd,mont,min,max);
    end
    else begin
    if a^.dato.codigo<=min then
      moduloe2 (a^.hd,mont,min,max)
    else
      moduloe2 (a^.hi,mont,min,max);
    end;
  end;
end;

procedure moduloe (a:arbol);
var
  montosupremo: real;
  min,max: integer;
begin
  writeln ('Ingrese el codigo inferior del rango del que quiere sumar el montototal de los productos');
  readln (min);
  writeln ('Ingrese el codigo superior del rango del que quiere sumar el montototal de los productos');
  readln (max);
  montosupremo:=0;
  moduloe2 (a,montosupremo,min,max);
  writeln ('El monto total de la suma de los montos de los codigos comprendidos entre ',min,' y ',max, ' es: ',montosupremo:0:2);
end;

{procedure ModuloE (a: arbol);
 Contenga un módulo que reciba la estructura generada en el punto a y dos códigos de producto y retorne el monto total entre todos los códigos de productos 
comprendidos entre los dos valores recibidos (sin incluir). 
  
 function ObtenerMontoTotalEntreDosCodigos (a arbol; codigo1, codigo2 integer) real;
  begin
     COMPLETAR 
 end;
   
var 
  codigo1, codigo2: integer;
  montoTotal: real;
begin
  writeln;
  writeln ('----- Modulo E -----');
  writeln;
  write ('Ingrese primer codigo de producto ');
  readln (codigo1);
  write ('Ingrese segundo codigo de producto (mayor al primer codigo) ');
  readln (codigo2);
  writeln;
  montoTotal= ObtenerMontoTotalEntreDosCodigos (a, codigo1, codigo2);
  if (montoTotal = 0) 
  then writeln ('No hay codigos entre ', codigo1, ' y ', codigo2)
  else begin
         writeln;
         writeln ('El monto total entre el codigo', codigo1, ' y el codigo  ', codigo2, ' es ', montoTotal); 
         writeln;
       end;
  writeln;
  writeln ('-----------------------------------------------');
  writeln;
end;}

var 
  a: arbol;
Begin
  randomize;
  ModuloA (a);
  ModuloB (a);
  ModuloCa (a);
  ModuloD (a);
  ModuloE (a);

End.
   
