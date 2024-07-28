---
CORSO: Fisica
CFU: "6"
PROF: Rossini
---
# Prerequisiti Matematici
## Sistemi di Riferimento
### Sistemi Mono-Dimensionali (1D)
Per specificare la posizione di un punto su **una retta**:
Si scegli arbitrariamente un punto della retta $O$ come origine del riferimento e si fissa, sempre in maniera arbitraria un verso (indicato dalla freccia)

![[retta-sistemi-1d]]

Si può' misurare la **distanza** tra i punti $P_1\leftrightarrow A$ indicandone il valore con $d_1$ e tra i punti $A\leftrightarrow P_2$ indicandone il valore con $d_2$. Seguendo il riferimento della freccia avremo che $d_1\leq 0$ (quindi con **segno negativo**) poiché' viene prima di $A$ e $d_2\geq0$ poiché' viene dopo $A$.

### Sistemi Bi-Dimensionali (2D)
Per specificare la posizione di un punto **sul piano**:
Introduciamo un **sistema cartesiano** formato da due assi orientati **perpendicolari** tra loro, asse $x$ e asse $y$

![[piano-cartesiano-sistemi-2d-1]]

Le **origini** dei due assi sono fissate in modo da coincidere con la loro intersezione.
L'**orientamento** dell'asse $y$ viene scelta in modo che l'asse $x$ se ruotato di $90^\circ$ in senso antiorario si sovrappone all'asse **y**

#### Sistema Cartesiano
La posizione di un generico punto $P$ sul piano viene determinata da una coppia di valori $(x,y)$ detta **coppia ordinata** dove $x$ rappresenta la proiezione sull'asse $x$ del punto e $y$ la proiezione sull'asse delle $y$

![[piano-cartesiano-sistemi-2d-2]]

>[!NOTE]
>L'angolo individua la **fazione di piano delimitato da due semirette che dipartono dalla stessa origine $O$**.
Per misurare l'angolo si costruisce una circonferenza con centro in $O$ e raggio arbitrario $r$ e si misura quindi **l'arco** delimitato dall'angolo da misurare
>
>![[angoli-sistemi-2d]]
>
La **misura dell'angolo $\alpha$** e' data da rapporto tra la lunghezza dell'arco e il raggio della circonferenza quindi $\alpha = \frac{l}{r}$ ($360^\circ:2\pi=\text{grad}:\text{rad}$)
#### Rappresentazione Polare
Alternativamente al [[#Sistema Cartesiano]] la posizione del punto $P$ nel piano viene univocamente determinata dalla coppia $(r,\theta)$ dove $r$ e' la distanza di $P$ dall'origine e $\theta$ e' l'angolo che la retta passante per $O$ e $P$ sottende insieme all'asse $x$

![[rappresentazione-polare-sistemi-2d]]

#### Equivalenza delle rappresentazioni
Le due rappresentazioni viste sono equivalenti
- $P\equiv (x,y)$
- $P\equiv (r,\theta)$ 
**Da Polari a Cartesiane**
$$
\begin{align*}
x=&r\cos(\theta)\\
y=&r\sin(\theta)
\end{align*}
$$
**Da Cartesiane a Polari**
$$
\begin{align*}
r^2=x^2+y^2&&r\in[0,\infty]&&\theta\in[0,2\pi]
\end{align*}
$$
$$
\begin{align*}
x>0:&\theta=\arctan\left(\frac{y}{x}\right)\\
x<0:&\theta=\arctan\left(\frac{y}{x}\right)+\pi\\ \\
x=0:&
\begin{cases}
\theta = \frac{\pi}{2}&y>0\\
\theta = \frac{3\pi}{2}&y<0
\end{cases}
\end{align*}
$$
### Sistemi Tri-Dimensionali (3D)
Per specificare la posizione di un punto nello spazio viene utilizzato il [[#Sistema Cartesiano]] a  dimensioni e quindi $P\equiv(x,y,z)$

![[piano-cartesiano-3d]]

## Concetto di Derivata
Omesso

## Concetto di Integrale
Omesso