---
CORSO: Calcolo Numerico
CFU: "9"
PROF: Luca Gemignani
---
# Teoremi e Dimostrazioni orale Gemignani

### Teorema 2.2.1 - Errore inerente [[Calcolo Errore Inerente.pdf| (CARD)]]
Sia $x\in\mathbb{R}$ con $\omega\leq |x| \leq\Omega$ *(no **underflow/overflow**)*, si ha:
$$
\begin{align}
    |\epsilon_{in}| &= \left|\frac{trn(x)-x}{x}\right| & \leq u&=\beta^{1-t}\\
    &&&=\frac{1}{2}\beta^{1-t}\ \ \text{per}\ \ arr(x)
\end{align}
$$
#### Dimostrazione
Sia $x=(-1)^s\beta^p\alpha$. L'errore **assoluto** $|x-trn(x)|$ è maggiorato dalla distanza di due numeri di macchina **consecutivi**, per cui si ha
$$
\begin{align}
    |trn(x)-x|\leq\beta^{p-t} \tag{1}
\end{align}
$$
Inoltre vale $|x|\geq\beta^{p-1}$, quindi
$$
\begin{align}
    |\epsilon_{in}|=\left|\frac{trn(x)-x}{x}\right|&\leq\frac{\beta^{p-t}}{\beta^{p-1}}=\beta^{1-t}=u \tag{2}
\end{align}
$$
---
### Teorema 3.1.1 - Errore totale [[Errore Inerente Algoritmico e Totale.pdf| (CARD) ]]
$\epsilon_{tot}=\epsilon_{in}+\epsilon_{alg}$
#### Dimostrazione
$$
\begin{align*}
    \epsilon_{tot} &=\frac{g(\tilde{x}) - f(x)}{f(x)} \tag{1}\\ \\
    &=\underbracket{\frac{g(\tilde{x})-f(\tilde{x})}{f(\tilde{x})}}_{\epsilon_{alg}}\underbracket{\frac{f(\tilde{x})}{f(x)}}_{(1+\epsilon_x)}+\underbracket{\frac{f(\tilde{x})-f(x)}{f(x)}}_{\epsilon_{in}}\tag{2}\\ \\
    &=\epsilon_{alg}(1+\epsilon_x)+\epsilon_{in}\\
    &\doteq\epsilon_{alg}+\epsilon_{in}\tag{3}
\end{align*}
$$
---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 4.4.1 - Cerchi di Gershgorin [[Teorema di Gershgorin.pdf| (CARD) ]]

Sia $A\in\mathbb{C}^{n\times n}$. Definiamo di **Cerchi di Gershgorin** $K_i\ \forall\ 1\leq i\leq n$ come
$$
\begin{align*}
    K_i = \left\{z\in\mathbb{C}: |z-a_{i,i}|\leq\sum_{j=1, J\neq i}^n|a_{i,j}|\ \ \forall\ 1\leq i\leq n\right\} \tag{1}
\end{align*}
$$
Allora

$\lambda$ autovalore di $A$ $\implies \lambda\in\bigcup_{i=1}^n K_i$

#### Dimostrazione

Sia $\lambda$ autovalore di $A$ con corrispondente autovettore **destro** $x$.\
La relazione $Ax=\lambda x$ implica
$$
\begin{align*}
    \sum_{j=1}^na_{i,j}x_j = \lambda x_i\ \ \forall\ 1\leq i\leq n\tag{1}
\end{align*}
$$
Estraendo dalla sommatoria l'elemento diagonale rimane
$$
\begin{align*}
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j + a_{i,i}x_i &= \lambda x_i&& \forall\ 1\leq i\leq n\tag{2.1}\\
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j &= \lambda x_i - a_{i,i}x_i&& \forall\ 1\leq i\leq n\tag{2.2}\\
    \sum_{j=1,\ j\neq i}^na_{i,j}x_j &= (\lambda - a_{i,i})x_i&& \forall\ 1\leq i\leq n\tag{2.3}
