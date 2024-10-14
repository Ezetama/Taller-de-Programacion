Program ej2p2;

type
lista= ^nodo;

nodo = record
  num: integer;
  sig: lista;
end;


procedure generarlista (var l:lista);
var
  i: integer;
  aux: lista;
begin
  i:=100+random(101);
  if i<>100 then begin
    new (aux);
    aux^.num:=i;
    aux^.sig:=l;
    l:=aux;
    generarlista (l);
  end;     
end;

procedure imprimirnormal (l:lista);
var
  i: integer;
begin
  i:=1;
  while l<>nil do begin
    writeln ('En la posicion ',i,' de la lista se encuentra el numero: ',l^.num);
    i:=i+1;
    l:=l^.sig;
  end;
end;

procedure imprimirrecursivo (l:lista);

begin
  if l<> nil then begin
    writeln ('El elemento de la lista es: ',l^.num);
    l:=l^.sig;
    imprimirrecursivo (l);
  end;
end;

procedure imprimirrecursivoinverso (l:lista);

begin
  if l^.sig<>nil then begin
    imprimirrecursivoinverso(l^.sig);
    writeln ('El elemento de la lista es: ',l^.num);
  end
  else
  writeln ('El elemento de la lista es: ',l^.num);
end;

procedure valorminimo (l:lista; var min: integer);

begin
  if l<>nil then begin
    if l^.num<min then
      min:=l^.num;
    valorminimo(l^.sig,min);
  end;
end;

procedure esta (l:lista; x:integer; var ok:boolean);
begin
  if (l<>nil) and (ok=false) then begin
    if l^.num=x then
      ok:=true; 
    esta (l^.sig,x,ok);
  end;
end;

var
  l: lista;
  min,x: integer;
  ok: boolean;
begin
  randomize;
  l:=nil;
  generarlista (l);
  writeln ('Primera impresion (No recursiva)');
  imprimirnormal (l);
  writeln ('Segunda impresion (recursiva)');
  imprimirrecursivo (l);
  writeln('Ahora al reves');
  imprimirrecursivoinverso (l);
  min:=9999;
  valorminimo (l,min);
  writeln ('El valor minimo encontrado en la lista es: ',min);
  ok:=false ;
  writeln ('Ingrese el valor que quiere buscar en la lista');
  readln (x);
  esta (l,x,ok);
  if ok=true then
    writeln ('El elemento esta en la lista')
  else
    writeln ('El elemento no esta en la lista');
end.