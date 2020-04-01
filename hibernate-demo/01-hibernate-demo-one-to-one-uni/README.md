# One To One Uni-directional
- 1 instructor have 1 instructor detail
- instructor --> instructor detail
- delete instructor --> delete instructor_detail (@OneToOne(cascade = CascadeType.ALL))