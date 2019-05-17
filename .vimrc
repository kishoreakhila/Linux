set background=dark
set number
set wrap
set wildmenu
set showmatch
set ruler
set showcmd
set cursorline
colorscheme solarized
" move vertically by visual line (don't skip wrapped lines)
nmap j gj
nmap k gk
if has("autocmd")
  au BufReadPost * if line("'\"") > 1 && line("'\"") <= line("$") | exe "normal! g'\"" | endif
endif