\end{align*}
$$
Preso $p$ indice della componente di modulo massimo di $x$ (ES: $|x_p| = \|x\|_{\infty}$)\
Poichè $x=0\implies|x_p|>0$ e per $p=i$ otteniamo
$$
\begin{align*}
    \sum_{j=1,\ j\neq i}^na_{p,j}x_j &= (\lambda - a_{p,p})x_p \tag{3}\\
\end{align*}
$$
Passando ai valori assoluti
$$
\begin{align*}
    |(\lambda-a_{p,p})x_p| = |(\lambda-a_{p,p})||x_p| = \left|\sum_{j=1,\ j\neq i}^na_{p,j}x_j\right|\leq\sum_{j=1,\ j\neq i}^n|a_{p,j}||x_j|\tag{4}
\end{align*}
$$
Dividendo per $|x|$
$$
\begin{align*}
    |(\lambda-a_{p,p})|\leq\sum_{j=1,\ j\neq i}^n|a_{p,j}|\tag{5}
\end{align*}
$$
Da cui la tesi

---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 5.1.1 - Esistenza e Unicità di LU [[Fattorizzazione LU.pdf| (CARD)]]

Data $A\in\mathbb{R}^{n\times n}$. Se $A(1:k, 1:k)$ e' invertibile $\forall\ 1\leq k\leq n-1$ allora esiste unica ($\exists!$) $LU$ di $A$ 
#### Dimostrazione
Per induzione su $n$
1. Per $n=1$ si ha $A=[a]=[1][a]$ unica fattorizzazione $LU$ di $A$
2. Supponiamo la veridicita' del teorema per $A$ di ordine $m\leq n-1$
3. Costruiamo $LU$ per $A$ di ordine $n$

$$
\begin{align*}
\left[\begin{array}{c|c}
A(1:n-1,1:n-1) & z \\[0.5em]
\hline \\[-0.9em]
v^T & \alpha
\end{array}\right] = 
\left[\begin{array}{c|c}
L(1:n-1,1:n-1) & 0 \\[0.5em]
\hline \\[-0.9em]
\omega^T & 1
\end{array}\right] 
\left[\begin{array}{c|c}
U(1:n-1,1:n-1) & y \\[0.5em]
\hline \\[-0.9em]
0^T & \beta
\end{array}\right]
\end{align*}
$$
Come sistema
$$
\begin{cases}
    A(1:n-1,1:n-1) &= L(1:n-1,1:n-1)U(1:n-1,1:n-1) && (1)\\
    z &= A(1:n-1,1:n-1)y && (2)\\
    v^t &= \omega^TU(1:n-1,1:n-1) && (3)\\
    \alpha &= \omega^Ty+\beta && (4)\\
\end{cases}
$$

Per ipotesi $A(1:n-1,1:n-1)$ invertibile e per tale motivo $\exists!LU$ con fattori triangolari (equazione $(1)$ del sistema)
- $L(1:n-1,1:n-1)$ 
- $U(1:n-1,1:n-1)$ 

Sempre dall'invertibilita' di $A(1:n-1,1:n-1)$ segue che 
1. $L(1:n-1,1:n-1)$ e' invertibile per costruzione
2. $U(1:n-1,1:n-1)$ e' invertibile
   
>[!IMPORTANT]
> $\det(A)=\det(LU)=\det(L)*\det(U)$ e $\det(L)=1$ per costruzione. Segue che $\det(A)=\det(U)$, se $\det(A)\neq 0\implies\det(U)\neq 0$

Di conseguenza le equazioni $(2)$ e $(3)$ del teorema ammetto unica soluzione. Anche l'equazione $(4)$ ammette unica soluzione poiche' conseguenza delle equazioni precedenti

---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 6.1.2 - Convergenza dei Metodi Iterativi (Cond. Suff.) [[CS Convergenza dei Metodi Iterativi.pdf| (CARD)]]

Dato il metodo iterativo
$$
\begin{cases}
    x^{(0)}\in\mathbb{R}^n&&&&(1)\\
    x^{(k+1)}=Px^{(k)}+q&&k\geq 0&&(2)
