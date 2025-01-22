---
CORSO: Fisica
CFU: "6"
PROF: Rossini
---
# Cinematica del Punto Materiale 1
## Vettore Posizione e Traiettoria del Punto
#### Vettore Posizione
La **cinematica** descrive il moto di un punto materiale. Definito come:
$$
\vec r(t) = \vec{OP}(t) = x(t)\hat i+z(t)\hat j+z(t)\hat k
$$
Ovvero lo come le componenti del vettore $\vec{OP}$ (**O**rigine-**P**unto) cambiano nel tempo.
$\vec r(t)$ e' detto raggio vettore o **vettore posizione**. L'insieme dei punti **P** nel tempo tracciano la traiettoria nello spazio.
#### Vettore Spostamento
Se valutiamo la posizione in due istanti di tempo $t_1$ e $t_2$ possiamo ottenere anche il **vettore spostamento** $\vec s(t)=\Delta \vec r = \vec r(t_1)+\vec r(t_2)$
![[vettore-spostamento]]
#### Traiettoria
Considerando istanti successivi, con successivi spostamenti descriviamo **l'intera traiettoria** al variare del tempo
$$
\vec r(t) = \vec r(0)+\sum_i\Delta\vec r(i)
$$
![[traiettoria]]
## Velocità media istantanea
#### Velocità Media
Si definisce il vettore di **velocità media** come il rapporto fra lo spostamento e l'intervallo di tempo
$$
\left<\vec v\right> = \vec v_m(t_1,t_2)=\frac{\vec r(t_2)-\vec r(t_1)}{t_2-t_1}=\frac{\Delta\vec r}{\Delta t}
$$
Ovvero lo spostamento nel tempo trascorso
**Unita' di misura**: $ms^{-1}$

Pertanto la velocità media dipende dall'intervallo di valutazione e non tiene conto delle posizioni e delle variazioni intermedie.
![[velocita'-media-problema-posizione.png]]
in questo esempio
$$
\begin{align*}
\vec v_m(t_1,t_2) = \frac{L}{t_2-t_1}\hat i &&&&&&&& \vec v_m(t_1, t_3) = 0
\end{align*}
$$
#### Velocità Istantanea
Fissiamo quindi in tempo di riferimento $t_1$ e consideriamo un $t_2=t+ \Delta t$ con delta piccolo, otteniamo la **velocità istantanea** in $t$ definita come derivata dello spostamento rispetto al tempo
$$
\lim_{t_2\to t_1}\frac{\vec r(t_2)-\vec r(t_1)}{t_2-t_1}=\lim_{\Delta t\to 0}\frac{\vec r(t+\Delta t)-\vec r(t)}{\Delta t}=\lim_{\Delta t\to 0}\frac{\Delta \vec r}{\Delta t}=\frac{d\vec r(t)}{dt}=\vec v(t)
$$

La velocità istantanea e' un vettore di spostamento infinitesimo ($\Delta \vec r\to 0$) pertanto risulta tangente alla traiettoria al tempo $t$
$$
\begin{align*}
\vec v_m(t_1,t_2)\ ||\ \Delta \vec r&&&&\vec v(t)\ ||\ \hat t
\end{align*}
$$
Le **componenti** $\vec v(t)$ sono le derivate delle componenti del vettore posizione.
## Accelerazione media e istantanea
#### Accelerazione Media
#### Accelerazione Istantanea
## Legge Oraria del Moto
## Casi Particolari Monodimensionali