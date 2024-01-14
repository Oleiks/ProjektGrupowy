PGDMP  ;                     |            postgres    16.1    16.1     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    5    postgres    DATABASE     {   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Polish_Poland.1250';
    DROP DATABASE postgres;
                postgres    false            �           0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    4800                        3079    16384 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                   false            �           0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                        false    2            �            1259    16490    grzyby    TABLE     �   CREATE TABLE public.grzyby (
    uuid uuid NOT NULL,
    opis text,
    "zdjęcie" character varying(255),
    nazwa character varying(255),
    czy_jadalne boolean
);
    DROP TABLE public.grzyby;
       public         heap    postgres    false            �            1259    16495 
   odpowiedzi    TABLE     �   CREATE TABLE public.odpowiedzi (
    id uuid NOT NULL,
    content character varying(255),
    is_correct boolean NOT NULL,
    question bigint
);
    DROP TABLE public.odpowiedzi;
       public         heap    postgres    false            �            1259    16498    pytania    TABLE     \   CREATE TABLE public.pytania (
    id bigint NOT NULL,
    content character varying(255)
);
    DROP TABLE public.pytania;
       public         heap    postgres    false            �          0    16490    grzyby 
   TABLE DATA           L   COPY public.grzyby (uuid, opis, "zdjęcie", nazwa, czy_jadalne) FROM stdin;
    public          postgres    false    216   �       �          0    16495 
   odpowiedzi 
   TABLE DATA           G   COPY public.odpowiedzi (id, content, is_correct, question) FROM stdin;
    public          postgres    false    217   qH       �          0    16498    pytania 
   TABLE DATA           .   COPY public.pytania (id, content) FROM stdin;
    public          postgres    false    218   lK       #           2606    16526    grzyby grzyby1_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.grzyby
    ADD CONSTRAINT grzyby1_pkey PRIMARY KEY (uuid);
 =   ALTER TABLE ONLY public.grzyby DROP CONSTRAINT grzyby1_pkey;
       public            postgres    false    216            %           2606    16528    odpowiedzi odpowiedzi_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.odpowiedzi
    ADD CONSTRAINT odpowiedzi_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.odpowiedzi DROP CONSTRAINT odpowiedzi_pkey;
       public            postgres    false    217            '           2606    16530    pytania pytania_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.pytania
    ADD CONSTRAINT pytania_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.pytania DROP CONSTRAINT pytania_pkey;
       public            postgres    false    218            (           2606    16531 &   odpowiedzi fkk09w1oitp9a222lqdbyh986pm    FK CONSTRAINT     �   ALTER TABLE ONLY public.odpowiedzi
    ADD CONSTRAINT fkk09w1oitp9a222lqdbyh986pm FOREIGN KEY (question) REFERENCES public.pytania(id);
 P   ALTER TABLE ONLY public.odpowiedzi DROP CONSTRAINT fkk09w1oitp9a222lqdbyh986pm;
       public          postgres    false    4647    217    218            �      x��}Ɏ������)$�X��%����`����B����d2� �J���	~�^]�1�sߝn�H?I�!F��5Xv�@o����dĉ���!&�t��:��'�p&�(��rN��x*'b>��W�ۋ�"e�&8�:+�E�ġ	v"+�/d��:�XDe���"ؖm��'bhn����/e�b�ƭ��ݛ )��H��eqN����į�?)��$b)�G���ꄏ<��ߊS}��D{���An�� n߽��ձ85���E%���~���A�ʪ��_����,)byH��(��|�� ��NU.�� ��~zx[�7(xf�Z�";ɲ�����f��Sr���_���*��	?�� ���R�9�m�����U+Q�e[d��+m&��6�����t���rx���<����FdU{?�n��;�rT'�3�E8>� �,���e�y�� �<x��'Ke�K�E��SY��k�i_NpW�L�}Qy��VQ�������5Q����_A����C��~j�3=�le�&�sa�����kݏ��v�"�e���)�
n�C+"���a$8�_WT"iqaq�4{�e
�g�ǽ��6�A�Q�OVB�%����^W���J�CeW��!�wV�f�";����Ưa��;�.K�[\l�FV�{s���pII]dek��$��M���[���<��}y�o�%_������pT0�3��딕��i�pzp���\�!1O����vuʢ=�g����T*�©�	p��;@�YA�c_���>�����ўqӶ$�nK>&�Љ+a/�C@8U�GiѦ(�&v����
����qʿ�(�=r��/{�vUT���E-}1H޽��8�r#�N�v/#8yg������m�g��et��%��U�woN�N8�����[��7	,.��`n6��\�[��կ��\�B�2�邿d
T5\���.��13�Q�7xa�mq�o¿�����GCǍx*�9H`�
0�+@��9g���^�N��㻻��/Dr0��2I�mQn��#�vy^����lv�UʽR)��MoǷ�㶣�^�ޛƳ��W�p:���l6Z��r���z5�G��ͫ��YW�9�����RdM\e�����Aɰ.K ;���Ǎ�lZ�-���c?��M���)3ز �(bi����b
����)��R+��ohq�E;ǆ���}}���t�g�)8�x�O�Idxણ��M�7���c��|��|��HdPd�u�&�R[�]��E����4K� ��S�G��x�@�i�HP��� �)��*R4 $�:G�(�b�:>�	86x<� �@Ӹ����'A�7 Z����� ŒM=�/�6ii1˸:�uv�K�1���5F�����,� ��N$���x%Y@; �Ӑx�Ԃ>l��J�L��ђg)'�@�MP�A`)�; �~H�1���	x��*��F�bc�����wn�V팠E߂�fN�w��������-��Vt���]�X/�B>`�y!���0���6�������68֛Mz�~���
@�-��Y"�������P��\�i����aw��!��͉T��/-T6�q�:*�|�A�����d�`Y�|Y��آV�įo�e���~ʄ�RP�-������*�������4)4j�d��a����s�}�����-��=�B g�C�@/�aJW�]j$��ukE���[ZCw���w`�{�Z��9���F��+�
v29X`@�k�DH��'`$���4؈*n
����hb�#cR;W;�-(at9�Pi���l�J��vb1�)�jA���d]���6�H��ظ��������|}�e�7�����$��ֽ��0YM>��I_��0��Y��Wr�	W���y��D�2G�h2O�t�����#�4�Y̨'�c��*'X<�+lv�Hg�lH�e�.8�_��kT�ƹ+p�!�(�5���A�=�{�N�Ρj��N����gF/ �e�s��������#X]� L:�
������)����<�׺���+ҁ�N�q�
=<j{���<>#}|PP^xe���X8��V���5Akd�f |C�J�Ҭ��|3XAЅJ� ��B��<����D���� ���c~���[����a,�$LOc����#��u���.P�O��$Wv���S�.
�?�5 bP�\o�6�Hx78B9������`��S���� ��6�C��}`���6�/4�DҨ���#���w��՚9u\�>�$��h�Z��6�3lR��;䰁m�4Ư ��p%���]
~O�o�3�?Zd0T�h]��E*� ѧ�$ g�U�È���֠�xN�Q4���VN|�tV�]�:��0ct�Q��ج�Q��PҜ`Vʊ#,h���ʷ�o���(ٯ"�>�'�钚�p��Ka1�&@�Ϋ��`�`��1Йt04 �;=5rƴ���w��lwϯ#G�W}��*"ؽ_y�y����y��g8B�V}C����h��H�b��,�W끐��Pi<F�˵��#�#*0B�.!���ʇ�5�`_	@����%o44���d��:U����-�%j%��P�Ep�]6-��DQ��$ʴAs�lr0B���,��[<.�>���`$K�nZ��-����4'f3cI�&�e�˥�'���*m����>׆wbv���KX�c
Mx��W����Y0F��$Z$�p,��p��桘%"�&	�z<����ue`0��؍ҧ���L����|ce5�'N(������Q�h.l�=[��s��ZEaj �迶�"?���)�mYT�;��厼����bF��&��<_��`Eau+A�C�Qi0K��	9�}G�]c9I�.��U6���]� g�V��"��9�R���T�j"�<��4>O�V���[�?�m]�s:#�D�Q����x��T�8�ɰ#�3@�����G�0��S�=M<�&��R�zp�J+Z�w�BY��j\!�)�ڳ���^�w�����S��R��"���e�D����~Cvx��'��C�	�@�$�-ODO�F���	բb�Ǣ�ꕦ*22�	 ��ڴ`Bή9#�����-h��p^a6zE��JS<���Ǩ�N���E�ӓ�K�S>_�2�������A��f����V�L�c�4τ!�D���Yn%Aؤ?VYJ6����:eHx��tG��/��J��,���I^)P��bM��P�U����K�8��|i��!��a���n �*��=�E��vFP��6<�_�,��f��08%w�pL����vg��3���\�1�eB2�I��>:ʷcp�����O��B���j,���wh�Ky�����~�٠:"�x����8�-��p��Q(b1�*��x�������['���n��#&�\�Ƅ<x^Iw�o�c���H�<-
�5X�sv�Ow����=X���&�?�}�;��	)�@!<H�Lp�����h
�V�)�0^,��#.>��0"�#l����C�XT� �)��D�`x�34�$��z���0��qEr�$���?e����(m;e���r,/�M�yh�6�Ijk�,i�*��4w�=a�n�PR��y����E�1�jr��/0Xwbz�C����FZe�����a�V���lo�_��s�c�ѓ�b�w*h�4t��#�F�����ŉ~����0L>�x�����h�����T� {�v�y 0��1�M� ��b�Ql,T9����l��M�6Nw�$����&���:;5w@��f%��d�x����l��M���f��G�d��K�.�� @��7uJ$����%B\��Q5�T�'�6��-x��ߍ�n���Kw�����������3|EMjD"��R�K��Qj�k��Ť]�Ȃm���R�ᯡ�(�w���`FW���x#@��8�ų%��hN����z�a��KX�/Pb�    ���:�1�� N�Z��Z�l9��&U�#�8�?n�PIJ��t���Oz9f�ux�d�Zͨ%����[�><��_D�����L���H�]����5�����:Y���(��0u&�Ҡص�Oa/���%��ݣ|�*�����$Ft"���T���m�f��¸6�%ҭR� s*h�9��5���\�窈��fq������g��o�@/��b4��Y�$h��GQ��:�.gBL�+!�������3� �� {��~[���}��DQA�>RV-��z�7J�>�2�y��&<��L��h�ɋ5�J���E������N>UU�dr���k�\٠��T�k�6�t%Lb<�n�H�	|%��M�3�5�w��0�m�d���b���fG�K~TYx��`@�J��z��8"&DбF��۲�A]�k8����(��9�I]Ao��_2��O0�S�8��!�6�#���Tl��I Ҩ�����Vį�i���լA'��4�����M���@�є{�?�j�	������4'*h��X�	���'��LuX<�?���\,�2��"X�s����+���F�l[=N����0.�d|�I�=�����#)0!����h ǅL�\��|5����T�b2K�d�M�|4���W�0���k	�F`��n�aAK�IHE�hz��l	ؼ&�L)MZf�{!J�uQ��	;������I�+�O�z����.�^�;�tt�bE-�����k*C��O6v��2��DEbu��/�`A?�b�8�a0;�U��pM��<v������������^�������L�w�����j�Q��>'����WC�&$z*8��H��Ȝ̂n� ��'W�֪O�����x��0��*u�T9�2��%�v�NRK���9Ȓ��`f~ ���K�z���QT��nf�����YQ6-�0t�5*����(%�t��c��o`�Yx�mb�$R,0�~�s]�Ϭ��T���x������D��I�N��o�,��;�q�Y�܇�_'����V������N����j.���f:���b&�Y4N��l��d���V�XL�W_PBW*c\fغ~�OOEkl%���pFX���T���5DdiU���n�����\�Pp�v��\�K��#��/:�9N{S�9|P'ѽ��jIKM�Pa�v7Z�R�F�4�Y�)S�Qir�����UU������*�/HŌ��#_9�<$�N��D^�RG�C�S���ֺ�v�8itn��I#�5vr��+�̈^�哝�$�U?0���IV��sS
��Ȳx��rC�=M��8���VpS���"љ)\s��+��՘G7�a�9��J�$�������6��2��[�._s[�â����n��n9����EDT\��:4,�9��Ř��y�'�xm�0�$�p&�p��Da�b)�b13�0NL�.��ڪ�4��t��D ~~V"vөgLn:(�ث��m�5?[k���6+�����Q�&z����3�9�B�p�V��c����TZ��pDf�=nWC�S�j�G@��Q��=��@L`��[�ds�'Ǚ��8�V�=!oHWoi�MU�:��G��8���@QP`���}��	}^M��V�\��+�l$-�������g��$U_]/�؝4��B��#��P��hV��l%?�[W<I��P�#9Z�BQ��}�U[o�T�� ��j�A8���Q��`]���� ��,���t�"��"���5�ҩ�#����c�j�;�G�I˘�z4�h#s�R<���@i]�$:�'���le}l�O#�.A��@ě/Wr/�,��a���<�� �T$�2@�h���4���<�'�"������^oB�K*���O���$n�e𚋌��0ٟu�FQ��X݃n�6)?��=T�'S�Uq:�6�=�L!�A]���2tc���ʤG9�'���T"N4�Ps�J&Y��?"c�&���R�J���合=l�H	����yo��«����k�����I@,��j�$�J�AG�Y�^��5�D�x�Z��}+؃X1	"@�C��U���{ܹ�'�c�+|Cj���@Ш�|�);='N�X������4$4��E�*��D��=�ɂ������ټP�j+��B^��8�s`���JN>p�z�m`��s�z���Ɔ.oHoU�����CFW�"�5i��ir����(��U,��/I�.���A��ޕ1-�)��J�X다��*jO��A<q��	9�̈́�ⶨ�f+��ٹ^����(����7�d�v����1��/�^�J��i�gxU���Z�Z笋8;��H���=m!8V�g-�3�ԥ];�z�ɴ���Z8����>ͳ�=��Vws�	s�?��H�]F�i���B�^,��n��G��j���t=Z۬1�g�	��.����c!�J>���3��	�<�W۶ӭ��-z4k�C-��;
���O;�<32���^N�R�V~��9��G�k}"���P����"���0�P>��k�j��������%���S�n��Us����{(��)��'X�3�"���Meu��Vtd06و�r9�"^'�����x=G�z:N��x��_}�IF�I/��[G�H �����E���N�J�����h�r-&y�,*.�u�an�<e}�D�������c��	)��ʍ[�&N��R�n�ۺ%^�I���RŢ�cJ����:!��䚽�&ۺUyQY�	g��OHs�/��U,�AC�����)c�qzV�%HLZ�拧�m�8��^�+�RYL<�::Ib
u�c"LS3���e}�B*DM��� ��v�4(�P2GhF�8ٺ�xn�gC��B�"�C�n�i%x���~|����N{�Ki'��"�h�G����)�;��S��7.Q�� �%�����D��8r��L�U�,r��(JT�8�ga�O�s/ۈ���Ѣ(󔳖�9��Z�|[��Z�#��]��-�bIZ,pJ���'T�U���&��p�$p$�
+��I�شK��(*�/ߴr�����w£�����Q�1��͎���[���y�X<GC*�nU���\Qi6�T�6	b�ge3�eDH���n.&x痜Z F������Z��Q5؊�!�+H��֐��b���B�)�+()��P�f�5��쪛N�0t�^< `�1:�GI~���E�������A�����S�Pv=�͌)ܼȬ�ۿṚtz7M��۪�sX<���V�G�K������xH�e�A��r�h�	g�U�h�D�(IF����ͫ?������'����J� ���Z��2�kx]��/�㣆zO���8�W�Է��M�Á��?�2�[��1mw,qz*ѐ��2�͉}L}(�T�:6�դ��7��?9�	����A���J��dy'-4�6I0]�()W<���Q��T'ҠxQQ1�G쮕`G2��G����[�vh��4֔�WQc.��\�T�8�#������K�I�����Ѕ
�\癸���6m����w[��^��9��ԽȒ�m\���Vjt�*VB�Vv9�8z�u b���䪔v��I�"9M�pi���_�iX�7q�C�*�-J$��T���T�$<�sf{��,�:���фL�o߽�d �ڼ7���:��p����:���zΣU2�'�u<z�u]��(畳��a�v�@�ȏ.��g]����y
��^�2�[B�^���x������i�m����,8]V7�c�p�yr�gL�)Pxׁ��1����ٰ�:Zub��������r������B{�)`��-��nf�d?���(����Q��W�Y��mt)�n�6�h1��4�C�kԉ$KYD��c&(Fd����*�a�{4����h��<�H�f�K�+7?�րD���;-5�ۃPE�v�l��E���L����ײ2�-	-.v���&=6�)���SZ�ɵ���PS����l�{.����:�ɬTiw��w��C�@�rOknMK�V��ǡ��>��>c L4�    ���k�� Ň+-'u5��^�Ck*���w��4�#�;�l�P`����cJJ�x$%���L�:��D�S�����
��o��M(���~��@��4
Z�j�K^Ī��7�R̪J֤�c%>my�UcH�ƚW�Tn��9԰��F��V��R-��=)=/�@���)v��AB���/�%�z�;`�CJe�� /8 ux ��N���l�\� �n}���B{{������dR��` c*f��~s2�D��"b*��&G�M�V�E�g�p3OƋi����W��Ǭ2���J��x�AFh
�\~ĕ;\oל�c�O����7сg��(宠PK0L�#:�6�@��[ՌX�J$^|p�z� NZ������C�_�N�i�!U�����H��zQg����~[A�4>�o�Q�n��p��`�H�j���e�ɡ��):�a_u�t'�&�w�JHރ�nv>(����;�ELFXnR���ߴ$�T����W�-�c'&�EF���x�m O��XG�פ9�-��"�BD�֗�ٲn�e0&r�U&,<�-�C��!jE��;�"���h\&Z��H��RE6R�!l��t��h���f��&�1v��?�f��2��r4߈0I zg��<��f&7��d:�'�/k0sp_i������r��I��$���9&&��}%u�a�����5Tɛ=5#�v�~)م&�k[�6^����u�SQE��y~=��:R�@q�金�)���uTT7�'l)�s+��B����%��r����B�n���J�l��N�u����v���ϥ�Q��us�DΝ��h��&�
�gd��~�Z5Q�®~���S��D�Qx��"�H�iE�=�s�,:f�%(Y�d��~�����-'�ϠΫt��g���r��l�M�bs:�cl��WD;~2<(&��<��A�X��'�+)�����e�yڐ
��!T]">,�9��2b�8Y�3�<7'��H������^4Л����aJ���h8ܱ�:^/��J�fH�����Ճ)/�׿��\ai�Wv۽�~�Sl�m�]џ�V~/hٴ��L�����~|{<l/����{�Bn���,�,��p&��p5����h1�L�I����МS}��*0y�=.�M5V"��j �Ȭ^��8ԇ��[�P�\~��[�Hi�+0v?��Ы|=0�|�-���ĝ
������yо��w,j�S�ÄG����#&�q�H@�uY���]�K;ƓUo�)h2�}"����?�^ՔR��mtt�!u#��M�q�<�G`��ߊ&բ�dԝ[���*���(m6ls���� |`Bdq�s�8�P6��x�U�c]u-��D��\�R��$��ez?`H̫C�(�>ɿ��.Z�����$B3dGT�k�,f�H�4I����i�u���SU)k4���	+���H b�����t
14x�%�����+W��K@��a�1a[R+�R�;ΰ�S����H�b�����5�̿:9Q�͐M�r"�I%���F��A"{�Ę�sT��l�"É���!5�#����ꉄ쇑���s��)[�f�����Yt��jh�ރ厝����<@��OGr�	�r��U(�(
��X%#�������phN�m ���!���62h����,y趬��*W�W\1j{פ+Y,�F���A�j�Gu.���V�EL��%�7�gJ�?$��[\n��x�qm�m(.�+��5�ȱF/gi������7:�ܽ��R�km8�r�sm�v�v8�Ȧn'��ϝ��If�n����ښv,\k���i�l���*!vtP�{���=r$���NR=eK�~�S M/΍ߴ���k�ۦS���ft����~�@�9�7�qXW��N
��7���uO�dU���g�ǯe�n��lwx@��l���:��h�n4�;�Bt\A!�8�õZ��b��c}�d�5(�4/b��q�8q�v�o�8��W�t�ξeO��X|�����@�I���sL��뚽e1���2:���B	�C&��icA���+�(M��v ;R��:Gb+�\X������t��.eB���U�=rzՂm�,�ՠ�qЀ2;�ca����u]��<��G���<���������@U:]��
|�U�\�C-�h"��|������d5���(�^��Wc�=NA��+ $�P��г쪵L]���.꺈%�b�\���<0����5�E�J�����+����N`�%����FTn���BEPO���'{�s��
�������������QiB7y=P�̖EA�{��l�ۛ��c%�SME�n�=@r2�=���̛aA��=i��ҏ!�G��&x�� �Q�%_�<u��ʂ(C� #���Ie:�y�\_�1;�j�!�J�p���-��jú�75�.���iS����╓{>t\�j=����G	�+�Dbd�Z�8�I�@9�������v
�b���/}]0o�A3Zd� ��2����*3��0m�v\2G\-'�4�]�A(<�H��R�Rx��ѝB�{Ḇ*f���z�$��|N��Y8���P��=�f�^̢x6�W�(� �1���ƽ9���������=�5(	�Cj��K��<Ƚ�T�u�g���M���w���X�1�'��%�aa �r���ET��r�93B�|��3��`�t�'G�V���D���p�����Z�R��µb�h-#Td��N�[۩
�ƽ1��g�{N4�c
&Lѯm�g���
c7�K�č�t�qX ^!�W9���q!wtXG:�GCw2G�7!uY.v���p+�s�q萒K��0���՚�+Ķ	ĺ\�si8~G��-�Ģ�(�vP�M��La0�B�$ΈW����n��n?�TO��=t9Y��`�k>n,�0�E4�N�C,�NM+�,�xI!�����s�ǘ��<x���r�L���9^�6��b���KP���b��~�V�^b�z������K꺗�9���Ο�yƮ.D�;�}-�4����?:���oMp)�}�4ӿ�����Q3�o��vf��։���X��g�-0��*;TL�M�펯Y������44�u�iR��^�?=c�'D%v0QW�\gx�P;�����n}����K
�V�QtW���{��pJ�0�o���������Q����W&�\�`oTu=���X�:TDO�7�}��Q��	R�:B�r`M��Eu���̐f�"��\hN��M��I#<�){���\F,������UD�s_�M�-d���D���������`�`�zA���������������T��p_��t��,t'�FNg��n�p5���*ڄ�h�31���l4���W�)�J2R.�	`��&;Ey��C���(��څy,'s�O��c^���żtѷ�]>@dEp�Y��t�|c��Sg�כ����\��;����G��`�sս!�qY.jIj�o��\={�mS�"�Z�oN��ʶw����-}Q@��8���-�/�r�n�-|I�d�"���nh�2ǎ��zu�Ʃb3������(� 7��Q:�)�v�y퓨.�����-��F�{����wA�wy_M]Zm�.�C�i�H�lwc*�.ڂ�KѵS�N;#"�.AB�9��i�ҁ[|Vն��ga�+
�"�{�x{7L�ĉ�!߉=��vw�8���B���tH�ۂ��E����*����gL�ggs�~�9�ث��2�gy�\���g�Zv_�d�i+��ڥ%C*~-eo��<�L��h9��
�c1���(��sSn{�J�#�j��?�q��-&�L���ȉPۺ�x�e]Qj�#[�)ձ��M�����P�j]��L~�z�|�h�)j�`��s�~�K���	���ܤ��n��EB���H���T*EeI���f���c�)�r�Z��ǪTQ�<W�)AIŵ��47�!?8Y��~>��Nک#t*7R��h��V�(u���4.�&����ٽv����˨Qk�1��o<1�χ�~J�ד�܁��U
�����	aԅW�#��WZ̜G3�z �  l�6��q�6�	��U���폞�;��l��z֩%�͙p�z��L+ީ���.�{�/9��]P�B0��7`lc/��g���M����"(6S��jG]X��R}�7n|�^�cUz�� x�V �]�w3���J�u�t��Ǧ��FG�UT9�tmԆ���/�t�Q��~I�QH��ms~��/vS�e&�0d�k��Ĕ�|�����gk���h~���=f�����)����L��t��E<���C!�4\��#���j4����`c)��R�����MA�<���9�]*��7��%_C��<W�Ri�*���ҵ���71X�ӽ���X�ި�&us�����u��Uu9���m�1����k��U&AJ�$�E�uA��)��%��#ڎ���!xQ��e�Y=yI	=�4���6�c�jS��4tw�f�4ѥ5�u����4ϰ��8��i��(�
Oռ����"�zH	������kݎ��穛��Wo�y̧!C�/p�^Qs�mxR5�[�
��ыy��1��N�p���H�ۗ�����t.W�t���h�k1��M��1KV�v���g��<�o�� �@��w���"��v�>��h�܆b�� X�lֿ�͉�:���OY9�l�j1�{�U�\&P?��Vf���s�{���[sɕ�
���X�_iF� ��|x>�su͆b���Պއ־�����/�q9��-�k}� �>��j8ikyAEF�K��{Xi1���oƜ�ӓ��,^��f1��r�,B!�"\M��8���<v�V�Q��S�����H����,�ˀIS6�tܭ\e\��\L#��/�9����HN�Q$������{ Ј���p������26�Ms�*����C�:��,$�����ܞ**v��^�8.羅�r���ҪJs�u��&�|��C
ֳd9��d��u8K�p=]$�f��q�^��y��˽d�J�x�ȆR����{����!1�؂Ժ�l9��P=R8#{y���~OI[yR��w���1�X���c��ʣv|_{��j�l:�:�՛`�:�{���)lZ�ݤ
����rRp���p0�CE��;���k�� @�����i�]=�û��������9ݧ��[{�/���87�y��B�ܼm�GU�d;N4����n6�2Ig3u^3u��#AЁmcoX�r/7ŧ�.6Cj��������!�t��g�6�w7�m�/��)����%�?�ɻ�h<	ǣp��7�|/0���j>��>����&��ߗ���h��bR}0]�6�M4�x�"lN����{�/���՗�����ҡb�ߕy��S=Q�*��5�)����M%@!X��W�<�'ԫRg�T;��w@E��^��Tg��� �~��0kpQ���2Cvn�l�K���"�g1ج;?!F79�F�u�n�'>	��<�^�4��:�Y;�������T.���c����+N�ր��wÛ̃;��.��\K����;��k�w)T�/}�H��k�����aK�v'uZ 7�҉�&����"ԞL��/��LIVWM
{K��}���+����:T����ŧ.�h`o2P���>"�DR5��.1�>�r���n�t*ϪS����}X�-&
n�8~��ѷ�ʅm:�DO�Į]����O:i�]�?L��Vhl���X���9�E}��HR��������8b�1$l�/�q4[���4
g�M����t�Y�b>I����2���(���Ak���:Ö��^/��3���~�����"�w6Ŀ��s�,tB^~��\���Q� ��ܕ.	�;[*�K�w����tͰ�˫r'<�S2H�P%?�jp�Չj��NЅ� zGD�p�@�rcg��+Lp/�f��O�Z4S�cg��.��C]N}����g���8vt6�N��X)��t4Z�;�����_n�{��d;3�      �   �  x�m�=��F�c��@�������N���W\i�%A�½���ԙ1�rIc�Ɇ��^��'
��}jb��ܡKl�;�:|Z��2����u'��:�����C���@����j��fx:����nS��vY�����P�@����WH�Z�����t��� ����s�%gp�S�b�+cI�J��o��6���\����Z�7����z��u8�h=��${�S���{W�z��|>�ꍧO3��9�Y=�ظ����w�YI�M��kƉMq�y=̋�y�����K]3e�
P78��5����������_ֺȷ��v��m~L�����Ei9G�'3 ��B^����y֋q�$D9zh��r֋��D,��l�!+7��в��1��
��M\��z`��G��G��h]0]3���$%�@-� 	Só,s����:��v=�_e9��e7��D�nm�~�0CF��^��LH�g^f���ۺ��_HnDo]��@M!�����{�h4F�nx�����
1V�YWejz�~@LZ쵷(>��W���yR�4:�Y�cS�;0%M'��V�k�����۔n�#)��heT)�b�hP��u;�E�����M)��r��}3	�/1��R=�{
'��
?�7�XsC}I�+�OZ���;*F�ȹ����HkC�jTMʄ��u��f�����r�. ŎZ@� *Pi�� }�]	��qxR�N�����O�8��}B8      �   �   x�m�=�!�kY�]���T6�-�0̍^�C��M�ak��K㫬nrs�����+�~�e��E����rj��5
-�(�g����NJ����%t\�0������f��qs_��
�"�	:֙.(!	,j�'�����ihM��,��R��*#HnM9�:T�
�\����w�UN��T[Ce� �� ���@��c/}�t�     