program ej1p5;

const
  df=300;
type
  oficina = record
    codigo: integer;
    dni: integer;
    costo:real;
  end;
  vector = array [1..df] of oficina;

procedure cargaroficina (var o: oficina);
begin
  o.codigo:= random (10);
  if o.codigo<>0 then begin
    o.dni:= random (10000)+1;
    o.costo:= random (1000)+1;
  end;
end;
procedure cargarv (var v: vector; var dl: integer);
var
  ofi:oficina;
begin
  dl:=0;
  cargaroficina(ofi);
  while (dl<df) and (ofi.codigo<>0) do begin
    dl:=dl+1;
    v[dl]:=ofi;
    cargaroficina(ofi);
  end;
end;  

procedure ordenar (var v: vector;dl: integer);
var
  i,pos,j: integer;
  aux: oficina;
begin
  for i:= 1 to dl-1 do begin
    pos:=i;
    for j:= pos+1 to dl do begin
      if v[j].codigo<=v[pos].codigo then begin
        pos:=j;
      end;
    end;
    aux:= v[i];
    v[i]:= v[pos];
    v[pos]:= aux;
  end;
end;
    
procedure dicotomica (v: vector; dl: integer; var x: integer);
var
  inf,med,sup: integer;
    
begin
  inf:=1;
  sup:=dl;
  med:= (inf+dl)div 2;
  writeln ('MED VALE ',med);
  while (inf<=sup) and (v[med].codigo<>x) do begin
    if x<v[med].codigo then begin
      sup:=med-1;
      writeln ('Corto para la izquierda');
    end
    else begin
      inf:=med+1;
      writeln ('Corto para la derecha');
    end;
    med:=(inf+sup) div 2; 
  end;
  if (inf<=sup) and (v[med].codigo=x) then
    x:=med
  else
    x:=0;
end;  

procedure sumar (v:vector; dl: integer; var m: real);

begin
  if dl<>0 then begin
    m:=m+v[dl].costo;
    sumar (v,dl-1,m);
  end;  
end;

procedure montototal (v: vector; dl: integer);
var
  monto: real;
begin
  monto:=0;
  sumar (v,dl,monto);
  writeln ('El monto total generando de todas las expensas es: ',monto:0:2);
end;    

var
  v: vector;
  i,dl,x: integer;
begin
  randomize;
  cargarv(v,dl);
  for i:= 1 to dl do begin
    writeln ('codigo: ',v[i].codigo,' dni: ',v[i].dni, ' costo: ',v[i].costo:0:2);
  end;
  ordenar (v,dl);
  writeln('------------------ORDENAR--------------');
  for i:= 1 to dl do begin
    writeln ('codigo: ',v[i].codigo,' dni: ',v[i].dni, ' costo: ',v[i].costo:0:2);
  end;
  writeln ('Ingrese un codigo para buscar su posicion');
  readln (x);
  dicotomica(v,dl,x);
  writeln ('El elemento esta en la pos ' ,x);
  montototal (v,dl);
end.
