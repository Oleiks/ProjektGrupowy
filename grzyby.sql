PGDMP                      {            grzyby    16.1    16.1 	    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16398    grzyby    DATABASE     y   CREATE DATABASE grzyby WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Polish_Poland.1250';
    DROP DATABASE grzyby;
                postgres    false            �            1259    24576    grzyby    TABLE     �   CREATE TABLE public.grzyby (
    uuid uuid NOT NULL,
    opis text,
    "zdjęcie" character varying(255),
    nazwa character varying(255)
);
    DROP TABLE public.grzyby;
       public         heap    postgres    false            �            1259    24593    grzyby1    TABLE     �   CREATE TABLE public.grzyby1 (
    uuid uuid NOT NULL,
    opis text,
    "zdjęcie" character varying(255),
    nazwa character varying(255)
);
    DROP TABLE public.grzyby1;
       public         heap    postgres    false            �          0    24576    grzyby 
   TABLE DATA           ?   COPY public.grzyby (uuid, opis, "zdjęcie", nazwa) FROM stdin;
    public          postgres    false    215   Q       �          0    24593    grzyby1 
   TABLE DATA           @   COPY public.grzyby1 (uuid, opis, "zdjęcie", nazwa) FROM stdin;
    public          postgres    false    216   �2                  2606    24599    grzyby1 grzyby1_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.grzyby1
    ADD CONSTRAINT grzyby1_pkey PRIMARY KEY (uuid);
 >   ALTER TABLE ONLY public.grzyby1 DROP CONSTRAINT grzyby1_pkey;
       public            postgres    false    216            �      x��}K��F��z�+r#Q�]�~�f%JgDQC_j�5�ģ�Q k��j��\�0f�^ŵ�.�t(�������G�/�9_f�fS�\���6bu����<���h.����8�E��>��/g�8
