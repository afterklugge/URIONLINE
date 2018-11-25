	.file	"p18.cpp"
	.intel_syntax noprefix
	.section .rdata,"dr"
__ZStL19piecewise_construct:
	.space 1
.lcomm __ZStL8__ioinit,1,1
	.def	___main;	.scl	2;	.type	32;	.endef
LC0:
	.ascii "a: \0"
LC1:
	.ascii "b: \0"
LC2:
	.ascii "sum(\0"
LC3:
	.ascii ", \0"
LC4:
	.ascii ") = \0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
	lea	ecx, [esp+4]
	and	esp, -16
	push	DWORD PTR [ecx-4]
	push	ebp
	mov	ebp, esp
	push	edi
	push	esi
	push	ebx
	push	ecx
	sub	esp, 56
	call	___main
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC0
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4cout
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	lea	eax, [ebp-40]
	mov	DWORD PTR [esp], eax
	mov	ecx, OFFSET FLAT:__ZSt3cin
	call	__ZNSirsERi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC1
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4cout
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	lea	eax, [ebp-44]
	mov	DWORD PTR [esp], eax
	mov	ecx, OFFSET FLAT:__ZSt3cin
	call	__ZNSirsERi
	sub	esp, 4
	mov	edx, DWORD PTR [ebp-40]
	mov	eax, DWORD PTR [ebp-44]
	cmp	edx, eax
	jle	L9
	lea	eax, [ebp-44]
	mov	DWORD PTR [esp+4], eax
	lea	eax, [ebp-40]
	mov	DWORD PTR [esp], eax
	call	__ZSt4swapIiEvRT_S1_
	jmp	L3
L9:
	nop
L3:
	mov	DWORD PTR [ebp-32], 0
	mov	DWORD PTR [ebp-28], 0
	mov	eax, DWORD PTR [ebp-40]
	mov	DWORD PTR [ebp-36], eax
L4:
	mov	eax, DWORD PTR [ebp-44]
	cmp	DWORD PTR [ebp-36], eax
	jg	L10
	mov	eax, DWORD PTR [ebp-36]
	cdq
	add	DWORD PTR [ebp-32], eax
	adc	DWORD PTR [ebp-28], edx
	add	DWORD PTR [ebp-36], 1
	jmp	L4
L10:
	nop
L6:
	mov	ebx, DWORD PTR [ebp-44]
	mov	esi, DWORD PTR [ebp-40]
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC2
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4cout
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], esi
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC3
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], ebx
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC4
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	ecx, eax
	mov	eax, DWORD PTR [ebp-32]
	mov	edx, DWORD PTR [ebp-28]
	mov	DWORD PTR [esp], eax
	mov	DWORD PTR [esp+4], edx
	call	__ZNSolsEx
	sub	esp, 8
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
	mov	ecx, eax
	call	__ZNSolsEPFRSoS_E
	sub	esp, 4
	mov	edx, DWORD PTR [ebp-40]
	mov	eax, DWORD PTR [ebp-44]
	add	eax, edx
	mov	ecx, eax
	mov	ebx, eax
	sar	ebx, 31
	mov	edx, DWORD PTR [ebp-44]
	mov	eax, DWORD PTR [ebp-40]
	sub	edx, eax
	mov	eax, edx
	add	eax, 1
	cdq
	mov	edi, ebx
	imul	edi, eax
	mov	esi, edx
	imul	esi, ecx
	add	esi, edi
	mul	ecx
	lea	ecx, [esi+edx]
	mov	edx, ecx
	mov	ecx, edx
	shr	ecx, 31
	mov	ebx, 0
	add	eax, ecx
	adc	edx, ebx
	shrd	eax, edx, 1
	sar	edx
	mov	DWORD PTR [ebp-32], eax
	mov	DWORD PTR [ebp-28], edx
	mov	ebx, DWORD PTR [ebp-44]
	mov	esi, DWORD PTR [ebp-40]
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC2
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4cout
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], esi
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC3
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	DWORD PTR [esp], ebx
	mov	ecx, eax
	call	__ZNSolsEi
	sub	esp, 4
	mov	DWORD PTR [esp+4], OFFSET FLAT:LC4
	mov	DWORD PTR [esp], eax
	call	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc
	mov	ecx, eax
	mov	eax, DWORD PTR [ebp-32]
	mov	edx, DWORD PTR [ebp-28]
	mov	DWORD PTR [esp], eax
	mov	DWORD PTR [esp+4], edx
	call	__ZNSolsEx
	sub	esp, 8
	mov	DWORD PTR [esp], OFFSET FLAT:__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_
	mov	ecx, eax
	call	__ZNSolsEPFRSoS_E
	sub	esp, 4
	mov	eax, 0
	lea	esp, [ebp-16]
	pop	ecx
	pop	ebx
	pop	esi
	pop	edi
	pop	ebp
	lea	esp, [ecx-4]
	ret
	.section	.text$_ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_,"x"
	.linkonce discard
	.globl	__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	.def	__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_;	.scl	2;	.type	32;	.endef
__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_:
	push	ebp
	mov	ebp, esp
	mov	eax, DWORD PTR [ebp+8]
	pop	ebp
	ret
	.section	.text$_ZSt4swapIiEvRT_S1_,"x"
	.linkonce discard
	.globl	__ZSt4swapIiEvRT_S1_
	.def	__ZSt4swapIiEvRT_S1_;	.scl	2;	.type	32;	.endef
__ZSt4swapIiEvRT_S1_:
	push	ebp
	mov	ebp, esp
	sub	esp, 20
	mov	eax, DWORD PTR [ebp+8]
	mov	DWORD PTR [esp], eax
	call	__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	mov	eax, DWORD PTR [eax]
	mov	DWORD PTR [ebp-4], eax
	mov	eax, DWORD PTR [ebp+12]
	mov	DWORD PTR [esp], eax
	call	__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	mov	edx, DWORD PTR [eax]
	mov	eax, DWORD PTR [ebp+8]
	mov	DWORD PTR [eax], edx
	lea	eax, [ebp-4]
	mov	DWORD PTR [esp], eax
	call	__ZSt4moveIRiEONSt16remove_referenceIT_E4typeEOS2_
	mov	edx, DWORD PTR [eax]
	mov	eax, DWORD PTR [ebp+12]
	mov	DWORD PTR [eax], edx
	nop
	leave
	ret
	.text
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
	jne	L17
	cmp	DWORD PTR [ebp+12], 65535
	jne	L17
	mov	ecx, OFFSET FLAT:__ZStL8__ioinit
	call	__ZNSt8ios_base4InitC1Ev
	mov	DWORD PTR [esp], OFFSET FLAT:___tcf_0
	call	_atexit
L17:
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
	.def	__ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc;	.scl	2;	.type	32;	.endef
	.def	__ZNSirsERi;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEi;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEx;	.scl	2;	.type	32;	.endef
	.def	__ZSt4endlIcSt11char_traitsIcEERSt13basic_ostreamIT_T0_ES6_;	.scl	2;	.type	32;	.endef
	.def	__ZNSolsEPFRSoS_E;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitD1Ev;	.scl	2;	.type	32;	.endef
	.def	__ZNSt8ios_base4InitC1Ev;	.scl	2;	.type	32;	.endef
	.def	_atexit;	.scl	2;	.type	32;	.endef