\end{cases}
$$
> [!NOTE]
>
> Con $P=M^{-1}N$, $\ q=M^{-1}b$, $\ A=M-N$

Il metodo converse se esiste ($\exists$) una norma matriciale indotta su $\mathbb{R}^n$ t.c. $\|P\|<1$

#### Dimostrazione
Prese le relazioni
$$
\begin{align*}
    x^{(k+1)}=Px^{(k)}+q&&&&x=Px+q
\end{align*}
$$
E sottratte tra di loro
$$
\begin{align*}
    \underbracket{x^{(k+1)}-x}_{e^{k+1}}&=\underbracket{P(x^{(k)}-x)}_{Pe^{k}}\\ \\
    e^{(k+1)}&=Pe^{(k)}\tag{2}
\end{align*}
$$
Stando alla relazione $(2)$ e' facile dimostrare che

> [!IMPORTANT]
> $$
> \begin{align*}
>     e^{(k+1)}&=Pe^{(k)}\\
>     &=P(Pe^{(k-1)})\\
>     &=P(\underbracket{P*P*\dots*P}_{\text{k volte}}\ e^{(0)})\\
>     &= P^{k+1}e^{(0)}
> \end{align*}
> $$

Passando alla norma
$$
\begin{align*}
    \|e^{(k+1)}\| = \|P^{k+1}e^{(0)}\|\leq \|P\|^{k+1}\|e^{(0)}\|
\end{align*}
$$

> [!IMPORTANT]
>
> Poiche' $\|P\|<1$ per ipotesi del teorema, $\lim_{k\to\infty}\|P\|^{k+1}\|e^{(0)}\|=0$ e per costruzione del teorema $0\leq \|e^{(k+1)}\|$

Segue dal teorema del confronto che $\forall e^{(0)}$ o, equivalentemente, $\forall x^{(0)}$
$$
\begin{align*}
    \lim_{k\to\infty}\|e^{(k+1)}\|=\lim_{k\to\infty}\|x^{(k+1)}-x\|=0
\end{align*}
$$

---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 6.1.3 - Convergenza per Raggio Spettrale (Cond. Nec. e Suff.) [[CNS Convergenza dei Metodi Iterativi.pdf| (CARD)]]

Dato il metodo iterativo
$$
\begin{cases}
    x^{(0)}\in\mathbb{R}^n&&&&(1)\\
    x^{(k+1)}=Px^{(k)}+q&&k\geq 0&&(2)
\end{cases}
$$
> [!NOTE]
>
> Con $P=M^{-1}N$, $\ q=M^{-1}b$, $\ A=M-N$

Se $\rho(P)<1$ allora il metodo e' convergente
> [!NOTE]
>
> Dove $\rho(A) = \max_i|\lambda_i|$ con $\lambda_1, \lambda_2, \dots, \lambda_n$ autovalori di $A$ e' detto **raggio spettrale di $A$**

---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 6.3.1 - Convergenza di Jacobi e Gauss-Seidel [[CS Convergenza di Jacobi e Gauss-Seidel.pdf| (CARD)]]

Data una matrice $A\in\mathbb{R}^{n\times n}$​, se questa e' predominante diagonale allora

> [!NOTE]
>
> Una matrice $A\in\mathbb{R}^{n\times n}$ si dice **predominante diagonale** se $\forall_i\ 1\leq i\leq n\ \ |a_{i,i}| > \sum_{j=1,\ j\neq i}^n|a_{i,j}|$ ovvero: i moduli degli elementi diagonali sono maggiori della somma dei moduli di ogni riga

1. $A$ e' invertibile

2. **Jacobi** e **Gauss-Seidel** sono applicabili

   > [!note]
   >
   > I due metodi sono applicabili se $\forall_i\ 1\leq i\leq n\ \ a_{i,i}\neq0$

3. **Jacobi** e **Gauss-Seidel** sono convergenti

#### Dimostrazione