a��ӹ^��	�<�e�]Q��^�ju�iW��U�|k~���w�@==R��,ç��Ὺ~��ZM��n�U��I�Znh3�jG�a��ӯ�^�/�gu��3\��*Q�n�}����y�?5M��ګM���2��p��}ݼ�V��y�^}Z�+STه���H��4R�t��:�K��du��~sx��%����L��~�?������Q�n�6��}��j�7���.�U%z����f4�H}�
k���-Tq��E7��Z�c6���5v �uYŽ�_�q��ő�M���둪�\��pG� ݈x��ٔw�#�57es�:T+�"#��U��\�zV�&O2�1�L+�m�V�Vfs��&G�$�uĐ�Շ/�w�/�>����\�ߘ����>���p�{����wM��d���Ӹ�6L�'���E�M"��SZ��u3\�I�G�)u�y��*�51�]�ߺ����vb����T�}�?J�4��N���k��,�*t�S19��E�{�[����;�_�yQo�o��W��[���D����2� �7�fI��R%���I�*�n�Y��X�M�Z�5�1�.��^���*��A=;q�6��1�����uS6��I([uU6�y��[�yb�K��~�?��8ŕ/�*����"uBq���{������d�(k_F81�G�$O���� ҽJ�r����?�	�J�]{^��h��K�@���y�>�����kYK���X�#���r�2<h�I��r[\�����n�)E^����+9���������l �ek6Eͱ��
��7�b��plR������O�)���?bV~�2�-Ɓ᧽���֚(ę'Xv��5��gK���Q&{��Kîp6ACv�%f|�H�\r���ָ�$/�G�o`�qx��bT�{Wzcc�vy#Zp.ʂC�%j���,���_��r��X;��´3�����Bf���&��T�ܨ}]b7߆	�3�������~������ڝ!N%98�:f�oϥVe6q���%~Op<7�Sh�2HIԟ;��d�R랠��@f��4\������oLaE[�D=%�s�8d����^���.�j4�{�l0G����+�e��4ٖ�1����&17��[���:��N�������P��g���hO06�y�"�A���"��0Ĉ�:��{0�#Yk�}���G^R�v+��+<L�J��J�5�1�=�0{�К��ǆ�ȫ
�`�O�A����v��g\h������w��m�f&��²�ʼu�0�܆�@o��	eww�f[����֙��Q�!@Tg<��3��hx�3�)�'�ת��Z8�s[��a3����i`$y{;!���b�юO�j�jy�;2ؤ@�A��
����b'(���3
�LND�'g�NH��;k��a����؆BcQ��*4�ROŉ�n��%ΰ��^�n��2k���q��Œ'��n+O0���>Fi͐�R��r(�fWG����0�s%�Ngc�]�Ǹ4���>Z]^���x#O�b:����)\/)'�5%<q�y�G��F�u�P�L�Tئb���[������*�E�	GTs2�
g�-��;@i��H��t5�ǿ�	�"��1�g��TbX��z��� ��&QFl��+�j������ET����S�C�'v�B�g�XҊbg"G�Ln��DT�F�l.��1ޚ-ۃ{il��'`�E	��uHd��(�}����foB1o[����t#:��8U·N�[Å�����"���ch�c�d5a����Ycn+�Q�6���"�¯��7���x����1�����$���5$���kQ802���J��V�0/�#��<bcK�����%:�n����w�(����	jX	��(I���{��Gω��律�K�>M�����*e�J���*�%tv�c��{�n��q�K8�����ƪK�1�a�jX3Ql�J��(zS:�+Ν�-�@j��?4o���b�L��w�|��XK����q1�K���ퟲ:#;��"
L�{P��BJ«8�:�%/��M�0������ܑIl��E�bi���J����'r~1���
��6Rl�6�y�8M؎MY��vm�)������8�C$��]�;�{_�+�5�H��P��D��a�.���M�S�$�Z��^qq8���O&j�����U��Ղ�bO�1A��i�$BR˓�����^���jQ�M�3ܹĈHo�M����$��1�����l����;�F�ռ�:I�D1��Uִ�W�͟���m͓V3d�>���(�_�Mi}��(k͘��ٺv2�* Ʈ�يi-�z�@z/�����ĥ���[1��d�/T#��V�Sq1�t�Ax�Kl�f�x�1D-�Yc��9����:�ؽ^�$&�
 �GrQ:�Xm�}r1]|��3�gN�&�ř�^d�<�h���1��:�?Ҋ�;�U޵�A#Xm�%ׯ]ń(n�'��!l��hq3/�v-H��ۨ-Rѐ��Y��˸<���Cn
 f\S�m�@Ǉ�eh;�7����{�~�`��j�c���rš������T}Y�s?���5m�&)%�8;�Zc!V�͑�t�����C!8w��Hbz�A����6�ƌ�� �LR+�2p��2Q(le�?���b�k��V�(lQ�8���,b!��0v�J��������1�m\�c��ѤLbm�6e6s�d2����R�#�tB�����	�#���e@��A[�9�	��"�4ӓ��0*���G#Mn$���Ƈ	|��0d�Ɍ�����ʃo��
р�;�'n2��~�����;�b��� �I�9��a��]1���/ɲ*�a�Y�z'��5�)$�W�ݶ����ڦFGG{�t���L�:�_[�u���Ty|~|�<nӬ�-�����h�]݉f��qt�g���|1/N��X��8�/'��d��S܉Y!�*�b������d)�zX��OA�e���A�=���N&I��X��z���Uz�K�G��)s��Ѽ���j�h��������9�
� v�[�M��H���
+��s%�f���z���C������!�O�/��+�QBp�n` 1����eQo	���ȇ�Ȏ�!��f4�]R�� ^N�lcÆЄ���?!�E�c3�G�L���|�����"�,�\�tU�Q�J�;|��m�5x�<�:����q�VC��hbE����0m��Lx2K7�$ew	��)�\�����{V�|���g�%���R:����҉b�RAi+mE�E��VN'�7k��k-�p��pq����ޭ��/$y����uY&��|�@=Mҷ��S�A}�w�d�ᖒ_!���K�����#��z��L�f��ɝw�N���0���]��gn?~c��o`1�'�6�����{��T��_�������}pw�r����]�䫻w�]�v�y��ٛcQ��/o���0�ޕeX��c�z�?�a�rѬw|����l%��O;�=�m��A�����E�	ԩ�:���}�>5�Y��ɋ��8���䚸��W��B�g.Cq�Àh��b�uw6�0��#1y�����&״�m�/%V~p[����S!��U}Ė66�|���}��G��p�%)V�
_��Ra:�HP�KL6�/M�pS�*-u�V������a��iXe�0\�[��c^!���Ӗ(U��ރa��XK!Ky�A��e�hu�8�T�<�)bћ?z����_غc�l��m���֥"�i��J�Wɛml�=�C?�H :-�ro���YksW�L>�F�.����^���t�/JIsv�ѷr����asq��bh����� �oc�O6������#����h�D���}���MTI��l@�$��yn����Qщҿv��M� 4�*�s3�N�D�6    ʎ��.컂���.=Vc�"�I>�-dd�`�2{&|�05�P�;��Dw:���I��}���2O�R��A&s�r���>�=\R�H/ r����0Xģ��G��Fd_��b厲�Θ�$OD��w�w�D�Λ�9k�]��0���F"���1��1>�/��H�;[:���@�z�����/�E������ F��C`�EIѦ���;���~s�����_���K�}�U\'\�C����8O���lj(���y��O^��_X�l<���.;�{n�0���S'��G��T��2ق�w���越ȼ1R���O�1�wD �T��jME�n���o�W��&R���~�C�4]�u8_�J�ő��ؖH`o�2R:���X�s��x�̠e,���wA�*�L�����X�@�$�뒸z[ml��p��Qj%�H�l���|J���łqt4�n�8���D빅C.h����161�H�U�?��:-`@���!��-��+�*��`UxD��~��/�l
��TQ~5����9�d>AZ�&��|�UQ�i"Am�
ܔ��|խ��Q���c���u�҆
�_G7V0H�=��޽%�<�
�zop�,"�#���%X���7�G�u��Z]�}s����A�#�1B�)p�J��#8�%�9��:?a�~:a�~�J=3S���a�-nJ��#̎b���
����39PX)�U�^4�e��-���V���m��N��'��ƫ�`�wZ����m�y�fc�9Ŕ�W2��vgI_��5e�D��=��6��A(j*��=��#:�����.��Ά�F�1Oa�d]�a����*QY����BB�� ����E@��
,<��
��'Vj���
K)R%�3���z߳�?`��r����竬�_�ܝ/�����E�i���J!����+�^C�Q���^�a��Y�n�jR��%l��ӹ/�8F��j1]PΩ��	>�Qz���q5:�U�."Lo�m�,�M,nkW��`�v��M���`-��Uޓ��,l���p�٬qr;���UxU�{f�곎�pz�#3@��2{KaZ�;�RO 8���A�f_#�I'���F���*�j�J��PwP%��6N��,	�y�	.��j`�����R�C�9�6֐�=-�˸��v{��Crk�)|l�c=9=��F�n�!�zl-"�*�z#�%No�!�ef��ֲS6o�5{�(�>����\���Jg{Z؈ �}�����&0����۹�-Iq-B*%H��j�?�E����o�� ����}���<1�yϮ�E��"K�{��у�m���4����oJռMP�)���u=�}Q��4�AM�x��`����Š�
��?%�ML+' �*��]���o=�<%�X�1|�:i��ؚW�V���D�<v��u[��-D�����<����ӣ^�Wx�~rd�E.���C��e\E���bzq]z~�;vB3�9�b�V�he��-�R�Y>���T#$��a�������|�;R1�,���EFBw�[vU����e*�PJ�g^q��!��"��%��"��b�coD=sJ��T�0A���h�@����Ia��\��[�+����������?�-4y�hn�1�Z��r}1#��=^ݯrZN`�:�$'K���������m� ��A����:�g��D���]�������$�]��0V7���J{w��6�^�V^�|�����1�dk+ʂ�E� $��������e���Z�Z�9�ˊ�G�M�>�o���b�M-g�բ�o��t��Դ�?��#�e|�K�h9��i��6�KZ"s���K?!��rsD����y$T�w�>�dT�|���K򡿤���#k�����MiI�-��Ls{���r���*��QX�;��P}*��+_^��9̋��4���P��t%'�ي�>�#Q-:"�ej��E/f�.��X�>�$��I��ac�n���i��m۵gA����4'xX@$��"AP���J�5���u�����ۄ�VV_�_~av�/>8?{���O߹�m{o^�������d>^��d����l6�&��H�'�/>n�@�7Lӹ������aB���?���z�䫸xO1�C�a��yX��.�ʴk��;uc��߶`�;�ǒ>,O�A��ό�A.����F�5�H��嚼ۍeO�����`�8G�^�3�������?al�Q��'Kg_�۲�vg>OVW�ˣ�m�J}���kw��*���ޕ�U����Y4TlG�'�������=���2����iq�"��j�*����NS��3k��܄�;��¨���J�������ݻ}Yp<^$	ɦ{��U��ܴ����nZ�-;�}U�M�o�NK��&��ۜޝ�w����^!��S�������5�R�,��g2L>���v
RErI��>���*v��Jo�T�PT���ɶ�N���O�	+���F���f��d�hC�06,I����b�xÁ'+,TR�D�m���6�Mx?�E�/�P N�����aO郺�x�Cs��ޫPk���^��Ѩm�i,oRb D%�2&�G�!�k����ߧV[����VO���V�6�$�X"�ȸ�Th�U����m��xna�G�fv�q��M(��X�3dD� �P73|�V�4�����I,�"���*eDؗ�?�KA���=�O���|��Bߥ���F��ۮ��5���`A���D>pq��G�����5�u�-#���Q]��;n3vg�-Jl��H&Uq!�ǐOZ4|a���`,g�[����^�[��ֵ�A6<F�Y;#��X��x&>�PD��4VI/E=��?R�,-�E[]�sS��*L�o���t�׬�������mo_�u[��_��ˮ�u&�e��= ~����LŕM�]�c�NPh�T�ZR�������m������F�!'i��р�y���m�a��ad
�U�(I<��"���	���m��:��t�G��%6��Drjߐ��O¾8 ��D���t�Q!a��!dOo�Y��;�o�7��y�to�n[l�.�YVK�#('���ũ�\�'�f��H2�'E��e�/wy"y��A�n���_F��@��΢j{z�R��t�����\2�nb��z+�G��9|�ј�����ݦx(�g}%�����	�e}q�5�'�E�pc[����3��ZzR\�[�ӦDn+m�~��ꑙ��Yzԋ��n���g��v���{9b�$��~�#�<gv�c�`?�[!�	�p�&�|�U�u|����,�A�B[.��������ϳ��xe�fJ�����ԣ��Kj3A���
�. 6�q�	[�`�$��β1�|
g������ ����$���$]�}����������lV���5����zKO؃�}�ZD�H�t[ԓ�6�6˾L)
�(��4�"����~�[�$�}tȸ��BOֶo�26�_���2�ͩG�
<!�$e�@i� ���Ax��X���`yTG�o�Fn#)/!@�9z�s�S���8��˱�fv���';i@%e�Eΰ���Y�n�}	�pq�돽���J{e�M�f%Cܯ��>ۄ��@¾ZaCv���s��-=��I��v����rp<R+U"2����9�yY�qs��㶨e`I&������0oE�&9gQ�d�'��]�u�	)��̗6� )`=���-[��s��΍@��n����{=�v���ikJ��~�&���S��y�.�ᦗ�2��H��[�c�_i�4��B���ma�-�^��fi�d@�׍�ߘ�5E	�'ص�Z��[-�Ja��~��u!�RfC�k(e�P�0Mh'D6gdLX�,�	���|J�Sl9��d:c�-7;�Rx��:؎��9�fėK�1ℹjn^I�0.`����8���*1iQ��Iv%�.���Mػ��*����+,D^��3���]���0�Ci�9RU;�tY��*�����_�'��!>ArQT`��]�X7���,�n��t�3���ZT��q?�;|Ep�Cy��<ӓ�x�G���xq 
  2	Ɓ>[��g��'�Z��_<�~���/$P��,6 ���b-<V�?��N�y�8|�wvc��^A�=b�n?���y�=T'��=T����,KU��軨�������G��T=<���>���fU��TW򊥳����lR�Ϗdٽ�.S���&��i���Gu!�ݻ[�?Uo�gJ�����WY���<�	ݺ�	c@�P�3���(�4U��tA����¬�{������g8�
"/f�{��go�k�K�.e�������+3dH�S��a�=z5Y�l_-B�P�%,Ը⇁=���Z	�g"��!��z@�]���$���;�6駽�[�A��ٙ�G9�X]G�p9(��}�J����db4|��L-"����L���#���"y�[����*Q5�:+��F�~�]-�i���|�[��Ծ��!QTx�a� !�qH�k��y��d幊�]��y��G<ZgI�-fgقs�gy��I��Z�-��G����v�܊\B��@���gK�L�7ܼ���X��6
�[B��{��;��K�z�'k�[[��X�}���}s�#cL`oZ��pyS������7vp�2�d~:?	��C��c���G'�Ku8�����c/H?�����}�x4�K�ݽ�I�3S�X>�i��TZ,~ܦ6��p�}�b��vxX�$��t�ΞV׆z�O�} a�I%�ZK߁��?��H馒LL��TR�6��]Ȳ�#��A�"�Gr�,����4�WY��c�Tr@�p�XjK�
�_��b2�﯌EF�9Y�S$�}޽e`�<���-bg��3�4d�0<��E���S�����[�ȱ|5��=�,}�����y#���Y����{����
�'lW���+&Ց@��{��X
9L�2k_F�?��%�Eh�3e�=`�*#���b�����-H/J-o������ ��*�$�C	$�2���f�.س��2jͻH���d$m$�����~���̕t�#h�{ưh��d����J}���M�sW��bOH�mB��\���+,��B^\��q��X��領����J4?vw&BLy�M&S�'sHUn�Jcy�q�t0��#��^�A��� ,M�*@eӴ��+��-Hh}M(���g�F�gYݳ���𮬘%����"o�l]o�Z|�@������f�Bl����z��;����5}�5�k��a�G�Z�BZz��B6��.U�#�}���86oɅ���cE� �7��v��g��n����̵�X���d~tQ�x-|N��B�m�&SoW;`}B�
��d	��E�kL47��M,o�z�7U�ד�=�o� mȬR��L�9�(���֎h�8�1Dh�-���@36�Bӽ��=}.��ʹ�`Spi7n�K��s�b���5K%���������:�'=�KQ"�f%/m��Z�l(�l:���P aX��z"�u����ٵ��
���ϛ;@����y��K���ē��"o���5��z���t��.����W��7�y0FV&#������\�`��_�:N�ګ�Iˡ�u(�w�sִ�|Ӧ�0hA*SOv��X��UL��N?)��}�R��Ɲf%�BI�h^Y
�#��B蓄8�xժ:{>�Ǵ-����,i��W��ǝ�|������ܹ�ݛLf��4����l1^�'c���8�]�q�s=�m�m`�����60�F��hm�m`�����60�F��hm�m`���CF[x�����*{Yİ8><Z}���/����1۩M�}oͧ�$^���9;y�q�����y8�g�d�����6��V��jXm�m`�����6��V��jXm�m`�����ն8^,�����%\OPߙM���������wL4��{q0����8^�����l�O��xryv�<��r�8m�m�����6p�N��i8m�m�����6p�N��i8m�m���CN[p\v�'6�.�a���`O�|���Ó�E<��g|W�2�:ԋ�>�exy6_��m`�����6��V��jXm�m`�����6��V��jXm���b�͎g�������s�f����z�@/:�����r>;G��x���x������t�t7��p�y�g�y�g�y�g�y�g�y�g�y�g�y�g�y�g�y~.�������c��?��z	��W!�l�(._��y>����Q��"���D��\O/ǋ�r1^��NƳY��秓0@��@��@��@��@��@��@��@��@���	�����dgB��KX�B�|4����]ߛ���櫩�E8^,&�qp�Ƴ���dr2�ח�3�;�3�;�3�;�3�;�3�;�3�;�3�;�3�;��3�;���U|�#Z#Q�̪�"/���������=7�������6��^��h2;��,/�������r|�O�.ONO�e4����g�z�g�z�g�z�g�z�g�z�g�z�g�z�g�z~6�������Y�H�2X�;�1/���y����ExW�{qt�޽��C�      �      x��}K��F��z�+r#Q�]�~�f%JgDQC_j�5�ģ�Q k��j��\�0f�^ŵ�.�t(�������G�/�9_f�fS�\���6bu����<���h.����8�E��>��/g�8
a��ӹ^��	�<�e�]Q��^�ju�iW��U�|k~���w�@==R��,ç��Ὺ~��ZM��n�U��I�Znh3�jG�a��ӯ�^�/�gu��3\��*Q�n�}����y�?5M��ګM���2��p��}ݼ�V��y�^}Z�+STه���H��4R�t��:�K��du��~sx��%����L��~�?������Q�n�6��}��j�7���.�U%z����f4�H}�
k���-Tq��E7��Z�c6���5v �uYŽ�_�q��ő�M���둪�\��pG� ݈x��ٔw�#�57es�:T+�"#��U��\�zV�&O2�1�L+�m�V�Vfs��&G�$�uĐ�Շ/�w�/�>����\�ߘ����>���p�{����wM��d���Ӹ�6L�'���E�M"��SZ��u3\�I�G�)u�y��*�51�]�ߺ����vb����T�}�?J�4��N���k��,�*t�S19��E�{�[����;�_�yQo�o��W��[���D����2� �7�fI��R%���I�*�n�Y��X�M�Z�5�1�.��^���*��A=;q�6��1�����uS6��I([uU6�y��[�yb�K��~�?��8ŕ/�*����"uBq���{������d�(k_F81�G�$O���� ҽJ�r����?�	�J�]{^��h��K�@���y�>�����kYK���X�#���r�2<h�I��r[\�����n�)E^����+9���������l �ek6Eͱ��
��7�b��plR������O�)���?bV~�2�-Ɓ᧽���֚(ę'Xv��5��gK���Q&{��Kîp6ACv�%f|�H�\r���ָ�$/�G�o`�qx��bT�{Wzcc�vy#Zp.ʂC�%j���,���_��r��X;��´3�����Bf���&��T�ܨ}]b7߆	�3�������~������ڝ!N%98�:f�oϥVe6q���%~Op<7�Sh�2HIԟ;��d�R랠��@f��4\������oLaE[�D=%�s�8d����^���.�j4�{�l0G����+�e��4ٖ�1����&17��[���:��N�������P��g���hO06�y�"�A���"��0Ĉ�:��{0�#Yk�}���G^R�v+��+<L�J��J�5�1�=�0{�К��ǆ�ȫ
�`�O�A����v��g\h������w��m�f&��²�ʼu�0�܆�@o��	eww�f[����֙��Q�!@Tg<��3��hx�3�)�'�ת��Z8�s[��a3����i`$y{;!���b�юO�j�jy�;2ؤ@�A��
����b'(���3
�LND�'g�NH��;k��a����؆BcQ��*4�ROŉ�n��%ΰ��^�n��2k���q��Œ'��n+O0���>Fi͐�R��r(�fWG����0�s%�Ngc�]�Ǹ4���>Z]^���x#O�b:����)\/)'�5%<q�y�G��F�u�P�L�Tئb���[������*�E�	GTs2�
g�-��;@i��H��t5�ǿ�	�"��1�g��TbX��z��� ��&QFl��+�j������ET����S�C�'v�B�g�XҊbg"G�Ln��DT�F�l.��1ޚ-ۃ{il��'`�E	��uHd��(�}����foB1o[����t#:��8U·N�[Å�����"���ch�c�d5a����Ycn+�Q�6���"�¯��7���x����1�����$���5$���kQ802���J��V�0/�#��<bcK�����%:�n����w�(����	jX	��(I���{��Gω��律�K�>M�����*e�J���*�%tv�c��{�n��q�K8�����ƪK�1�a�jX3Ql�J��(zS:�+Ν�-�@j��?4o���b�L��w�|��XK����q1�K���ퟲ:#;��"
L�{P��BJ«8�:�%/��M�0������ܑIl��E�bi���J����'r~1���
��6Rl�6�y�8M؎MY��vm�)������8�C$��]�;�{_�+�5�H��P��D��a�.���M�S�$�Z��^qq8���O&j�����U��Ղ�bO�1A��i�$BR˓�����^���jQ�M�3ܹĈHo�M����$��1�����l����;�F�ռ�:I�D1��Uִ�W�͟���m͓V3d�>���(�_�Mi}��(k͘��ٺv2�* Ʈ�يi-�z�@z/�����ĥ���[1��d�/T#��V�Sq1�t�Ax�Kl�f�x�1D-�Yc��9����:�ؽ^�$&�
 �GrQ:�Xm�}r1]|��3�gN�&�ř�^d�<�h���1��:�?Ҋ�;�U޵�A#Xm�%ׯ]ń(n�'��!l��hq3/�v-H��ۨ-Rѐ��Y��˸<���Cn
 f\S�m�@Ǉ�eh;�7����{�~�`��j�c���rš������T}Y�s?���5m�&)%�8;�Zc!V�͑�t�����C!8w��Hbz�A����6�ƌ�� �LR+�2p��2Q(le�?���b�k��V�(lQ�8���,b!��0v�J��������1�m\�c��ѤLbm�6e6s�d2����R�#�tB�����	�#���e@��A[�9�	��"�4ӓ��0*���G#Mn$���Ƈ	|��0d�Ɍ�����ʃo��
р�;�'n2��~�����;�b��� �I�9��a��]1���/ɲ*�a�Y�z'��5�)$�W�ݶ����ڦFGG{�t���L�:�_[�u���Ty|~|�<nӬ�-�����h�]݉f��qt�g���|1/N��X��8�/'��d��S܉Y!�*�b������d)�zX��OA�e���A�=���N&I��X��z���Uz�K�G��)s��Ѽ���j�h��������9�
� v�[�M��H���
+��s%�f���z���C������!�O�/��+�QBp�n` 1����eQo	���ȇ�Ȏ�!��f4�]R�� ^N�lcÆЄ���?!�E�c3�G�L���|�����"�,�\�tU�Q�J�;|��m�5x�<�:����q�VC��hbE����0m��Lx2K7�$ew	��)�\�����{V�|���g�%���R:����҉b�RAi+mE�E��VN'�7k��k-�p��pq����ޭ��/$y����uY&��|�@=Mҷ��S�A}�w�d�ᖒ_!���K�����#��z��L�f��ɝw�N���0���]��gn?~c��o`1�'�6�����{��T��_�������}pw�r����]�䫻w�]�v�y��ٛcQ��/o���0�ޕeX��c�z�?�a�rѬw|����l%��O;�=�m��A�����E�	ԩ�:���}�>5�Y��ɋ��8���䚸��W��B�g.Cq�Àh��b�uw6�0��#1y�����&״�m�/%V~p[����S!��U}Ė66�|���}��G��p�%)V�
_��Ra:�HP�KL6�/M�pS�*-u�V������a��iXe�0\�[��c^!���Ӗ(U��ރa��XK!Ky�A��e�hu�8�T�<�)bћ?z����_غc�l��m���֥"�i��J�Wɛml�=�C?�H :-�ro���YksW�L>�F�.����^���t�/JIsv�ѷr����asq��bh����� �oc�O6������#����h�D���}���MTI��l@�$��yn����Qщҿv��M� 4�*�s3�N�D�6    ʎ��.컂���.=Vc�"�I>�-dd�`�2{&|�05�P�;��Dw:���I��}���2O�R��A&s�r���>�=\R�H/ r����0Xģ��G��Fd_��b厲�Θ�$OD��w�w�D�Λ�9k�]��0���F"���1��1>�/��H�;[:���@�z�����/�E������ F��C`�EIѦ���;���~s�����_���K�}�U\'\�C����8O���lj(���y��O^��_X�l<���.;�{n�0���S'��G��T��2ق�w���越ȼ1R���O�1�wD �T��jME�n���o�W��&R���~�C�4]�u8_�J�ő��ؖH`o�2R:���X�s��x�̠e,���wA�*�L�����X�@�$�뒸z[ml��p��Qj%�H�l���|J���łqt4�n�8���D빅C.h����161�H�U�?��:-`@���!��-��+�*��`UxD��~��/�l
��TQ~5����9�d>AZ�&��|�UQ�i"Am�
ܔ��|խ��Q���c���u�҆
�_G7V0H�=��޽%�<�
�zop�,"�#���%X���7�G�u��Z]�}s����A�#�1B�)p�J��#8�%�9��:?a�~:a�~�J=3S���a�-nJ��#̎b���
����39PX)�U�^4�e��-���V���m��N��'��ƫ�`�wZ����m�y�fc�9Ŕ�W2��vgI_��5e�D��=��6��A(j*��=��#:�����.��Ά�F�1Oa�d]�a����*QY����BB�� ����E@��
,<��
��'Vj���
K)R%�3���z߳�?`��r����竬�_�ܝ/�����E�i���J!����+�^C�Q���^�a��Y�n�jR��%l��ӹ/�8F��j1]PΩ��	>�Qz���q5:�U�."Lo�m�,�M,nkW��`�v��M���`-��Uޓ��,l���p�٬qr;���UxU�{f�곎�pz�#3@��2{KaZ�;�RO 8���A�f_#�I'���F���*�j�J��PwP%��6N��,	�y�	.��j`�����R�C�9�6֐�=-�˸��v{��Crk�)|l�c=9=��F�n�!�zl-"�*�z#�%No�!�ef��ֲS6o�5{�(�>����\���Jg{Z؈ �}�����&0����۹�-Iq-B*%H��j�?�E����o�� ����}���<1�yϮ�E��"K�{��у�m���4����oJռMP�)���u=�}Q��4�AM�x��`����Š�
��?%�ML+' �*��]���o=�<%�X�1|�:i��ؚW�V���D�<v��u[��-D�����<����ӣ^�Wx�~rd�E.���C��e\E���bzq]z~�;vB3�9�b�V�he��-�R�Y>���T#$��a�������|�;R1�,���EFBw�[vU����e*�PJ�g^q��!��"��%��"��b�coD=sJ��T�0A���h�@����Ia��\��[�+����������?�-4y�hn�1�Z��r}1#��=^ݯrZN`�:�$'K���������m� ��A����:�g��D���]�������$�]��0V7���J{w��6�^�V^�|�����1�dk+ʂ�E� $��������e���Z�Z�9�ˊ�G�M�>�o���b�M-g�բ�o��t��Դ�?��#�e|�K�h9��i��6�KZ"s���K?!��rsD����y$T�w�>�dT�|���K򡿤���#k�����MiI�-��Ls{���r���*��QX�;��P}*��+_^��9̋��4���P��t%'�ي�>�#Q-:"�ej��E/f�.��X�>�$��I��ac�n���i��m۵gA����4'xX@$��"AP���J�5���u�����ۄ�VV_�_~av�/>8?{���O߹�m{o^�������d>^��d����l6�&��H�'�/>n�@�7Lӹ������aB���?���z�䫸xO1�C�a��yX��.�ʴk��;uc��߶`�;�ǒ>,O�A��ό�A.����F�5�H��嚼ۍeO�����`�8G�^�3�������?al�Q��'Kg_�۲�vg>OVW�ˣ�m�J}���kw��*���ޕ�U����Y4TlG�'�������=���2����iq�"��j�*����NS��3k��܄�;��¨���J�������ݻ}Yp<^$	ɦ{��U��ܴ����nZ�-;�}U�M�o�NK��&��ۜޝ�w����^!��S�������5�R�,��g2L>���v
RErI��>���*v��Jo�T�PT���ɶ�N���O�	+���F���f��d�hC�06,I����b�xÁ'+,TR�D�m���6�Mx?�E�/�P N�����aO郺�x�Cs��ޫPk���^��Ѩm�i,oRb D%�2&�G�!�k����ߧV[����VO���V�6�$�X"�ȸ�Th�U����m��xna�G�fv�q��M(��X�3dD� �P73|�V�4�����I,�"���*eDؗ�?�KA���=�O���|��Bߥ���F��ۮ��5���`A���D>pq��G�����5�u�-#���Q]��;n3vg�-Jl��H&Uq!�ǐOZ4|a���`,g�[����^�[��ֵ�A6<F�Y;#��X��x&>�PD��4VI/E=��?R�,-�E[]�sS��*L�o���t�׬�������mo_�u[��_��ˮ�u&�e��= ~����LŕM�]�c�NPh�T�ZR�������m������F�!'i��р�y���m�a��ad
�U�(I<��"���	���m��:��t�G��%6��Drjߐ��O¾8 ��D���t�Q!a��!dOo�Y��;�o�7��y�to�n[l�.�YVK�#('���ũ�\�'�f��H2�'E��e�/wy"y��A�n���_F��@��΢j{z�R��t�����\2�nb��z+�G��9|�ј�����ݦx(�g}%�����	�e}q�5�'�E�pc[����3��ZzR\�[�ӦDn+m�~��ꑙ��Yzԋ��n���g��v���{9b�$��~�#�<gv�c�`?�[!�	�p�&�|�U�u|����,�A�B[.��������ϳ��xe�fJ�����ԣ��Kj3A���
�. 6�q�	[�`�$��β1�|
g������ ����$���$]�}����������lV���5����zKO؃�}�ZD�H�t[ԓ�6�6˾L)
�(��4�"����~�[�$�}tȸ��BOֶo�26�_���2�ͩG�
<!�$e�@i� ���Ax��X���`yTG�o�Fn#)/!@�9z�s�S���8��˱�fv���';i@%e�Eΰ���Y�n�}	�pq�돽���J{e�M�f%Cܯ��>ۄ��@¾ZaCv���s��-=��I��v����rp<R+U"2����9�yY�qs��㶨e`I&������0oE�&9gQ�d�'��]�u�	)��̗6� )`=���-[��s��΍@��n����{=�v���ikJ��~�&���S��y�.�ᦗ�2��H��[�c�_i�4��B���ma�-�^��fi�d@�׍�ߘ�5E	�'ص�Z��[-�Ja��~��u!�RfC�k(e�P�0Mh'D6gdLX�,�	���|J�Sl9��d:c�-7;�Rx��:؎��9�fėK�1ℹjn^I�0.`����8���*1iQ��Iv%�.���Mػ��*����+,D^��3���]���0�Ci�9RU;�tY��*�����_�'��!>ArQT`��]�X7���,�n��t�3���ZT��q?�;|Ep�Cy��<ӓ�x�G���xq 
  2	Ɓ>[��g��'�Z��_<�~���/$P��,6 ���b-<V�?��N�y�8|�wvc��^A�=b�n?���y�=T'��=T����,KU��軨�������G��T=<���>���fU��TW򊥳����lR�Ϗdٽ�.S���&��i���Gu!�ݻ[�?Uo�gJ�����WY���<�	ݺ�	c@�P�3���(�4U��tA����¬�{������g8�
"/f�{��go�k�K�.e�������+3dH�S��a�=z5Y�l_-B�P�%,Ը⇁=���Z	�g"��!��z@�]���$���;�6駽�[�A��ٙ�G9�X]G�p9(��}�J����db4|��L-"����L���#���"y�[����*Q5�:+��F�~�]-�i���|�[��Ծ��!QTx�a� !�qH�k��y��d幊�]��y��G<ZgI�-fgقs�gy��I��Z�-��G����v�܊\B��@���gK�L�7ܼ���X��6
�[B��{��;��K�z�'k�[[��X�}���}s�#cL`oZ��pyS������7vp�2�d~:?	��C��c���G'�Ku8�����c/H?�����}�x4�K�ݽ�I�3S�X>�i��TZ,~ܦ6��p�}�b��vxX�$��t�ΞV׆z�O�} a�I%�ZK߁��?��H馒LL��TR�6��]Ȳ�#��A�"�Gr�,����4�WY��c�Tr@�p�XjK�
�_��b2�﯌EF�9Y�S$�}޽e`�<���-bg��3�4d�0<��E���S�����[�ȱ|5��=�,}�����y#���Y����{����
�'lW���+&Ց@��{��X
9L�2k_F�?��%�Eh�3e�=`�*#���b�����-H/J-o������ ��*�$�C	$�2���f�.س��2jͻH���d$m$�����~���̕t�#h�{ưh��d����J}���M�sW��bOH�mB��\���+,��B^\��q��X��領����J4?vw&BLy�M&S�'sHUn�Jcy�q�t0��#��^�A��� ,M�*@eӴ��+��-Hh}M(���g�F�gYݳ���𮬘%����"o�l]o�Z|�@������f�Bl����z��;����5}�5�k��a�G�Z�BZz��B6��.U�#�}���86oɅ���cE� �7��v��g��n����̵�X���d~tQ�x-|N��B�m�&SoW;`}B�
��d	��E�kL47��M,o�z�7U�ד�=�o� mȬR��L�9�(���֎h�8�1Dh�-���@36�Bӽ��=}.��ʹ�`Spi7n�K��s�b���5K%���������:�'=�KQ"�f%/m��Z�l(�l:���P aX��z"�u����ٵ��
���ϛ;@����y��K���ē��"o���5��z���t��.����W��7�y0FV&#������\�`��_�:N�ګ�Iˡ�u(�w�sִ�|Ӧ�0hA*SOv��X��UL��N?)��}�R��Ɲf%�BI�h^Y
�#��B蓄8�xժ:{>�Ǵ-����,i��W��ǝ�|������ܹ�ݛLf��4����l1^�'c���8�]�q�s=�m�m`�����60�F��hm�m`�����60�F��hm�m`���CF[x�����*{Yİ8><Z}���/����1۩M�}oͧ�$^���9;y�q�����y8�g�d�����6��V��jXm�m`�����6��V��jXm�m`�����ն8^,�����%\OPߙM���������wL4��{q0����8^�����l�O��xryv�<��r�8m�m�����6p�N��i8m�m�����6p�N��i8m�m���CN[p\v�'6�.�a���`O�|���Ó�E<��g|W�2�:ԋ�>�exy6_��m`�����6��V��jXm�m`�����6��V��jXm���b�͎g�������s�f����z�@/:�����r>;G��x���x������t�t7��p�y�g�y�g�y�g�y�g�y�g�y�g�y�g�y�g�y~.�������c��?��z	��W!�l�(._��y>����Q��"���D��\O/ǋ�r1^��NƳY��秓0@��@��@��@��@��@��@��@��@���	�����dgB��KX�B�|4����]ߛ���櫩�E8^,&�qp�Ƴ���dr2�ח�3�;�3�;�3�;�3�;�3�;�3�;�3�;�3�;��3�;���U|�#Z#Q�̪�"/���������=7�������6��^��h2;��,/�������r|�O�.ONO�e4����g�z�g�z�g�z�g�z�g�z�g�z�g�z�g�z~6�������Y�H�2X�;�1/���y����ExW�{qt�޽��C�     