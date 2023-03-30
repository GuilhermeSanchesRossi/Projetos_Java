#include <stdio.h>
#include <stdlib.h>

void ConstruirListaLigada(int t, int* n, int* p){
    for(int i = 0; i < t; i++){
        p[i] = i-1;
        n[i] = i+1;
        if(i == t-1)
            n[i] = -1;
    }
}

void ImprimirListaLigada(int t, int* n, int* p, int* v){
    printf("\n///////VISUALIZACAO DA LISTA///////\n");
    printf("indice\tprev\tvalor\tnext\n");
    for(int i = 0; i < t; i++)
        printf("%d\t%d\t%d\t%d\n", i, p[i], v[i], n[i]);
}

int InserirValor(int valorNovo, int naFrenteDe, int t, int* n, int* p, int* v){
    if(naFrenteDe == -1)
        printf("\nInserindo valor %d no inicio da lista:\n", valorNovo);
    else
        printf("\nInserindo valor %d na frente do valor de indice %d na lista:\n", valorNovo, naFrenteDe);

    n = (int*) realloc(n, t+1);
    p = (int*) realloc(p, t+1);
    v = (int*) realloc(v, t+1);
    v[t] = valorNovo;
    p[t] = naFrenteDe;
    if(n[naFrenteDe] != -1){
        p[naFrenteDe+1] = t;
        n[t] = naFrenteDe+1;
    }
    else
        n[t] = -1;
    if(naFrenteDe != -1)
        n[naFrenteDe] = t;

    return t+1;
}

void DeletarValor(int indicePraTirar, int* n, int* p, int* v){
    printf("\nDeletando o valor %d no indice %d da lista:\n", v[indicePraTirar], indicePraTirar);
    v[indicePraTirar] = -1;
    if(p[indicePraTirar] == -1)
        p[n[indicePraTirar]] = -1;
    if(n[indicePraTirar] == -1)
        n[p[indicePraTirar]] == -1;
    n[p[indicePraTirar]] = n[indicePraTirar];
    p[n[indicePraTirar]] = p[indicePraTirar];
    p[indicePraTirar] = -1;
    n[indicePraTirar] = -1;
}

int main()
{
    int tamanho = 4;
    int *valores, *prev, *next;
    valores = (int*) malloc(tamanho*sizeof(int));
    valores[0] = 34;
    valores[1] = 22;
    valores[2] = 56;
    valores[3] = 11;
    prev = (int*) malloc(tamanho*sizeof(int));
    next = (int*) malloc(tamanho*sizeof(int));

    ConstruirListaLigada(tamanho, next, prev);
    ImprimirListaLigada(tamanho, next, prev, valores);
    tamanho = InserirValor(75, 2, tamanho, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);
    tamanho = InserirValor(69, -1, tamanho, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);
    tamanho = InserirValor(47, 3, tamanho, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);
    DeletarValor(5, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);
    DeletarValor(6, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);
    DeletarValor(1, next, prev, valores);
    ImprimirListaLigada(tamanho, next, prev, valores);

    free(valores);
    free(next);
    free(prev);

    return 0;
}