1. L'invertibilita' di $A$ segue da ***Gershgorin*** infatti vale
   $$
   \begin{align*}
   |0-a_{i,i}| = |a_{i,i}| < \sum_{j=1,\ j\neq i}^n|a_{i,j}| &&&&\forall_i\ 1\leq i\leq n
   \end{align*}
   $$
   Ma per definizione di **predominanza diagonale** le equazioni cosi' costruite non vengono mai verificate, per cui $0\notin\bigcup_{i=1}^nK_i$​

2. L'applicabilita' di **Jacobi** e **Gauss-Seidel** si ha poiche'
   $$
   \begin{align*}
   |a_{i,i}| > \sum_{j=1,\ j\neq i}^n|a_{i,j}| \implies a_{i,i} \neq 0 &&&&\forall_i\ 1\leq i\leq n
   \end{align*}
   $$

   > [!TIP]
   >
   > Prendiamo $|a| > |b| + \dots + |z|$ supponendo che la somma sia $0$ questo implica che $|a|>0 \implies a\neq0$. Infatti una matrice che ha almeno uno $0$ sulla diagonale principale sicuramente **non** e' predominante diagonale. Unendo questo ragionamento all'applicabilita' di Jacobi e GS si ottiene che per $A$​ predominanti diagonali i due metodi sono sempre applicabili

<div style="page-break-after: always; break-after: page;"></div>

