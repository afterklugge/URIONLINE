	.file	"p17.cpp"
	.intel_syntax noprefix
	.section .rdata,"dr"
__ZStL19piecewise_construct:
	.space 1
.lcomm __ZStL8__ioinit,1,1
	.def	___main;	.scl	2;	.type	32;	.endef
LC0:
	.ascii "division by 0\0"
LC1:
	.ascii " / \0"
LC2:
	.ascii " = \0"
LC3:
	.ascii " % \0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
	lea	ecx, [esp+4]
	and	esp, -16
	push	DWORD PTR [ecx-4]
	push	ebp
	mov	ebp, esp
	push	esi
	push	ebx
	push	ecx
	sub	esp, 44
	call	___main
L5:
	lea	eax, [ebp-28]
	mov	DWORD PTR [esp], eax
	mov	ecx, OFFSET FLAT:__ZSt3cin
	call	__ZNSirsERi
	sub	esp, 4
	mov	edx, eax
	lea	eax, [ebp-32]
	mov	DWORD PTR [esp], eax
	mov	ecx, edx
	call	__ZNSirsERi
	sub	esp, 4
	mov	edx, DWORD PTR [eax]
	sub	edx, 12
	mov	edx, DWORD PTR [edx]
	add	eax, edx
	mov	ecx, eax
	call	__ZNKSt9basic_iosIcSt11char_traitsIcEEcvbEv
	test	al, al
	je	L2
	mov	eax, DWORD PTR [ebp-32]
	test	eax, eax
	jne	L3
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC0
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4cout
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
	mov	ecx, eax
	call	__ZNSolsEPFRSoS_E
	sub	esp, 4
	jmp	L4
L3:
	mov	eax, DWORD PTR [ebp-28]
	mov	ebx, DWORD PTR [ebp-32]
	cdq
	idiv	ebx
	mov	esi, eax
	mov	ebx, DWORD PTR [ebp-32]
	mov	eax, DWORD PTR [ebp-28]
	mov	DWORD PTR [esp], eax
	mov	ecx, OFFSET FLAT:__ZSt4cout
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC1
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], ebx
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC2
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], esi
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
	mov	ecx, eax
	call	__ZNSolsEPFRSoS_E
	sub	esp, 4
	mov	eax, DWORD PTR [ebp-28]
	mov	ecx, DWORD PTR [ebp-32]
	cdq
	idiv	ecx
	mov	esi, edx
	mov	ebx, DWORD PTR [ebp-32]
	mov	eax, DWORD PTR [ebp-28]
	mov	DWORD PTR [esp], eax
	mov	ecx, OFFSET FLAT:__ZSt4cout
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC3
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], ebx
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC2
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], esi
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
	mov	ecx, eax
	call	__ZNSolsEPFRSoS_E
	sub	esp, 4
L4:
	jmp	L5
L2:
	mov	eax, 0
	lea	esp, [ebp-12]
	pop	ecx
	pop	ebx
	pop	esi
	pop	ebp
	lea	esp, [ecx-4]
	ret
	.def	___tcf_0;	.scl	3;	.type	32;	.endef
___tcf_0:
	push	ebp
	mov	ebp, esp
	sub	esp, 8
	mov	ecx, OFFSET FLAT:__ZStL8__ioinit
	call	__ZNSt8ios_base4InitD1Ev
	leave
	ret
	.def	__Z41__static_initialization_and_destruction_0ii;	.scl	3;	.type	32;	.endef
__Z41__static_initialization_and_destruction_0ii:
	push	ebp
	mov	ebp, esp
	sub	esp, 24
	cmp	DWORD PTR [ebp+8], 1
	jne	L10
	cmp	DWORD PTR [ebp+12], 65535
	jne	L10
	mov	ecx, OFFSET FLAT:__ZStL8__ioinit
	call	__ZNSt8ios_base4InitC1Ev
	mov	DWORD PTR [esp], OFFSET FLAT:___tcf_0
	call	_atexit
L10:
	nop
	leave
	ret
	.def	__GLOBAL__sub_I_main;	.scl	3;	.type	32;	.endef
__GLOBAL__sub_I_main:
	push	ebp
	mov	ebp, esp
	sub	esp, 24
	mov	DWORD PTR [esp+4], 65535
	mov	DWORD PTR [esp], 1
	call	__Z41__static_initialization_and_destruction_0ii
	leave
	ret
	.section	.ctors,"w"
	.align 4
	.long	__GLOBAL__sub_I_main
	.ident	"GCC: (tdm-1) 5.1.0"
	.def	__ZNSirsERi;	.scl	2;	.type	32;	.endef
	.def	__ZNKSt9basic_iosIcSt11char_traitsIcEEcvbEv;	.scl	2;	.type	32;	.endef
	.def	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;	.scl	2;	.type	32;	.endef
	.def	__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEPFRSoS_E;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEi;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitD1Ev;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitC1Ev;	.scl	2;	.type	32;	.endef
	.def	_atexit;	.scl	2;	.type	32;	.endef
