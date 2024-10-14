program ej2p1;

const
  df=300;
type
  oficina= record
    codigo: integer;
    dni: integer;
    valor: real;
  end;
vector = array [1..df] of oficina;

procedure leerofi (var ofi:oficina);
begin
  writeln ('Ingrese el codigo de identificacion de la oficina');
  readln (ofi.codigo);
  if ofi.codigo<>-1 then begin
    ofi.dni:=random(100)+1;
    ofi.valor:= random(1000); 
  end;
end;

procedure rellenarvector (var v:vector;var dl: integer);
var
  ofi:oficina;
begin
  dl:=0;
  leerofi(ofi);
  while (dl<df) and (ofi.codigo<>-1) do begin
    dl:=dl+1;
    v[dl]:=ofi;
    leerofi(ofi)
  end;
end;

procedure insercion (var v:vector; dl:integer);
var
  i,j: integer;
  aux:oficina;
begin
  for i:= 2 to dl do begin
    aux:=v[i];
    j:=i-1;
    while (j>0) and (v[j].codigo>aux.codigo) do begin
      v[j+1]:=v[j];
      j:=j-1;
    end;
    v[j+1]:=aux;
  end;
end;

procedure seleccion (var v:vector; dl: integer);
var
i,j,pos: integer;
aux:oficina;
begin
  for i:= 1 to dl-1 do begin
    pos:=i;
    for j:= i+1 to dl do begin
      if v[j].codigo<v[pos].codigo then begin
        pos:=j;
      end;
    end;
    aux:=v[i];
    v[i]:=v[pos];
    v[pos]:=aux;
  end;
end;

procedure imprimir (v:vector; dl:integer);
var
  i:integer;
begin
  for i:= 1 to dl do begin
    writeln ('POSICION',i);
    writeln ('El codigo de la oficina es:',v[i].codigo);
    writeln ('El dni del propietario de la oficina es:',v[i].dni);
    writeln ('El  de la valor oficina es de:',v[i].valor:0:2);
  end;
end;

var
  v,v2: vector;
  dl:integer;
  opa: char;
begin
  randomize;
  rellenarvector(v,dl);
  imprimir (v,dl);
  v2:=v;
  writeln ('Aprete un numero para ordenar el vector por insercion');
  readln (opa);
  insercion (v,dl);
  writeln ('aprete x para imprimir el vector');
  imprimir (v,dl);
  writeln ('aprete x para ordenar-------------------- el vector por seleccion');
  readln (opa);
  writeln ('VECTOR DESORDENADO:');
  imprimir (v2,dl);
  writeln ('VECTOR ORDENADO:');
  seleccion (v2,dl);
  imprimir (v2,dl);
end.
