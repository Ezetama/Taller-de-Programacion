Program ejercico1;
const
  dimf = 50;
type
  dias = 0..31;
  venta = record
    dia: dias;
    codigo: integer;
    cantidad: integer;
  end;
  vector = array [1..dimf] of venta;
  lista = ^nodo;
  nodo = record
    elem: venta;
    sig: lista;
  end;

procedure leerventa (var v: venta);
var
no: boolean;
begin
  no:= false;
  v.dia:= random (32);
  if v.dia<>0 then begin
    v.codigo:= random(15)+1;
    if no=true then begin
       writeln ('Ingrese la cantidad de ventas del producto (como maximo 99 unidades)');
       readln (v.cantidad);
     end
     else
       v.cantidad:= random (100);
  end;
  if v.dia<>0 then begin
    writeln ('venta cargada con exito');
    writeln ('dia: ',v.dia,' codigo: ',v.codigo,' cantida: ',v.cantidad);
  end;
end;

Procedure almacenarinfo (var v: vector; var diml: integer);
var
  vent: venta;
begin
  diml:= 0;
  leerventa (vent);
  while (diml<dimf) and (vent.dia<>0) do begin
    diml:=diml+1;
    v[diml]:=vent;
    leerventa (vent);
  end;
end;

Procedure imprimirvector (v:vector; diml: integer);
var
i: integer;
begin
  if diml=0 then begin
    writeln ('No se ingreso ninguna venta');
  end
  else begin
    for i:= 1 to diml do begin
      writeln ('La venta se realizo el dia: ',v[i].dia);
      writeln ('El codigo de producto es: ',v[i].codigo);
      writeln ('La cantidad vendida es de: ',v[i].cantidad);
    end;
  end
end;

procedure ordenarV (var V: vector; diml: integer);
var
i,j,pos: integer;
aux: venta;
begin
  for i:= 1 to diml-1 do begin
    pos:=i;
    for j:= i+1 to diml do begin
      if (v[j].codigo)<(v[pos].codigo) then
        pos:=j;
    end;
    aux:=v[i];
    v[i]:=v[pos];
    v[pos]:=aux;
  end;
end; 
 
function encontrarposmenor (v: vector; menor,diml: integer): integer;
var
  pos: integer;
begin
  pos:=1;
  while (pos<diml) and (v[pos].codigo<menor) do
    pos:=pos+1;
  if pos=diml then begin
    encontrarposmenor:=0;
  end
  else begin
    encontrarposmenor:=pos-1;
  end;
end;

function encontrarposmayor (v:vector; mayor,posmenor,diml: integer): integer;
var
  pos: integer;

begin
  pos:=posmenor;
  while (pos<diml) and (v[pos].codigo<mayor) do begin
    pos:=pos+1;
  end;
  encontrarposmayor:=0;
  encontrarposmayor:= pos;
end; 


Procedure eliminar (var v: vector; var diml: integer; menor, mayor: integer);
var
posmayor, posmenor,i,aux: integer;
begin
  posmenor:= encontrarposmenor (v,menor,diml);
  posmayor:= encontrarposmayor (v,mayor,posmenor,diml);
  diml:=diml-(diml-posmayor-1);
  aux:=1;
  for i := posmenor+1 to diml do begin
    v[aux]:=v[i];
    aux:=aux+1;
  end;
  diml:=diml-posmenor;
end; 
 
  
var
v: vector;
L: lista;
Diml,menor, mayor,opa: integer;

Begin
  randomize;
  almacenarinfo (v,diml);
  writeln ('apreta x para imprimir el vector');
  readln (opa);
  Imprimirvector (v,diml);
  writeln ('apreta x para ordenar el vector');
  readln (opa);
  ordenarV (v,diml);
  imprimirvector (v,diml);
  writeln ('Vector imrpeso, aprete x para continuar la ejecucion');
  readln (opa);
  writeln ('Ingrese el valor inferior del rango de codigos que quiere eliminar');
  readln (menor);
  writeln ('Ingrese el valor superior del rango de codigos que quiere eliminar');
  readln (mayor);
  eliminar (v,diml,menor,mayor);
  imprimirvector (v,diml);
end.