3. Per dimostrare la convergenza di **Jacobi** e **Gauss-Seidel** su matrici predominanti diagonali studiamo il polinomio caratteristico della matrice $

   > [!NOTE]
   >
   > - Per Jacobi $M = D$ e $N = L+U$ ($M$ e' la diagonale di $A$, $N$​ quello che resta cambiato di segno) 
   > - Per Gauss-Seidel $M = D - L$ e $N = U$ ($M$ e' la parte triangolare inferiore di $A$, $N$ quello che resta cambiato di segno)
   >
   > Per entrambi $P = M^{-1}N$ 

   $$
   \begin{align*}
   \det(P-\lambda I_n) &= &&&& \text{Polinomio caratteristico di }P\\
   &=\det(M^{-1}N-\lambda MM^{-1}) &&&& \text{Riscrivo $P$ e $I$ in funzione di $M$}\\
   &=\det(M^{-1})\det(N-\lambda M) &&&& \text{Raccoldo e $\det(A*B) = \det(A)*\det(B)$}\\
   &=\det(N-\lambda M) &&&& \text{Il $\det(M^{-1})\neq 0$, cerchiamo lo 0}\\
   \end{align*}
   $$

   Di conseguenza $\lambda \in \mathbb{C}$ e' autovalore di $P$ se e soltanto se $\det(N-\lambda M) = 0$

   **SUPPONIAMO** che $|\lambda| \geq 1$ e dimostriamo che la matrice $\lambda M-N$ (posso cambiare di sengo perche' sto cercando lo $0$) e' predominante diagonale
   $$
   \begin{align*}
   |a_{i,i}| &> \sum_{j=1,\ j\neq i}^n|a_{i,j}| = \underbracket{\sum_{j=1}^{i-1}|a_{i,j}|}_{\text{per $M$}} + \underbracket{\sum_{j=i+1}^{n}|a_{i,j}|}_{\text{per $N$}} &&&&\forall_i\ 1\leq i\leq n\tag{1}\\ \\
   |\lambda||a_{i,i}| &>|\lambda|\sum_{j=1}^{i-1}|a_{i,j}| + |\lambda|\sum_{j=i+1}^{n}|a_{i,j}| &&&& \tag{2}\\
   &> |\lambda|\sum_{j=1}^{i-1}|a_{i,j}| + \sum_{j=i+1}^{n}|a_{i,j}| &&&& \tag{3}\\
   \end{align*}
   $$

   > [!IMPORTANT]
   >
   > $(1)$ spezzo la sommatoria nella parte sotto la diagonale piu' la parte sopra la diagonale
   >
   > $(2)$ moltiplico le componenti per $|\lambda|$ poiche sto lavoranto per $\lambda M-N$
   >
   > $(3)$ eliminando $|\lambda|$​ dalla parte della sovradiagonale rilasso il problema e la disequazione rimane verificata

<div style="page-break-after: always; break-after: page;"></div>

   Riportando quanto trovato sui due metodi ottengo

   - Per **Jacobi**
     $$
     \begin{align*}
     |\lambda a_{i,i}| > \sum_{j=1}^{i-1}|a_{i,j}| + \sum_{j=i+1}^{n}|a_{i,j}|
     \end{align*}
     $$

     > [!iMPORTANT]
     >
     > Ho rimosso $|\lambda|$ sulla prima sommatoria poiche' per Jacobi $M$ e' composta dalla diagonale principale di $A$​ ma nella sommatoria non la considero

   - Per **Gauss-Seidel**
     $$
     \begin{align*}
     |\lambda a_{i,i}| > \sum_{j=1}^{i-1}|\lambda a_{i,j}| + \sum_{j=i+1}^{n}|a_{i,j}|
     \end{align*}
     $$

   > [!CAUTION]
   >
   > Dalle relazioni segue che per $|\lambda| \geq 1$ la matrice $\lambda M -N$ rimande predominante diagonale per chui $\det(\lambda M-N)\neq0$ a differenza di quanto supposto all'inizio. Per cui $|\lambda| \geq 1$ non sono autovalori di $P$ e di conseguenza rimangono solo $|\lambda |<1\implies\rho (P)<1$ e quindi si ha consergenza

---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 10.1.1 - Metodo di Bisezione [[Metodo di Bisezione.pdf| (CARD)]]

> [!CAUTION]
>
> ```matlab
> a(1) = a;
> b(1) = b;
> for k >= 1
> 	c(k) = (a(k) + b(k))/2;
> 	if (f(a(k)) * f(b(k))) <= 0
> 		a(k + 1) = a(k);
> 		b(k + 1) = c(k);
> 	else
> 		a(k + 1) = c(k);
> 		b(k + 1) = b(k);
> 	end
> end
> ```

Sia $f:[a,b]\to \mathbb{R}$ con $f\in C^0([a,b])$ e $f(a)f(b)<0$​, per le successioni generate da metodo di **bisezione** si ha:

> [!NOTE]
>
>  $f\in C^0([a,b])$ indica una funzione continua su $[a,b]$ mentre  $f\in C^{1,2,\dots, \infty}([a,b])$ indica una funzione derivabile $1,2,\dots$ volte o $\infty$ (infinite volte) su $[a,b]$

$$
\begin{align*}
\lim_{k\to\infty}a_k = \lim_{k\to\infty}b_k = \lim_{k\to\infty}c_k=\xi\in[a,b] &&&&\text{con } f(\xi)=0\tag{1}
\end{align*}
$$

#### Dimostrazione

Per costruzione $a_{k+1}\geq a_k$, $b_{k+1}\leq b_k$ e $c_{k} \in [a_k,b_k]\subset[a,b]$. Inoltre $0\leq b_k - a_k\leq (b-a)/2^{k-1}$ e $f(a_k)f(b_k)\leq 0$ per $k\geq 1$​

Segue che $\exists \xi,\ \eta \in [a,b]$​ tali che
$$
\begin{align*}
\lim_{k\to\infty}a_k = \xi&&e&&\lim_{k\to\infty}b_k=\eta\tag{2}
\end{align*}
$$
Confrontando con $(1)$​ per il teorema del confronto si ottiene
$$
\begin{align*}
\xi = \lim_{k\to\infty}a_k = \lim_{k\to\infty}b_k&=\eta\tag{2}\\
&=\lim_{k\to\infty}c_k
\end{align*}
$$
Di conseguenza
$$
\begin{align*}
&\lim_{k\to\infty}f(a_k)f(b_k) =\lim_{k\to\infty}f(\xi)f(\xi) = f(\xi)^2 \leq 0\\ \\ \\
\implies&f(\xi)=0
\end{align*}
$$

> [!IMPORTANT]
>
> L'unico numero che elevato al quadrato fa $0$ e' lo $0$ stesso


---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 10.2.2 - Teorema del Punto Fisso [[Teorema del Punto Fisso.pdf| (CARD)]]

> [!CAUTION]
>
> Il metodo di iterazione funzionale fornito e'
> $$
> \begin{cases}
>     x_0\in[a,b]\\
>     x_{k+1}=g(x_k)&&k\geq0
> \end{cases}
> $$
> Con $g(x)$ funzione **equivalente** di $f(x)$
>
> Data una funzione $f(x)=0$ e $g(x)-x=0$ questa si dicono **equivalenti** se $f(\xi) = 0 \Longleftrightarrow g(\xi) =\xi$ e $\xi$, radice dell'equazione $f(x)=0$, e' detta **punto fisso** di $g(x)$

Sia $g:[a,b]\to \mathbb{R},\ g\in C^1([a,b]),\ g(\xi)=\xi,\ \xi\in(a,b)$. Se $\exists\rho>0$ tale che $|g'(x)|<1\ \forall x\in[\xi-\rho, \xi+\rho]=I_\xi\subset[a,b]$ allora $\forall x_0\in I_\xi$ la successione generata dal metodo di iterazione funzionale soddisfa

1. $x_k\in I_\xi$ per ogni $k\geq 0$
2. $\lim_{k\to\infty}x_k=\xi$

#### Dimostrazione

Dal teorema di Weierstrass essendo $g'(x)$ continua e limitata su $I_\xi$ (intervallo chiuso e limitato) abbiamo
$$
\begin{align*}
\lambda = \max_{k\in I_\xi}|g'(x)|<0\tag{1}
\end{align*}
$$


Pertanto si dimostra che la successione geenerata a dartire da $x_0\in I_\xi$​ soddisfa
$$
\begin{align*}
|x_k-\xi|\leq\lambda^k\rho&&&&k\geq0\tag{2}
\end{align*}
$$

> [!NOTE]
>
> In parole stiamo dicendo che alla k-esima iterazione la distanza tra ila $x$ generata e la soluzione $\xi$ ($|x_k-\xi|$) e' minore $\lambda^k\rho$
>
> Nota bene che $\lambda < 1$ (per $(1)$) e per cui $\lambda^k\to0$ e $\rho$ e' il raggio dell'intorno

Per cui $\lambda^k\rho\leq\rho$ ne segue da $(2)$ che le $x_k$ generate appartengono ad un intorno di $\xi$ piu' piccolo $\implies x_k\in I_\xi$ ovvero il punto 1. del teorema

Poiche' $\lambda^k\to 0$ e $0\leq|x_k-\xi|\leq\lambda^k\rho$ avremo che $0\leq|x_k-\xi|\leq 0$ e quindi $\lim_{k\to\infty}|x_k-\xi|=0$ ovvero il punto 2. del teorema

<div style="page-break-after: always; break-after: page;"></div>

Per dimostrare $(2)$ procediamo per induzione su $k$

1. Per $k=0$ da $x_0\in I_\xi$ si ha
   $$
   \begin{align*}
   |x_k-\xi|\leq\lambda^0\rho=\rho
   \end{align*}
   $$
   Ok per ipotesi $(2)$

2. Assumiamo l'ipotesi vera fino all'indice $k$​, per il teorema di **Lagrange**

   > [!NOTE]
   >
   > Lagrange dice che $f'(\eta)=\frac{f(a)-f(b)}{a-b}$
   >
   > Nel nostro caso $g'(\eta)(x_k-\xi)=\frac{g(x_k)-g(\xi)}{x_k-\xi}(x_k-\xi)=g(x_k)-g(\xi)$

   $$
   \begin{align*}
   |x_{k+1}-\xi| = |g(x_k)-g(\xi)|=|g'(\eta_k)(x_k-\xi)|=|g'(\eta_k)||(x_k-\xi)|
   \end{align*}
   $$

   Per ipotesi induttiva $\eta_k\in I_\xi$ e dunque
   $$
   \begin{align*}
   |x_{k+1}-\xi| = |g'(\eta_k)||(x_k-\xi)| \leq \lambda\lambda^k\rho=\lambda^{k+1}\rho
   \end{align*}
   $$


---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 10.2.3 - Convergenza Locale dei Metodi di Iterazione Funzionale [[Metodi di Iterazione Funzionale.pdf| (CARD)]]

Sia $g:[a,b]\to\mathbb{R},\ g\in C^2([a,b]),\ g(\xi)=\xi,\ \xi\in(a,b)$ se $|g'(\xi)|<1$ allora il metodo e' localmente convergente in $\xi$

#### Dimostrazione

Sia $h:[a,b]\to \mathbb{R},\ h(x)=|g'(x)|-1$.

Si ha che $h\in C^0([a,b]),\ h(\xi) = |g'(\xi)| - 1 < 0$ e dunque per il teorema della permanenza del segno $\exists I_\xi=[\xi-\rho,\xi+\rho]\subset[a,b]$ tale che $h(x) = |g'(x)| - 1<0\ \forall x\in I_\xi$​ 

Pertanto la tesi segue dal teorema 10.2.2


---
<div style="page-break-after: always; break-after: page;"></div>

### Teorema 10.3.1 - Convergenza Locale per Radici Semplici [[Teorema di Convergenza Locale per Tangenti.pdf| (CARD)]]

> [!CAUTION]
>
> Metodo di iterazione fornito (**tangenti**)
> $$
> \begin{cases}
>  x_0\in[a,b]\\
>  x_{k+1}=g(x_k)=x_k-\frac{f(x_k)}{f'(x_k)}&&k\geq0
> \end{cases}
> $$
> 

Sia $f:[a,b]\to\mathbb{R},\ f\in C^2([a,b]),\ f(\xi)=0,\ f'(\xi)\neq0,\ \xi\in(a,b)$

Allora il metodo e' localmente convergente in $\xi$ e $\exists\rho>0$ tale che $\forall x_0\in[\xi-\rho, \xi+\rho]=I_\xi\subset[a,b]$ la successione generata soddisfa

1. $x_k\in I_k$ per ogni $k\geq0$
2. $\lim_{k\to\infty}x_k=\xi$

Se inosltre la successione verifica $x_k\neq\xi,\ k\geq 0$ allora la convergenza e' almeno quadratica
$$
\begin{align*}
\lim_{k\to\infty}\frac{|x_{k+1}-\xi|}{|x_k-\xi|^2}
\end{align*}
$$

#### Dimostrazione

Da $f'(\xi)\neq0$ per il teorema della permanenza del segno segue che $\exists I_{\xi}'=[\xi-\rho',\xi+\rho']\subset[a,b]$ tale che $f'(x)\neq0\ \forall x\in I_\xi'$​

> [!important]
>
> Stiamo dicendo che la derivata nel punto $\xi$ non si annulla e per tali motivi esiste un intorno di $\xi$ in cui la derivata non si annulla

Da questo segue che $g:I'_{\xi}\to \mathbb{R},\ g(x)=x-\frac{f(x)}{f'(x)}$ e' ben definita e soddisfa $g\in C^1(I_\xi')$ con $g'(x)=\frac{f(x)f''(x)}{f'(x)^2}$

Poiche' $g'(\xi)=\frac{f(\xi)f''(\xi)}{f'(\xi)^2}=\frac{0}{f'(x)^2}=0$ (per costruzione di $g'$) i punti 1. e 2. sono verificati dal teorema **10.2.3** (Per $|g'(\xi)|<1$ ok 1., ok 2.)

Per la stima della velocita' di convergenza dallo sviluppo di tailor al secondo ordine
$$
\begin{align*}
&&0=f(\xi)=f(x_k)+f'(x_k)(\xi-x_k)+\frac{f''(\eta_k)(\xi-x_k)^2}{2}\\
\text{SEGUE}&\\
&&x_{k+1}-\xi =\frac{f''(\eta_k)(\xi-x_k)^2}{2f'(x_k)}
\end{align*}
$$
Per continuita' di $f'(x)$ e $f''(x)$
$$
\begin{align*}
\lim_{k\to\infty}\frac{|x_{k+1}-\xi|}{|x_k-\xi|^2} = \left|\frac{f''(\xi)}{2f'(\xi)}\right|\in\mathbb{R}
\end{align*}
$$
